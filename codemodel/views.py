from django.shortcuts import render
from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import status
from .models import FrontButton, InsideFragment, Definition
from .serializers import FrontButtonSerializer, InsideFragmentSerializer, DefinitionSerializer

# Create your views here.
class FrontButtonList(APIView):
    def get(self, request):
        try:
            data = []
            frontbutton = FrontButton.objects.all()
            for i in frontbutton:
                serializer = FrontButtonSerializer(i).data
                definition = Definition.objects.filter(front_button=i)
                inside_fragment = InsideFragment.objects.filter(frontbutton=i)
                serializer_inside_fragment = InsideFragmentSerializer(inside_fragment, many=True).data
                serializer_definition = DefinitionSerializer(definition, many=True).data
                if len(definition) > 0:
                    serializer['definition'] = serializer_definition
                if len(inside_fragment) > 0:
                    serializer['inside_fragment'] = serializer_inside_fragment
                # data[i.name] = serializer
                data.append(serializer)

            return Response({
                'status': status.HTTP_200_OK,
                'message': "sukses",
                'data': data,
            },status=status.HTTP_200_OK)
        except FrontButton.DoesNotExist:
            return Response(status=status.HTTP_404_NOT_FOUND)
        except Exception:
            return Response(status=status.HTTP_500_INTERNAL_SERVER_ERROR)

