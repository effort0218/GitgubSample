package com.hjh.firebaselistexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class FragmentBundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_bundle);

        FragmentTransaction transaction = getSupportFragmentManager().
                beginTransaction();

        Fragment1 fragment1 = new Fragment1();

        transaction.replace(R.id.frame1, fragment1);
        transaction.commit(); // 저장


    }
}