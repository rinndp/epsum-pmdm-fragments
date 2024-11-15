package com.rinndp.misaficiones.ui.fragments;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rinndp.misaficiones.fr.aficiones.Comer;
import com.rinndp.misaficiones.fr.aficiones.Dormir;


public class ElPaginador extends FragmentPagerAdapter {

    private final Context mContext;

    public ElPaginador (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Comer();
            case 1:
                return new Dormir();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
