package com.example.aman.tourist_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class india_gate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_gate);
        WebView myWebView = (WebView) findViewById(R.id.wb4);
        myWebView.loadUrl("http://www.humayunstomb.com/");
    }
}
