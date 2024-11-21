package com.rinndp.misaficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.rinndp.misaficiones.databinding.ActivityAficionesBinding;
import com.rinndp.misaficiones.ui.fragments.ElPaginador;
import com.rinndp.misaficiones.ui.fragments.ElPaginadorSobreMi;
import com.rinndp.misaficiones.ui.fragments.ElPaginadorTiposMusica;

public class Aficiones extends AppCompatActivity {

    private ActivityAficionesBinding binding;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAficionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ElPaginador elPaginador = new ElPaginador(this, getSupportFragmentManager());

        viewPager = binding.viewPager;
        viewPager.setAdapter(elPaginador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.favButton) {
            Bundle outState = new Bundle();
            onSaveInstanceState(outState);
            Toast toast = Toast.makeText(this, "El fragment se ha guardado - ID: "+viewPager.getCurrentItem(), Toast.LENGTH_SHORT);
            toast.show();
        }

        if (id == R.id.aboutMeButton) {
            Intent intent = new Intent(Aficiones.this, SobreMi.class);
            startActivity (intent);
        }

        if (id == R.id.myCodeButton) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/rinndp/"));

            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        TextView textViewActividadFisica = findViewById(R.id.textoActividadFisica);
        TextView textViewMusica = findViewById(R.id.textoMusica);
        Button buttonMusica = findViewById(R.id.musicaBoton);

        if (viewPager.getCurrentItem() == 0) {
            outState.putString("textViewGuardado", textViewActividadFisica.getText().toString());
        } else {
            outState.putString("textViewGuardado", textViewMusica.getText().toString());
            outState.putInt("estadoBotonGuardado", buttonMusica.getVisibility());
        }
    }

}