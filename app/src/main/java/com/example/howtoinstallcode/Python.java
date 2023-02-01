package com.example.howtoinstallcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Python extends AppCompatActivity {

    private TextView first, second, third, forth, fifth,
            sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        relativeLayout = findViewById(R.id.parentPython);
        first = findViewById(R.id.firstpy);
        second = findViewById(R.id.secondpy);
        third = findViewById(R.id.thirdpy);
        forth = findViewById(R.id.forthpy);
        fifth = findViewById(R.id.fifthpy);
        sixth = findViewById(R.id.sixthpy);
        seventh = findViewById(R.id.seventhpy);
        eighth = findViewById(R.id.eighthpy);
        ninth = findViewById(R.id.ninthpy);
        tenth = findViewById(R.id.tenthpy);
        eleventh = findViewById(R.id.eleventhpy);
        twelfth = findViewById(R.id.twelfthpy);
        thirteenth = findViewById(R.id.thirteenthpy);

        ui();
        
    }

    public void ui() {
        first.setText(R.string.firstpy);
        second.setText(R.string.secondpy);
        third.setText(R.string.thirdpy);
        forth.setText(R.string.forthpy);
        fifth.setText(R.string.fifthpy);
        sixth.setText(R.string.sixthpy);
        seventh.setText(R.string.seventhpy);
        eighth.setText(R.string.eigthpy);
        ninth.setText(R.string.ninthpy);
        tenth.setText(R.string.tenthpy);
        eleventh.setText(R.string.eleventhpy);
        twelfth.setText(R.string.twelvethpy);
        thirteenth.setText(R.string.thirteenthpy);
    }
}