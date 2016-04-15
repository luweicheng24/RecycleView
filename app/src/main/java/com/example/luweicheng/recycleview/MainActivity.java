package com.example.luweicheng.recycleview;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luweicheng.recycleview.activity.Gird_Activity;
import com.example.luweicheng.recycleview.activity.Horizontal;
import com.example.luweicheng.recycleview.activity.RowAndCol;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1:
                startActivity(new Intent().setComponent(new ComponentName(MainActivity.this, Horizontal.class)));
                break;
            case R.id.button2:
                startActivity(new Intent().setComponent(new ComponentName(MainActivity.this, RowAndCol.class)));
                break;
            case R.id.button3:
                startActivity(new Intent().setComponent(new ComponentName(MainActivity.this, Gird_Activity.class)));
                break;
        }
    }
}
