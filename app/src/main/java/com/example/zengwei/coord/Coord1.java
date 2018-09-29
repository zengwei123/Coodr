package com.example.zengwei.coord;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by zengwei on 2018/9/27.
 */

public class Coord1 extends AppCompatActivity {
    private RelativeLayout rsb;
    private TextView text,text1;
    private BottomSheetBehavior behavior;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        /**根布局**/
        rsb=findViewById(R.id.rsb);
        text=findViewById(R.id.text);
        text1=findViewById(R.id.text1);
        behavior= BottomSheetBehavior.from(rsb);
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                /**滑动结束回调方法，BottomSheetBehavior状态的改变*/
                if(newState==BottomSheetBehavior.STATE_EXPANDED){
                    /**当结束后是滑动出来的**/
                    text1.setVisibility(View.VISIBLE);
                }else if(newState==BottomSheetBehavior.STATE_COLLAPSED){
                    /**当结束后是收缩进去的**/
                    text.setVisibility(View.VISIBLE);
                    bottomSheet.setAlpha(1f);
                }
            }
            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                /**滑动回调方法，slideOffset是所占高度的比例，可以用这个来做一些动画*/
                bottomSheet.setAlpha(slideOffset);
                if(text1.getVisibility()==View.GONE){
                    /**滑动开始如果 点击收缩 按钮为隐藏**/
                    text.setVisibility(View.GONE);
                }else{
                    /**滑动开始如果 点击收缩 按钮为显示**/
                    text1.setVisibility(View.GONE);
                }
            }
        });
    }
}
