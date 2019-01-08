package com.example.aman.tourist_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        android.widget.TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText("abcd@gmail.com");
    }
}
