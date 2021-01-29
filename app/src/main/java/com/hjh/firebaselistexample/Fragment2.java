package com.hjh.firebaselistexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Fragment2 extends Fragment {


    private View view;

    private TextView tv_2;
    private Button btn_2;
    private String result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);

        tv_2 = view.findViewById(R.id.tv_1);
        btn_2 = view.findViewById(R.id.btn_1);

        if(getArguments() != null){

            result = getArguments().getString("Frag1");
            tv_2.setText(result);
        }


        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//프래그먼트 2로 이동한다.
                Bundle bundle = new Bundle(); // 무언가를 담을 준비를 할 수 있는 보따리or 꾸러미
                bundle.putString("Frag2","홍드로이드 프래그먼트 2");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().
                        beginTransaction();

                Fragment1 fragment1 = new Fragment1();
                fragment1.setArguments(bundle);

                transaction.replace(R.id.frame1, fragment1);
                transaction.commit(); // 저장

            }
        });

        return view;
    }
}
