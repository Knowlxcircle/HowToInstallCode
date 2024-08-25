package com.example.howtoinstallcode.handler;

import com.example.howtoinstallcode.codeclass.Howtoinstallcode;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/")
    Call<Howtoinstallcode> getJson();
}
