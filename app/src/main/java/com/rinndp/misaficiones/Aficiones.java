package com.rinndp.misaficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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

public class Aficiones extends AppCompatActivity {

    private ActivityAficionesBinding binding;
    ElPaginador elPaginador = new ElPaginador(this, getSupportFragmentManager());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAficionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button musicaBoton = findViewById(R.id.musicaBoton);

        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(elPaginador);

        musicaBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchTiposMusica();
            }
        });

    }

    public void launchTiposMusica() {
        Intent intentTiposMusica = new Intent(this, TiposMusica.class);
        startActivity(intentTiposMusica);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Bundle bundle = new Bundle();
        if (id == R.id.favButton) {
            Toast toast = Toast.makeText(this, "olacaracola", Toast.LENGTH_SHORT);
            toast.show();

            if (elPaginador.getPosition() == 0) {

            } else {

            }
        }

        if (id == R.id.aboutMeButton) {
            Intent intent = new Intent(Aficiones.this, SobreMi.class);
            intent.putExtras(bundle);
            startActivity (intent);
        }

        if (id == R.id.myCodeButton) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/rinndp/"));

            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}