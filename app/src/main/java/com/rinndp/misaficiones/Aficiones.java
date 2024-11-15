package com.rinndp.misaficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.rinndp.misaficiones.databinding.ActivityAficionesBinding;
import com.rinndp.misaficiones.ui.fragments.ElPaginador;

public class Aficiones extends AppCompatActivity {

    private ActivityAficionesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAficionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ElPaginador elPaginador = new ElPaginador(this, getSupportFragmentManager());

        ViewPager viewPager = binding.viewPager;
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
            Toast toast = Toast.makeText(this, "olacaracola", Toast.LENGTH_SHORT);
            toast.show();
        }

        if (id == R.id.aboutMeButton) {
            //Intent intent = new Intent(Aficiones.this, SobreMi.class);
            //startActivity (intent);
        }

        if (id == R.id.myCodeButton) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/rinndp/"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}