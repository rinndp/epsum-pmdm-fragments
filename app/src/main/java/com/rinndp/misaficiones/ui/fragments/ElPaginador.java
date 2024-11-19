package com.rinndp.misaficiones.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rinndp.misaficiones.R;
import com.rinndp.misaficiones.fr.aficiones.Comer;
import com.rinndp.misaficiones.fr.aficiones.Dormir;


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
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                posicion = 0;
                return new Comer();
            case 1:
                posicion = 1;
                return new Dormir();
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
