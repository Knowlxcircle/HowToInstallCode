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
import com.example.howtoinstallcode.codeclass.Howtoinstallcode;
import com.example.howtoinstallcode.handler.APIInterface;
import com.example.howtoinstallcode.handler.APIClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private List<Datum> data = new ArrayList<>();

    private APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<Howtoinstallcode> call = apiInterface.getJson();

        GridView gridView = findViewById(R.id.gridView);
        call.enqueue(new Callback<Howtoinstallcode>() {

            @Override
            public void onResponse(Call<Howtoinstallcode> call, retrofit2.Response<Howtoinstallcode> response) {
                Howtoinstallcode response1 = response.body();
                Log.d("TAG", "onResponse: " + response1.getMessage());
                Log.d("TAG", "onResponse: " + response1.getStatus());
                Log.d("TAG", "onResponse: " + response1.getData());

                int status = response1.getStatus();
                String message = response1.getMessage();
                List<Datum> data = response1.getData();

                AdapterFragment adapterFragment = new AdapterFragment(MainActivity.this, data);

                gridView.setAdapter(adapterFragment);

            }

            @Override
            public void onFailure(Call<Howtoinstallcode> call, Throwable t) {
                call.cancel();
            }
        });






    }

}