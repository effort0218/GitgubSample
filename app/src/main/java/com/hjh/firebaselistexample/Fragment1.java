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

public class Fragment1 extends Fragment {


    private View view;

    private TextView tv_1;
    private Button btn_1;

    private String result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);

        tv_1 = view.findViewById(R.id.tv_1);
        btn_1 = view.findViewById(R.id.btn_1);

        if(getArguments() != null){

            result = getArguments().getString("Frag2");
            tv_1.setText(result);
        }

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//프래그먼트 2로 이동한다.

                Bundle bundle = new Bundle(); // 무언가를 담을 준비를 할 수 있는 보따리or 꾸러미
                bundle.putString("Frag1","홍드로이드 프래그먼트 1");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().
                        beginTransaction();

                Fragment2 fragment2 = new Fragment2();
                fragment2.setArguments(bundle);

                transaction.replace(R.id.frame1, fragment2);
                transaction.commit(); // 저장

            }
        });

        return view;
    }
}
