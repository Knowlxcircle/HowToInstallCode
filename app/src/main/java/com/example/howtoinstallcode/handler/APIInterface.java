package com.example.howtoinstallcode.handler;

import com.example.howtoinstallcode.codeclass.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/")
    Call<Response> getJson();
}
