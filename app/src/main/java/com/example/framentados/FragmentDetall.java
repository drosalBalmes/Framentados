package com.example.framentados;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.framentados.usuari.email;


public class FragmentDetall extends Fragment {

    TextView missatge;
    email correu;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista =inflater.inflate(R.layout.fragment_detall, container, false);

        missatge = (TextView) vista.findViewById(R.id.msgTextTV);


        Intent i = getActivity().getIntent();
        correu = (email) i.getSerializableExtra("correu");

        String a = correu.getMissatge();
        missatge.setText(a);
        missatge.setMovementMethod(new ScrollingMovementMethod());



        return vista;
    }
}