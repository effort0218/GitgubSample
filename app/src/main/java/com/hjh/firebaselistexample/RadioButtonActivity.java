package com.hjh.firebaselistexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioGroup rg_gender;
    private RadioButton rb_man, rb_woman;
    private Button btn_result;
    private String str_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        rg_gender = (RadioGroup) findViewById(R.id.rg_gender); // 라디오 버튼을 담고있는 그릇
        rb_man = (RadioButton) findViewById(R.id.rb_man); // 라디오 버튼
        rb_woman = (RadioButton) findViewById(R.id.rb_woman); // 라이도 버튼
        btn_result = (Button) findViewById(R.id.btn_result); // 결과 값을출력하려는 신호를 보낼 버튼

        //변경 감지
        rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_man) {
                    Toast.makeText(RadioButtonActivity.this,
                            "남자 라디오 버튼", Toast.LENGTH_SHORT).show();
                    str_result = rb_man.getText().toString();
                } else if (checkedId == R.id.rb_woman) {
                    Toast.makeText(RadioButtonActivity.this,
                            "여자 라디오 버튼", Toast.LENGTH_SHORT).show();
                    str_result = rb_woman.getText().toString();
                }
            }
        });

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str_result != null){
                    Toast.makeText(RadioButtonActivity.this,
                            str_result , Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RadioButtonActivity.this,
                            "라디오 버튼을 선택 해주세요." , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}