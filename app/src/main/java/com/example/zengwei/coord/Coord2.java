package com.example.zengwei.coord;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by zengwei on 2018/9/27.
 */

public class Coord2 extends AppCompatActivity {
    private FloatingActionButton floatingActionButton;
    private CoordinatorLayout coordinatorLayout;
    private RecyclerView recyle;
    private Coord2Adatper coord2Adatper;
    private int[] is={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        floatingActionButton=findViewById(R.id.FloatingActionButton);
        coordinatorLayout=findViewById(R.id.coordinator);
        recyle=findViewById(R.id.recyle);
        coord2Adatper=new Coord2Adatper(is,getApplicationContext());
        recyle.setLayoutManager(new LinearLayoutManager(this));
        recyle.setAdapter(coord2Adatper);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coordinatorLayout,"你好吗",Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
