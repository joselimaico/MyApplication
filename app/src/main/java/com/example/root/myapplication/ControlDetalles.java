package com.example.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ControlDetalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_detalles);
        WebView myWebView = (WebView) this.findViewById(R.id.webViewDetalles);
        myWebView.loadUrl("https://es.wikipedia.org/wiki/Escuela_Polit%C3%A9cnica_Nacional");
    }
}
