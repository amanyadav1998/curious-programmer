package com.example.aman.tourist_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class qutub_minar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qutub_minar);
        WebView myWebView = (WebView) findViewById(R.id.wb6);
        myWebView.loadUrl("http://www.delhitourism.gov.in/delhitourism/tourist_place/qutab_minar.jsp");

    }
}
