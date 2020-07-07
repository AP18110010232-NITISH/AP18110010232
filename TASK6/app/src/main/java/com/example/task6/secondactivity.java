package com.example.task6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        String s = getIntent().getStringExtra("mydata");
        TextView tv =findViewById(R.id.textView);


        tv.setText(s);

    }
}