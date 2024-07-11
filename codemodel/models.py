from django.db import models
import os

# Create your models here.
def lowercase_filename(instance, filename):
    # Get the file extension
    ext = filename.split('.')[-1]

    # Generate a new filename in lowercase
    new_filename = f"{instance.program_name.lower()}.{ext}"

    # Return the new path
    return os.path.join('app/src/main/res/drawable', new_filename)

class FrontButton(models.Model):
    name = models.CharField(max_length=100)
    program_name = models.CharField(max_length=100, null=True, blank=True)
    url = models.CharField(max_length=100)
    image = models.ImageField(upload_to=lowercase_filename, blank=True, null=True)
    
    def save(self, *args, **kwargs):
        # Convert logo_name to lowercase before saving
        if self.program_name:
            self.program_name = self.program_name.lower()

        # Call the original save method
        super(FrontButton, self).save(*args, **kwargs)

    def __str__(self):
        return self.name

class InsideFragment(models.Model):
    frontbutton = models.ForeignKey(FrontButton, on_delete=models.CASCADE)
    program_name = models.CharField(max_length=100, blank=True, null=True)
    nomor = models.IntegerField(default=-1)
    url = models.CharField(max_length=100, blank=True, null=True)
    image = models.ImageField(upload_to=lowercase_filename, blank=True, null=True)
    title = models.TextField()

    def save(self, *args, **kwargs):
        # Convert logo_name to lowercase before saving
        if self.program_name:
            self.program_name = self.program_name.lower()

        # Call the original save method
        super(InsideFragment, self).save(*args, **kwargs)

class Definition(models.Model):
    definition = models.TextField()
    program_name = models.CharField(max_length=100, blank=True, null=True)
    image = models.ImageField(upload_to=lowercase_filename, blank=True, null=True)
    url_image = models.CharField(max_length=100, blank=True, null=True)
    front_button = models.ForeignKey(FrontButton, on_delete=models.CASCADE)

    def save(self, *args, **kwargs):
        # Convert logo_name to lowercase before saving
        if self.program_name:
            self.program_name = self.program_name.lower()

        # Call the original save method
        super(Definition, self).save(*args, **kwargs)


