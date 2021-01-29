package com.hjh.firebaselistexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hjh.firebaselistexample.databinding.FragTestBinding;

public class TestFragment extends Fragment {

    private FragTestBinding fBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fBinding = FragTestBinding.inflate(inflater, container, false);
        fBinding.btnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fBinding.tvTest.setText("홍드로이드 프래그먼트 클릭");
            }
        });
        return fBinding.getRoot();
    }
}
