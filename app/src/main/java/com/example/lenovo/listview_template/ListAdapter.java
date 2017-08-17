package com.example.lenovo.listview_template;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 8/17/2017.
 */

public class ListAdapter extends BaseAdapter {
    Context mContext;
    private ArrayList<Data_model> arrayList;

    public ListAdapter(Context mContext, ArrayList<Data_model> arrayList) {
        this.mContext = mContext;
        this.arrayList = arrayList;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.list_item,parent,false);
        TextView textView=(TextView)rowView.findViewById(R.id.textView);
        TextView textView1=(TextView) rowView.findViewById(R.id.textView2);
        TextView textView2=(TextView)rowView.findViewById(R.id.textView3);

        //setting value
        Data_model data_model=(Data_model)arrayList.get(position);

        textView.setText(data_model.getS1());
        textView1.setText(data_model.getS2());
        textView2.setText(data_model.getS3());


        return rowView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}
