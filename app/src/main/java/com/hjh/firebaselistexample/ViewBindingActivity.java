package com.hjh.firebaselistexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hjh.firebaselistexample.databinding.ActivityMainBinding;
import com.hjh.firebaselistexample.databinding.ActivityViewBindingBinding;

public class ViewBindingActivity extends AppCompatActivity {


    private ActivityViewBindingBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_view_binding);


        //액티비티 바인딩 객체에 할당 및 설정
        mBinding = ActivityViewBindingBinding.inflate(getLayoutInflater());
        View view = mBinding.getRoot();
        setContentView(view);

        mBinding.hello.setText("안녕하세용");

        mBinding.btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewBindingActivity.this, "헬로우", Toast.LENGTH_SHORT).show();
            }


        });

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_frame, new TestFragment());
        ft.commit();
    }
}