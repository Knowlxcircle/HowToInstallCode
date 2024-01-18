from django.urls import path, include
from .views import FrontButtonList

urlpatterns = [
    path("", FrontButtonList.as_view(), name="frontbutton-list"),
]
