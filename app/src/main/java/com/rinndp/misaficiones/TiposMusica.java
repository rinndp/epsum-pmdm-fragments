package com.rinndp.misaficiones;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.rinndp.misaficiones.ui.fragments.ElPaginadorTiposMusica;
import com.rinndp.misaficiones.databinding.ActivityTiposMusicaBinding;

public class TiposMusica extends AppCompatActivity {

    private ActivityTiposMusicaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTiposMusicaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ElPaginadorTiposMusica elPaginadorTiposMusica = new ElPaginadorTiposMusica(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(elPaginadorTiposMusica);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        
    }
}