package com.talleres.proyectotalleresandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.talleres.proyectotalleresandroid.Utilerias.Preference;

public class LoginActivity extends AppCompatActivity {

    EditText etUsuario,etContrasena;
    Button btnIniciar;
    Preference oPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = findViewById(R.id.etUsuario);
        etContrasena = findViewById(R.id.etContrasena);
        btnIniciar = findViewById(R.id.btnIniciar);
        oPreference = new Preference(getApplicationContext());


        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oPreference.setNombre(etUsuario.getText().toString());
                oPreference.setContrasena(etContrasena.getText().toString());
                Intent intent = new Intent(getApplication(), MainActivityJava.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("TextoUsuario",  etUsuario.getText().toString());
                intent.putExtra("textoContrasena",  etContrasena.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}
