package com.example.luweicheng.recycleview.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.GridLayout;

import com.example.luweicheng.recycleview.Adapter.MyGirdAdapter;
import com.example.luweicheng.recycleview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luweicheng on 2016/4/15.
 */
public class Gird_Activity extends Activity {
    private List<Integer> list;
    private Context context;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gird);
          recyclerView= (RecyclerView) findViewById(R.id.recyclerGirdView);
          list=new ArrayList<Integer>();
        list.add(R.mipmap.girl1);
        list.add(R.mipmap.girl2);
        list.add(R.mipmap.girl8);
        list.add(R.mipmap.girl9);
        list.add(R.mipmap.girl12);
        list.add(R.mipmap.girl2);
        list.add(R.mipmap.gorl4);
        list.add(R.mipmap.girl9);
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(3,GridLayout.VERTICAL);
        recyclerView.setLayoutManager(manager);
        MyGirdAdapter adapter=new MyGirdAdapter(list,context);
        recyclerView.setAdapter(adapter);

    }
}
