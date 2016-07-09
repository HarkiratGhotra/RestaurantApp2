package com.example.hghotra4447.restaurantapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hghotra4447 on 6/14/2016.
 */
public class FoodAdapter extends ArrayAdapter {
    List list =new ArrayList();
    public FoodAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }
    static class DataHandler
    {
        ImageView poster;
        TextView title;
        TextView price;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        DataHandler handler;
        row= convertView;
        if(convertView ==null)
        {
            LayoutInflater inflater= (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.row_layout,parent,false);
            handler = new DataHandler();
            handler.poster = (ImageView)row.findViewById(R.id.food_poster);
            handler.title = (TextView) row.findViewById(R.id.food_title);
            handler.price= (TextView) row.findViewById(R.id.food_price);
            row.setTag(handler);
        }
        else {
            handler=(DataHandler) row.getTag();
        }

        FoodDataProvider dataProvider;
        dataProvider = (FoodDataProvider)this.getItem(position);
        handler.poster.setImageResource(dataProvider.getFood_poster_resource());
        handler.title.setText(dataProvider.getFood_title());
        handler.price.setText(dataProvider.getFood_price());


        return row;
    }
}
