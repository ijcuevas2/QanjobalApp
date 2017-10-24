package com.example.ismaelcuevas.qanjobalapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ismaelcuevas on 10/22/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    public String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public ViewHolder(TextView v){
            super(v);
            mTextView = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset){
        mDataset = myDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        // create a new view
        // TODO: understand what this is doing. Also fix the layout parameter.
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.activity_main, parent, false);
        // set the view's size, margins, paddings, and layout parameters.
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        holder.mTextView.setText(mDataset[position]);
    }

    // Return the size of the dataset (invoked by the layout manager)
    @Override
    public int getItemCount(){
        return mDataset.length;
    }
}
