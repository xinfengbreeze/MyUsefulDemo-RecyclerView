package com.breeze.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rv);
        initView();
    }

    public void initView(){
        List<String> datas = new ArrayList<>();
        for (char i ='a';i<='z';i++){
            datas.add(""+i);
        }

        MyRecyclerAdapter  adapter = new MyRecyclerAdapter(this,datas);
        rv.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false);
        rv.setLayoutManager(linearLayoutManager);
    }
}



