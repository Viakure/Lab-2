package com.example.taller2utem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView etiqueta;
    EditText campoNombre, campoCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etiqueta = (TextView) findViewById(R.id.textView);
        campoNombre = (EditText) findViewById(R.id.nombre);
        campoCorreo = (EditText) findViewById(R.id.etCorreo);
    }

    public void enviar (View view) {
        String nombre = campoNombre.getText().toString();
        String correo = campoCorreo.getText().toString();
        if (nombre.length() == 0) {
            Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        else if (correo.length() == 0) {
            Toast.makeText(this, "Debes ingresar un correo", Toast.LENGTH_LONG).show();
        } else {
            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("dato", nombre);
            startActivity(i);
            finish();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("MainActivity", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("MainActivity", "onDestroy");
    }
}