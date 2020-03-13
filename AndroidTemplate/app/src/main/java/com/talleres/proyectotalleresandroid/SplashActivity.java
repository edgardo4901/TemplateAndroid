package com.talleres.proyectotalleresandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.talleres.proyectotalleresandroid.Utilerias.Preference;

public class SplashActivity extends AppCompatActivity {
    Preference oPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        oPreference = new Preference(getApplicationContext());

        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(1 * 2000);
                    validarSesion();

                } catch (Exception e) {

                }
            }
        };
        background.start();
    }

    public void validarSesion() {
        Intent intent;
        if(oPreference.getNombre() != null){
            intent = new Intent(getApplicationContext(), MainActivityJava.class);
        }
        else {
            intent = new Intent(getApplicationContext(), LoginActivity.class);
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
        finish();
    }
}
