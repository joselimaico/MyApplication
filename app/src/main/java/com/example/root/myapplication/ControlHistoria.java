package com.example.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ControlHistoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_historia);
        WebView myWebView = (WebView) this.findViewById(R.id.webViewHistoria);
        myWebView.loadUrl("http://www.epn.edu.ec/institucion/sintesis-historica/");
    }
}
