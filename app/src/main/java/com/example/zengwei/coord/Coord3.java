package com.example.zengwei.coord;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by zengwei on 2018/9/27.
 */

public class Coord3 extends AppCompatActivity {
    private FloatingActionButton floatingActionButton;
    private CoordinatorLayout coordinatorLayout;
    private BottomSheetBehavior behavior;
    private AppBarLayout avps;
    private CollapsingToolbarLayout avps1;
    public static int expendedtag=2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        floatingActionButton=findViewById(R.id.FloatingActionButton);
        coordinatorLayout=findViewById(R.id.coordinator);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coordinatorLayout,"你好吗",Snackbar.LENGTH_LONG).show();
            }
        });
        avps=findViewById(R.id.avps);
        avps1=findViewById(R.id.avps1);
        avps1.setTitle("Title");
        avps.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                if( state == State.EXPANDED ) {
                    //展开状态
                    Toast.makeText(Coord3.this, "展开", Toast.LENGTH_SHORT).show();
                }else if(state == State.COLLAPSED){
                    //折叠状态
                    Toast.makeText(Coord3.this, "折叠", Toast.LENGTH_SHORT).show();
                    avps1.setContentScrimColor(Color.parseColor("#777777"));
                }else {
                    //中间状态
                    Toast.makeText(Coord3.this, "中间", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
