package com.example.luweicheng.recycleview.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.luweicheng.recycleview.R;

import java.util.List;

/**
 * Created by luweicheng on 2016/4/15.
 */
public class MyGirdAdapter extends RecyclerView.Adapter<MyGirdAdapter.MyGridViewHolder>{
    private List<Integer> list;
    private Context context;

    public MyGirdAdapter(List<Integer> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override

    public MyGridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.gird_item,null);
        MyGridViewHolder holder=new MyGridViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyGridViewHolder holder, int position) {
        Integer image=list.get(position);
        holder.imageView.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyGridViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public MyGridViewHolder(View itemView) {
           super(itemView);
           imageView= (ImageView) itemView.findViewById(R.id.imageGrid);
       }
   }
}
