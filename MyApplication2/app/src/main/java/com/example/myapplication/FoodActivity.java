package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {

    Button food_one,food_two,food_three;
    TextView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        food_one=findViewById(R.id.food_one);
        food_two=findViewById(R.id.food_two);
        food_three=findViewById(R.id.food_three);
        detail=findViewById(R.id.detail);

        food_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detail.setText("쌀밥 : 313Kcal\n보리밥 : 312Kcal\n현미밥 : 368Kcal\n" +
                        "흑미밥 : 330Kcal\n보리밥 : 312Kcal\n두부면 : 160Kcal\n메밀면 : 544Kcal\n");
            }
        });
        food_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detail.setText("팥빙수 : 373Kcal\n츄파춥스 : 45Kcal\n초콜릿 : 219Kcal\n" +
                        "마카롱 : 65Kcal\n케이크 : 174Kcal\n샌드위치 : 352Kcal\n호떡 : 344Kcal\n");
                //String str=detail.getText().toString();
                //Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
            }
        });
        food_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detail.setText("아이스아메리카노 : 4cal\n아이스티 : 90Kcal\n우유 : 122Kcal\n" +
                        "버블티 : 271Kcal\n민트초코 : 350Kcal\n녹차 : 2Kcal\n카페라뗴 : 147Kcal\n");
            }
        });
    }

}
