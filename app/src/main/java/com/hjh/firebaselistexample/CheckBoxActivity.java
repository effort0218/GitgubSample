package com.hjh.firebaselistexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox chk_red, chk_blue, chk_green;
    private TextView tb_result;
    private Button btn_rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        chk_red = findViewById(R.id.chk_red);
        chk_blue = findViewById(R.id.chk_blue);
        chk_green = findViewById(R.id.chk_green);
        tb_result = findViewById(R.id.tb_result);
        btn_rs = findViewById(R.id.btn_rs);

        //결과 버튼을 클릭했을때 액션
        btn_rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_result = ""; // String 값 초기화

                if (chk_red.isChecked()) {// 체크 박스에 체크가 되어있다면
                    str_result += chk_red.getText().toString();
                }
                if (chk_blue.isChecked()) {
                    str_result += chk_blue.getText().toString();
                }
                if (chk_green.isChecked()) {
                    str_result += chk_green.getText().toString();
                }

                tb_result.setText(str_result);// 체크박스에 체크되어있던 값을 텍스트뷰로 전송
            }
        });
    }
}