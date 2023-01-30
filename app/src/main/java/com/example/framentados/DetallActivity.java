package com.example.framentados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.framentados.usuari.email;

public class DetallActivity extends AppCompatActivity {

    Fragment correus;
    Fragment missatge;

    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detall);


        datos = getIntent().getExtras();
        email email= (email) datos.get("correu");


        correus = new FragmentList();
        missatge = new FragmentDetall();


        getIntent().putExtra("correu",email);


        getSupportFragmentManager().beginTransaction().add(R.id.correusFL,correus).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.detallFragment,missatge).commit();


    }
}