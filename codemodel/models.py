from django.db import models

# Create your models here.
class FrontButton(models.Model):
    name = models.CharField(max_length=100)
    url = models.CharField(max_length=100)
    image = models.ImageField(upload_to='asset/images/', blank=True, null=True)

    def __str__(self):
        return self.name

class InsideFragment(models.Model):
    frontbutton = models.ForeignKey(FrontButton, on_delete=models.CASCADE)
    nomor = models.IntegerField(default=-1)
    url = models.CharField(max_length=100, blank=True, null=True)
    image = models.ImageField(upload_to='asset/images/', blank=True, null=True)
    title = models.TextField()

class Definition(models.Model):
    definition = models.TextField()
    image = models.ImageField(upload_to='asset/images/', blank=True, null=True)
    url_image = models.CharField(max_length=100, blank=True, null=True)
    front_button = models.ForeignKey(FrontButton, on_delete=models.CASCADE)


