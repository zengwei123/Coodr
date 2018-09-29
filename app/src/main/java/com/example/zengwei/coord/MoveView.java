package com.example.zengwei.coord;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by zengwei on 2018/9/28.
 */

public class MoveView extends android.support.v7.widget.AppCompatTextView {
    private float lastX, lastY;

    public MoveView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        float x = event.getRawX();
        float y = event.getRawY();
        if (action == MotionEvent.ACTION_MOVE) {
            CoordinatorLayout.MarginLayoutParams layoutParams = (CoordinatorLayout.MarginLayoutParams) getLayoutParams();
            //计算当前的左上角坐标
            float left = layoutParams.leftMargin + x - lastX;
            float top = layoutParams.topMargin + y - lastY;
            //设置坐标
            layoutParams.leftMargin = (int) left;
            layoutParams.topMargin = (int) top;
            setLayoutParams(layoutParams);
        }
        lastX = x;
        lastY = y;
        return true;
    }
}
