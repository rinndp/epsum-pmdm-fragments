package com.rinndp.misaficiones;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.rinndp.misaficiones.databinding.ActivitySobreMiBinding;
import com.rinndp.misaficiones.ui.fragments.ElPaginadorSobreMi;

public class SobreMi extends AppCompatActivity {

    private ActivitySobreMiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySobreMiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ElPaginadorSobreMi elPaginadorSobreMi = new ElPaginadorSobreMi(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;

        viewPager.setAdapter(elPaginadorSobreMi);
    }
}