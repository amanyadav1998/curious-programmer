package com.example.aman.tourist_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class akshardham extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akshardham);
        WebView myWebView = (WebView) findViewById(R.id.wb3);
        myWebView.loadUrl("http://https://akshardham.com/");

    }
}
