package com.rinndp.misaficiones.fr.aficiones;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.rinndp.misaficiones.R;
import com.rinndp.misaficiones.TiposMusica;

public class Musica extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_musica, container, false);

        Button musicaBoton = view.findViewById(R.id.musicaBoton);
        musicaBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTiposMusica = new Intent(getActivity(), TiposMusica.class);
                startActivity(intentTiposMusica);
            }
        });
        return view;
    }
}
