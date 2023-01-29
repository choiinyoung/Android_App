package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    Button one_button,two_button,three_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);

        one_button=findViewById(R.id.one_button);
        two_button=findViewById(R.id.two_button);
        three_button=findViewById(R.id.three_button);

        one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"onebuttonn",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(WelcomeActivity.this,BmiActivity.class);
                startActivity(intent);
            }
        });
        two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WelcomeActivity.this,CalendarActivity.class);
                startActivity(intent);
            }
        });
        three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WelcomeActivity.this,HealthActivity.class);
                startActivity(intent);
            }
        });
    }
}
