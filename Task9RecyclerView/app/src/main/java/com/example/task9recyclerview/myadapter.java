package com.example.task9recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {
    int Images[];
    String code[];
    String version[];
    String api[];
    String release[];
    Context ct;



    public myadapter(MainActivity mainActivity, int[] images, String[] CodeName, String[] VersionNumber, String[] API, String[] Release_Date) {
      Images=images;
      code=CodeName;
      version=VersionNumber;
      api=API;
      release=Release_Date;
      ct=mainActivity;

    }

    @NonNull
    @Override
    public myadapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(ct).inflate(R.layout.items,parent,false);
        myviewholder myviewholder=new myviewholder(v);
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull myadapter.myviewholder holder, int position) {
      holder.i.setImageResource(Images[position]);
      holder.t.setText(code[position]);
        holder.t1.setText(version[position]);
        holder.t2.setText(api[position]);
        holder.t3.setText(release[position]);
    }

    @Override
    public int getItemCount() {
        return Images.length;
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        ImageView i;
        TextView t;
        TextView t1;
        TextView t2;
        TextView t3;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            i=itemView.findViewById(R.id.image);
            t=itemView.findViewById(R.id.codename);
            t1=itemView.findViewById(R.id.versionnumber);
            t2=itemView.findViewById(R.id.api);
            t3=itemView.findViewById(R.id.release);
        }
    }
}
