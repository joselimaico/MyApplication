package com.example.root.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);
        Intent intent = getIntent();
    }

    public void cargarHistoria(View view){
        Intent intent = new Intent(this, ControlHistoria.class);
        startActivity(intent);
    }
    public void cargarDetalles(View view){
        Intent intent = new Intent(this, ControlDetalles.class);
        startActivity(intent);
    }

    public void cargarContacto(View view){
        Intent intent = new Intent(this, ControlContacto.class);
        startActivity(intent);
    }

}
