package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HealthActivity extends AppCompatActivity {

    Button exercise_button,food_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        exercise_button=findViewById(R.id.exercise_botton);
        food_button=findViewById(R.id.food_button);

        exercise_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HealthActivity.this,ExerciseActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });
        food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HealthActivity.this,FoodActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });
    }
}
