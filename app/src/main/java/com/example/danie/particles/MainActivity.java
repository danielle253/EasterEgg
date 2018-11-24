package com.example.danie.particles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageButton;

import com.plattysoft.leonids.Particle;
import com.plattysoft.leonids.ParticleSystem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<ImageButton> buttons = new ArrayList<ImageButton>();
    ImageButton rain;
    ImageButton sun;
    ImageButton tree;
    ImageButton pumpkin;
    ImageButton snow;
    ImageButton heart;

    Button invisButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rain = findViewById(R.id.rain);
        sun = findViewById(R.id.sun);
        tree = findViewById(R.id.tree);
        pumpkin = findViewById(R.id.pumpkin);
        snow = findViewById(R.id.snow);
        heart = findViewById(R.id.heart);

        invisButton = findViewById(R.id.button);
        rain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rain(v);
            }
        });

        sun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sun(v);
            }
        });

        tree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tree();
            }
        });

        pumpkin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                pumpkin();
            }
        });

        snow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                snow();
            }
        });

        heart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                valentines();
            }
        });
    }
    

    public void rain(View v){
        new ParticleSystem(MainActivity.this, 80, R.drawable.raindrop, 10000)
                .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                .setAcceleration(0.00005f, 90)
                .emitWithGravity(invisButton, Gravity.BOTTOM, 8, 5000);

    }

    public void sun(View v){
        new ParticleSystem(MainActivity.this, 80, R.drawable.sun, 10000)
                .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                .setAcceleration(0.00005f, 90)
                .emitWithGravity(invisButton, Gravity.BOTTOM, 8, 5000);
    }

    public void tree(){
        new ParticleSystem(MainActivity.this, 80, R.drawable.tree, 10000)
                .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                .setAcceleration(0.00005f, 90)
                .emitWithGravity(invisButton, Gravity.BOTTOM, 8, 5000);
    }

    public void pumpkin(){
        new ParticleSystem(MainActivity.this, 80, R.drawable.pumpkin, 10000)
                .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                .setAcceleration(0.00005f, 90)
                .emitWithGravity(invisButton, Gravity.BOTTOM, 8, 5000);

    }

    public void snow(){
        new ParticleSystem(MainActivity.this, 80, R.drawable.snow, 10000)
                .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                .setAcceleration(0.00005f, 90)
                .emitWithGravity(invisButton, Gravity.BOTTOM, 8, 5000);

    }

    public void valentines(){
        new ParticleSystem(MainActivity.this, 40, R.drawable.rose, 10000)
                .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                .setAcceleration(0.00005f, 90)
                .emitWithGravity(invisButton, Gravity.BOTTOM, 8, 5000);

        new ParticleSystem(MainActivity.this, 40, R.drawable.heart, 10000)
                .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                .setAcceleration(0.00005f, 90)
                .emitWithGravity(invisButton, Gravity.BOTTOM, 8, 5000);

    }

}
