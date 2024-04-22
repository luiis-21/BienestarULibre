package com.example.intentovacio.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.intentovacio.R;


public class Login extends AppCompatActivity {

    EditText correo,clave;
    private Button material;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        correo = findViewById(R.id.correo);
        clave = findViewById(R.id.clave);
        material = findViewById(R.id.material);
        material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, MainActivity.class));

                //bdd myDB = new bdd(Login.this);
                //myDB.añadir_usuario(correo.getText().toString().trim(), clave.getText().toString().trim());

            }
        });

    }
}