package com.example.howtoinstallcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ImageView cpp, c, cSharp, ruby, git, html, java, python, javascript, rpl;
    public ImageView [] imageViews = new ImageView[0];
    public Map<ImageView, Object> lists = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpp = findViewById(R.id.cpp);
        c = findViewById(R.id.c);
        cSharp = findViewById(R.id.csharp);
        ruby = findViewById(R.id.ruby);
        git = findViewById(R.id.git);
        html = findViewById(R.id.html);
        java = findViewById(R.id.java);
        python = findViewById(R.id.python);
        javascript = findViewById(R.id.javascript);
        rpl = findViewById(R.id.rpl);

        setImageViews();

        lists.put(cpp, CPP.class);
        lists.put(c, C.class);
        lists.put(cSharp, CSharp.class);
        lists.put(ruby, Ruby.class);
        lists.put(git, GIT.class);
        lists.put(html, HTML.class);
        lists.put(java, Java.class);
        lists.put(python, Python.class);
        lists.put(javascript, JavaScript.class);
        lists.put(rpl, RProgrammingLanguage.class);


        onclick();

    }

    public void setImageViews() {
        cpp.setImageResource(R.drawable.cpp);
        c.setImageResource(R.drawable.c);
        cSharp.setImageResource(R.drawable.csharp);
        git.setImageResource(R.drawable.git);
        ruby.setImageResource(R.drawable.ruby);
        html.setImageResource(R.drawable.html);
        java.setImageResource(R.drawable.java);
        python.setImageResource(R.drawable.py);
        javascript.setImageResource(R.drawable.js);
        rpl.setImageResource(R.drawable.rplang);
    }

    public void onclick() {

        for (Map.Entry<ImageView, Object> i : lists.entrySet()) {
            i.getKey().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent((Context) MainActivity.this, (Class<?>) i.getValue());
                    startActivity(intent);
                }
            });
        }

    }



}