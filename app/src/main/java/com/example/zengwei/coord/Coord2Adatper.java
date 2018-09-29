package com.example.zengwei.coord;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by zengwei on 2018/9/27.
 */

public class Coord2Adatper extends RecyclerView.Adapter<Coord2Adatper.Coord2AdatperViewHolder> {
    private int[] is;
    private Context context;
    public Coord2Adatper(int[] is, Context context){
        this.is=is;
        this.context=context;
    }
    @Override
    public Coord2AdatperViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       return new Coord2AdatperViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(Coord2AdatperViewHolder holder, int position) {
        holder.textView.setText(position+"");
    }

    @Override
    public int getItemCount() {
        return is.length;
    }

    class Coord2AdatperViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public Coord2AdatperViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.text1);
        }
    }
}
