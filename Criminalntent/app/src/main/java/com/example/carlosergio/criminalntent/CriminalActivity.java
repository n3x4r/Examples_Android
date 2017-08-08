package com.example.carlosergio.criminalntent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class CriminalActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);



        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container); // obtiene el fragmente si ya esta desplegado en la vista

        if(fragment==null){ //Verifica si el fragmente se encuentra desplegado
            fragment = new CrimeFragment(); // caso contrario se crea una instancia del fragment
            // y se asocia el fragmento a la vista con ID
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

    }

    }

