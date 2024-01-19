package com.example.howtoinstallcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.howtoinstallcode.codeclass.Datum;
import com.example.howtoinstallcode.codeclass.Response;
import com.example.howtoinstallcode.handler.APIInterface;
import com.example.howtoinstallcode.handler.APIClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private ImageView cpp, c, cSharp, ruby, git, html, java, python, javascript, rpl;
    public ImageView [] imageViews = new ImageView[0];
    public Map<ImageView, Object> lists = new HashMap<>();

    private APIInterface apiInterface;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<Response> call = apiInterface.getJson();
        call.enqueue(new Callback<Response>() {

            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response response1 = response.body();
                Log.d("TAG", "onResponse: " + response1.getMessage());

                int status = response1.getStatus();
                String message = response1.getMessage();
                List<Datum> data = response1.getData();
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                call.cancel();
            }
        })

        GridView gridView = findViewById(R.id.gridView);



    }

}