package com.talleres.proyectotalleresandroid.Utilerias;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference {

    private final String SHARED_PREFS_FILE = "HMPrefs";

    private final String Nombre = "nombreusuariotalleres";
    private final String Contrasena = "contrasenausuariotalleres";

    private Context mContext;

    public Preference(Context context){
        mContext = context;
    }

    private SharedPreferences getSettings(){
        return mContext.getSharedPreferences(SHARED_PREFS_FILE, 0);
    }
    public String getNombre() {
        return getSettings().getString(Nombre, null);
    }
    public void setNombre(String prNombre){
        SharedPreferences.Editor editor = getSettings().edit();
        editor.putString(Nombre, prNombre);
        editor.commit();
    }
    public String getContrasena() {
        return getSettings().getString(Contrasena, null);
    }
    public void setContrasena(String prContrasena){
        SharedPreferences.Editor editor = getSettings().edit();
        editor.putString(Contrasena, prContrasena);
        editor.commit();
    }
}
