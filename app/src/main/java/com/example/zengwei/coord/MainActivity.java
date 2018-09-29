package com.example.zengwei.coord;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button1, button2, button3, button4;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
           case  R.id.button:
               intent=new Intent(MainActivity.this,Coord1.class);
               startActivity(intent);
               break;
           case  R.id.button2:
               intent=new Intent(MainActivity.this,Coord2.class);
               startActivity(intent);
               break;
           case  R.id.button3:
               intent=new Intent(MainActivity.this,Coord3.class);
               startActivity(intent);
               break;
           case  R.id.button4:
               intent=new Intent(MainActivity.this,Coord4.class);
               startActivity(intent);
               break;
        }
    }
}
