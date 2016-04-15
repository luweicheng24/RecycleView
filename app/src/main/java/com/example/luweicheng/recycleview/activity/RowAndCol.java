package com.example.luweicheng.recycleview.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.luweicheng.recycleview.Adapter.MyGirdAdapter;
import com.example.luweicheng.recycleview.R;
import com.example.luweicheng.recycleview.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luweicheng on 2016/4/15.
 */
public class RowAndCol extends Activity {
    private List<Integer> list;
    private RecyclerView recyclerView;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gird);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerGirdView);
        list=new ArrayList<>();
        list.add(R.mipmap.girl12);
        list.add(R.mipmap.girl1);
        list.add(R.mipmap.girl8);
        list.add(R.mipmap.girl9);
        list.add(R.mipmap.girl12);
        list.add(R.mipmap.girl8);
        list.add(R.mipmap.girl9);
        GridLayoutManager mananger=new GridLayoutManager(context,3);
        recyclerView.setLayoutManager(mananger);
        MyGirdAdapter adapter=new MyGirdAdapter(list,context);
        recyclerView.setAdapter(adapter);

    }
}
