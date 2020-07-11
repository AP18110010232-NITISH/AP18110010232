package com.example.task9recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recycler);

        int images[]={R.drawable.alpha,R.drawable.beta,R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmallow,R.drawable.nougat,R.drawable.oreo,R.drawable.pie,R.drawable.q,R.drawable.r};
        String CodeName[]={"Nocodename","Nocodename","Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","Ice Cream Sandwich","Jelly Bean","KitKat","Lollipop","Marshmallow","Nougat","Oreo","Pie","Android 10","Android 11"};
        String VersionNumber[]={"1.0","1.1","1.5","1.6","2.0-2.1","2.2-2.2.3","2.3-2.3.7","3.0-3.2.6","4.0-4.0.4","4.1-4.3.1","4.4-4.4.4","5.0-5.1.1","6.0-6.0.1","7.0","8.0","9.0","10.0","11.0"};
        String API[]={"1","2","3","4","5-7","8","9-10","11-13","14-15","16-18","19-20","21-22","23","24","26","28","29","30"};
        String Release_Date[]={"September 23, 2008","February 9, 2009","April 27, 2009","September 15, 2009","October 26, 2009","May 20, 2010","December 6, 2010","February 22, 2011","October 18, 2011","July 9, 2012","October 31, 2013","November 12, 2014","October 5, 2015","August 22 2016","August 21, 2017","August 6, 2018","September 3, 2019","None"};

        rv.setLayoutManager(new LinearLayoutManager(this));
        myadapter adapter=new myadapter(this,images,CodeName,VersionNumber,API,Release_Date);
        rv.setAdapter(adapter);

    }
}