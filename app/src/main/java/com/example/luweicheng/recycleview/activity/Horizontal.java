package com.example.luweicheng.recycleview.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.example.luweicheng.recycleview.Adapter.MyRecyclerAdapter;
import com.example.luweicheng.recycleview.R;
import com.example.luweicheng.recycleview.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luweicheng on 2016/4/15.
 */
public class Horizontal extends Activity {
    private List<Student> mList;
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);
        mRecyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        mList=new ArrayList<Student>();
        mList.add(new Student("","",R.mipmap.kobe1));
        mList.add(new Student("","",R.mipmap.kobe2));
        mList.add(new Student("","",R.mipmap.kobe3));
        mList.add(new Student("","",R.mipmap.kobe5));
        mList.add(new Student("","",R.mipmap.kobe6));
        mList.add(new Student("","",R.mipmap.kobe7));
        mList.add(new Student("","",R.mipmap.kobe8));
        mList.add(new Student("","",R.mipmap.kobe9));
        mList.add(new Student("","",R.mipmap.kobe10));
        mList.add(new Student("","",R.mipmap.kobe11));
        mList.add(new Student("","",R.mipmap.kobe12));
        mList.add(new Student("","",R.mipmap.kobe13));
        LinearLayoutManager manager=new LinearLayoutManager(this, LinearLayout.VERTICAL,false);
        mRecyclerView.setLayoutManager(manager);
        MyRecyclerAdapter adapter=new MyRecyclerAdapter(mList,this);
        mRecyclerView.setAdapter(adapter);
    }
}
