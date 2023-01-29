package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class BmiActivity extends AppCompatActivity {

    Button ok_button;
    EditText cm,kg;
    String inputcm,inputkg;
    double result=0.0,water=0.0;
    RadioButton male,female;
    String re2;
    String kcal="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        ok_button=findViewById(R.id.ok_button);
        cm=findViewById(R.id.cm);
        kg=findViewById(R.id.kg);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);


        ok_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(female.isChecked()){
                    kcal="2000";
                    inputcm=cm.getText().toString();
                    inputkg=kg.getText().toString();

                    result=Double.parseDouble(inputkg)/((Double.parseDouble(inputcm)*1/100)*(Double.parseDouble(inputcm)*1/100));
                    water=(Double.parseDouble(inputkg)+Double.parseDouble(inputcm))/100;
                    male.setChecked(false);
                    String res=String.format("%.2f",result);
                    if (result < 19.0){
                        re2="현재 회원님은\nBMI가 " + res  +
                            "으로\n저체중 입니다.\n" + "하루 권장 칼로리는"+kcal+"이며,\n하루 권장 물 섭취량은"+water+"L 입니다.";
                    }
                   else if (result < 23.0){
                        re2="현재 회원님은\nBMI가 " +  res +
                                "으로\n표준 입니다.\n" + "하루 권장 칼로리는"+kcal+"이며,\n하루 권장 물 섭취량은"+water+"L 입니다.";
                    }
                    else {
                        re2="현재 회원님은\nBMI가 " + res +
                                "으로\n과체중 입니다.\n" + "하루 권장 칼로리는"+kcal+"이며,\n하루 권장 물 섭취량은"+water+"L 입니다.";
                    }
                    //Toast.makeText(getApplicationContext(),re2,Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(BmiActivity.this,BmiOkActivity.class);
                    intent.putExtra("str",re2);
                    startActivity(intent);
                }
                else if(male.isChecked()) {
                    kcal="2500";
                    inputcm=cm.getText().toString();
                    inputkg=kg.getText().toString();
                    String res=String.format("%.2f",result);

                    result=Double.parseDouble(inputkg)/((Double.parseDouble(inputcm)*1/100)*(Double.parseDouble(inputcm)*1/100));
                    female.setChecked(false);
                    if (result < 19.0){
                        re2="현재 회원님은\nBMI가 " + res  +
                                "으로\n저체중 입니다.\n" + "하루 권장 칼로리는"+kcal+"이며,\n하루 권장 물 섭취량은"+water+"L 입니다.";
                    }
                    else if (result < 23.0){
                        re2="현재 회원님은\nBMI가 " +  res +
                                "으로\n표준 입니다.\n" + "하루 권장 칼로리는"+kcal+"이며,\n하루 권장 물 섭취량은"+water+"L 입니다.";
                    }
                    else {
                        re2="현재 회원님은\nBMI가 " + res +
                                "으로\n과체중 입니다.\n" + "하루 권장 칼로리는"+kcal+"이며,\n하루 권장 물 섭취량은"+water+"L 입니다.";
                    }
                    //Toast.makeText(getApplicationContext(),re2,Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(BmiActivity.this,BmiOkActivity.class);
                    intent.putExtra("str",re2);
                    startActivity(intent);
                }
            }
        });
    }
}
