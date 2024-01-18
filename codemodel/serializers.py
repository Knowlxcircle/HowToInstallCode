from rest_framework import serializers
from .models import FrontButton, InsideFragment, Definition

class FrontButtonSerializer(serializers.ModelSerializer):
    class Meta:
        model = FrontButton
        fields = '__all__'

class InsideFragmentSerializer(serializers.ModelSerializer):
    class Meta:
        model = InsideFragment
        fields = '__all__'

class DefinitionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Definition
        fields = '__all__'