package com.example.aman.tourist_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Delhi extends AppCompatActivity {
    Button b1, b2;
    ImageButton imgb7, imgb2, imgb3, imgb4, imgb5, imgb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
        imgb7 = (ImageButton) findViewById(R.id.imgb7);
        imgb2 = (ImageButton) findViewById(R.id.imgb2);
        imgb3 = (ImageButton) findViewById(R.id.imgb3);
        imgb4 = (ImageButton) findViewById(R.id.imgb4);
        imgb5 = (ImageButton) findViewById(R.id.imgb5);
        imgb6 = (ImageButton) findViewById(R.id.imgb6);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);

        imgb7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Delhi.this, lotus_temple.class);
                startActivity(i);
            }
        });


        imgb2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Delhi.this, qutub_minar.class);
                startActivity(i);


            }
        });


        imgb3 = (ImageButton) findViewById(R.id.imgb3);
        imgb3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Delhi.this, humayun_tomb.class);
                startActivity(i);

            }
        });


        imgb6 = (ImageButton) findViewById(R.id.imgb6);
        imgb6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Delhi.this, india_gate.class);
                startActivity(i);

            }
        });


        imgb4 = (ImageButton) findViewById(R.id.imgb4);
        imgb4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Delhi.this, lotus_temple.class);
                startActivity(i);

            }
        });


        imgb5 = (ImageButton) findViewById(R.id.imgb5);
        imgb5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Delhi.this, lotus_temple.class);
                startActivity(i);

            }
        });
        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Delhi.this, about.class);
                startActivity(i);


            }
        });
        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Delhi.this, contact.class);
                startActivity(i);

            }
        });
    }
}