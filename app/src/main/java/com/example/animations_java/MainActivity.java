package com.example.animations_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_bounce,btn_seqentual,btn_togather;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        btn_bounce = findViewById(R.id.bounce);
        btn_seqentual = findViewById(R.id.seqentual);
        btn_togather = findViewById(R.id.togather);
        image = findViewById(R.id.image);

        btn_seqentual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.seqentual);
                image.startAnimation(animation);
            }
        });

        btn_bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                image.startAnimation(animation);
            }
        });

        btn_togather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.togather);
                image.startAnimation(animation);
            }
        });



    }
}