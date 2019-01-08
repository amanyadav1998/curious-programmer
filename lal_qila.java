package com.example.aman.tourist_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class lal_qila extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lal_qila);
        WebView myWebView = (WebView) findViewById(R.id.wb2);
        myWebView.loadUrl("https://www.mapsofindia.com/my-india/travel/dilli-ka-lal-qila");

    }
}
