package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BmiOkActivity extends AppCompatActivity {
    TextView TextView_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiok);

        TextView_get = findViewById(R.id.TextView_get);

        Intent intent = getIntent();  //들어오는 데이터 받음
        String result = intent.getStringExtra("str");
        String male = intent.getStringExtra("male");
        String female = intent.getStringExtra("female");
        //Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
        TextView_get.setText(result);
    }
}

