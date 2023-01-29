package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText email,password;
    RelativeLayout login;
    Button log_button;
    String emailOk="sch";
    String passwordOK="123";
    String inputEmail="";
    String inputPassword="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        log_button=findViewById(R.id.log_button);

        //검사(iy@sch.com/20185123)
        login.setClickable(false);  //처음시작할때 버튼x

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("SENTI",charSequence+","+i2);
                if(charSequence!=null){
                    inputEmail=charSequence.toString();
                    login.setEnabled(validation());
                }
            }   //이메일 맞는지 확인
            @Override
            public void afterTextChanged(Editable editable) { }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("SENTI",charSequence+","+i2);
                if(charSequence!=null){
                    inputPassword=charSequence.toString();
                    login.setEnabled(validation());
                }
            }   //비밀번호 맞는지 확인
            @Override
            public void afterTextChanged(Editable editable) { }
        });

        log_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validation()){
                    Log.d("SENTI",inputEmail+"//"+inputPassword);
                    Intent intent=new Intent(MainActivity.this,WelcomeActivity.class);
                    startActivity(intent);  //액티비티 이동
                }
                else
                    Toast.makeText(getApplicationContext(),"회원이아닙니다",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean validation(){
        Log.d("SENTI",inputEmail+","+inputPassword+"//"+inputEmail.equals(emailOk));
        return inputEmail.equals(emailOk)&&inputPassword.equals(passwordOK);
    }
}
