package com.rinndp.misaficiones.ui.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rinndp.misaficiones.fr.aficiones.ActividadFisica;
import com.rinndp.misaficiones.fr.aficiones.Musica;


public class ElPaginador extends FragmentPagerAdapter {

    private final Context mContext;
    private int posicion;

    public ElPaginador (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                posicion = 0;
                return new ActividadFisica();
            case 1:
                posicion = 1;
                return new Musica();
            default:
                return null;
        }
    }

    public int getPosition () {
        return posicion;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
