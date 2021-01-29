package com.hjh.firebaselistexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragWendesDay extends Fragment {

    private View view;

    public static FragWendesDay newInstance(){
        FragWendesDay fragWendesDay = new FragWendesDay();
        return fragWendesDay;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_wedenday,container,false);

        return view;
    }
}
