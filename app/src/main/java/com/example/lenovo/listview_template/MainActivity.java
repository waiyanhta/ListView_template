package com.example.lenovo.listview_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Data_model> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=new ArrayList<>();

        for (int i=1;i<=10;i++){
            Data_model data_model=new Data_model("No."+i, "Person-"+i, "Sn"+i);
            list.add(data_model);
        }

        ListView listView=(ListView)findViewById(R.id.list_view);
        ListAdapter listAdapter=new ListAdapter(getApplicationContext(),list);
        listView.setAdapter(listAdapter);
    }
}
