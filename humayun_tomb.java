package com.example.aman.tourist_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class humayun_tomb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humayun_tomb);
        WebView myWebView = (WebView) findViewById(R.id.wb4);
        myWebView.loadUrl("http://www.humayunstomb.com/");
    }
}
