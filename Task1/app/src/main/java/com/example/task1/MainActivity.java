package com.example.task1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    TextView tv;
    int a=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.Add);
        b2=findViewById(R.id.sub);
        b3=findViewById(R.id.zero);
        tv=findViewById(R.id.Text);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv.setText(""+a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a--;
                tv.setText(""+a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("0");
            }
        });
        if (savedInstanceState!=null){
            String s=savedInstanceState.getString("nitish");
            a=Integer.parseInt(s);
            tv.setText(""+a);
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("nitish",tv.getText().toString());
    }

    public void toast(View view) {
        Toast.makeText(this, " Your Count is : "+a,Toast.LENGTH_SHORT).show();

    }
}