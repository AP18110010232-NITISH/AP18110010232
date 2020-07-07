package com.example.task_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }

    public void rigester(View view) {
        Intent n=new Intent(this,RegisterationPage.class);
        startActivity(n);
    }


}
