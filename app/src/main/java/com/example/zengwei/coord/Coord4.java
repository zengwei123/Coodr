package com.example.zengwei.coord;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by zengwei on 2018/9/27.
 */

public class Coord4 extends AppCompatActivity {
    private RecyclerView recyle;
    private Coord2Adatper coord2Adatper;
    float xz=0;
    private int[] is={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);
//        recyle=findViewById(R.id.recyle);
//        coord2Adatper=new Coord2Adatper(is,getApplicationContext());
//        recyle.setLayoutManager(new LinearLayoutManager(this));
//        recyle.setAdapter(coord2Adatper);
//
//        recyle.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                return false;
//            }
//        });
    }
}
