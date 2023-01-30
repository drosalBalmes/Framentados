package com.example.framentados;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.framentados.usuari.adapterUsuari;
import com.example.framentados.usuari.email;

import java.util.ArrayList;


    public class FragmentList extends Fragment {
        RecyclerView recyclerView;
        ArrayList<email> correus;
        View view;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.fragment_list, container, false);
            ompleLlista();
            return view;
        }

        public void ompleLlista() {

            correus = new ArrayList<>();
            correus.add(new email("a@gmail.com"));
            correus.add(new email("b@gmail.com"));
            correus.add(new email("c@gmail.com"));
            correus.add(new email("d@gmail.com"));
            correus.add(new email("e@gmail.com"));
            correus.add(new email("f@gmail.com"));
            correus.add(new email("g@gmail.com"));
            correus.add(new email("h@gmail.com"));
            correus.add(new email("i@gmail.com"));
            correus.add(new email("j@gmail.com"));
            correus.add(new email("k@gmail.com"));
            correus.add(new email("l@gmail.com"));
            correus.add(new email("m@gmail.com"));
            correus.add(new email("n@gmail.com"));
            correus.add(new email("o@gmail.com"));

            adapterUsuari adapterUsuari = new adapterUsuari(correus, getContext());

            recyclerView = (RecyclerView) view.findViewById(R.id.recyclerviewEMAILS);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            adapterUsuari.setOnclickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), correus.get(recyclerView.getChildAdapterPosition(v)).getGmail(), Toast.LENGTH_SHORT).show();

                    Intent change = new Intent(getActivity(), DetallActivity.class);
                    change.putExtra("correu", correus.get(recyclerView.getChildAdapterPosition(v)));
                    startActivity(change);
                }
            });

            recyclerView.setAdapter(adapterUsuari);


        }
    }
