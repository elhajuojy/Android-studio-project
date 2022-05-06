package com.elhjuojy.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    CheckBox checkphp;
    CheckBox checkpython;
    CheckBox checkjava;
    Button btnShow ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.textView);
        checkjava = findViewById(R.id.checkBox3);
        checkphp = findViewById(R.id.checkphp);
        checkpython = findViewById(R.id.checkpyton);
        btnShow = findViewById(R.id.button);
        


    }
}