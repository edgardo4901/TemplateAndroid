package com.talleres.proyectotalleresandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;
import com.talleres.proyectotalleresandroid.Utilerias.Preference;

public class MainActivityJava extends Activity {
    ImageView imguno;
    TextView nombreusuario, nombrecontrasena;
    String usuario,contrasena;
    Preference oPreference;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oPreference = new Preference(getApplicationContext());
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        nombreusuario = findViewById(R.id.txtNombreUsuario);
        nombrecontrasena = findViewById(R.id.txtNombrePassword);
        if(b!=null)
        {
            usuario = (String) b.get("TextoUsuario");
            contrasena = (String) b.get("textoContrasena");
        }
        else{
            usuario = oPreference.getNombre();
            contrasena = oPreference.getContrasena();
        }
        nombreusuario.setText(usuario);
        nombrecontrasena.setText(contrasena);

        imguno = findViewById(R.id.imgUno);


        Picasso.with(getApplicationContext()).load("https://www.logaster.com.es/blog/wp-content/uploads/sites/4/2019/01/4-min-620x350.jpg")
                .into(imguno);
    }
}
