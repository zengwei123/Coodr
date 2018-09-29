package com.example.zengwei.coord;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by zengwei on 2018/9/27.
 */

public class SampleTitleBehavior extends CoordinatorLayout.Behavior<View> {
    // 列表顶部和title底部重合时，列表的滑动距离。
    private float deltaY;
    boolean aBoolean=true;
    public SampleTitleBehavior() {
    }
    public SampleTitleBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 使用该Behavior的View要监听哪个类型的View的状态变化。
     * 其中参数parant代表CoordinatorLayout，child代表使用该Behavior的View，dependency代表要监听的View。
     * 这里要监听RecyclerView
     * @param parent
     * @param child
     * @param dependency
     * @return
     */
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof MoveView;
    }

    /**
     * 当被监听的View状态变化时会调用该方法，参数和上一个方法一致。
     * 所以我们重写该方法，当MoveView的位置变化时，进而改变title的位置。
     * @param parent
     * @param child
     * @param dependency
     * @return
     */
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
            if(aBoolean){
                deltaY=dependency.getY();
                aBoolean=false;
            }
        if(deltaY-dependency.getY()<=150){
            child.setY(dependency.getY()-deltaY);
        }
        return true;
    }

}
