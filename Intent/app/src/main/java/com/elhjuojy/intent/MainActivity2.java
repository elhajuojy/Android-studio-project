package com.elhjuojy.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView login1 ;
    TextView password1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        login1 = findViewById(R.id.login);
        password1 = findViewById(R.id.password);
        Intent intent = getIntent();
        if(intent !=null){
            Bundle extras = intent.getExtras();
            if(extras != null){
                String login = extras.getString("login");
                String password = extras.getString("password");
                login1.setText(login.toString());
                password1.setText(password.toString());



            }
        }
    }
}