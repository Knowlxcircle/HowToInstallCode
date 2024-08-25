from django.urls import path, include
from .views import FrontButtonList, DefinitionView

urlpatterns = [
    path("", FrontButtonList.as_view(), name="frontbutton-list"),
    path("api/<int:id>/", DefinitionView.as_view(), name="definition-list"),
]
