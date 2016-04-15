package com.example.luweicheng.recycleview.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.luweicheng.recycleview.R;
import com.example.luweicheng.recycleview.bean.Student;

import java.util.List;

/**
 * Created by luweicheng on 2016/4/15.
 */
public class MyRecyclerAdapter extends
        RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    private List<Student> mList;
    private Context mContext;

    public MyRecyclerAdapter(List<Student> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_item, null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student student = mList.get(position);
        holder.imageView.setImageResource(student.getPhoto());
        holder.name.setText(student.getName());
        holder.age.setText(student.getAge());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView name, age;

        public MyViewHolder(final View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            name = (TextView) itemView.findViewById(R.id.name);
            age = (TextView) itemView.findViewById(R.id.age);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,"点击了第"+getAdapterPosition()+"张图片",Toast.LENGTH_SHORT).show();
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,"点击了第"+getAdapterPosition()+"个item",Toast.LENGTH_SHORT).show();

                }
            });

            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "点击了第" + getAdapterPosition(), Toast.LENGTH_SHORT).show();

                }
            });*/
        }
            /* @Override
            public void onClick (View v){
                   switch(v.getId()){
                   case R.id.age:
                    Toast.makeText(mContext,"年龄：",Toast.LENGTH_SHORT).show();
                     break;
                       case R.id.name:
                           Toast.makeText(mContext,"姓名：",Toast.LENGTH_SHORT).show();

                           break;
                       case R.id.imageView:
                           Toast.makeText(mContext,"图片：",Toast.LENGTH_SHORT).show();
                      break;

            }

            }*/
        }
    }
