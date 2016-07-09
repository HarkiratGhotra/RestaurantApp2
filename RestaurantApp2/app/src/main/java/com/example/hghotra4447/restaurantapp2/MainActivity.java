package com.example.hghotra4447.restaurantapp2;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView listView;   // objects
    int[] food_poster_resource=          // first array for first text
            {R.drawable.burgermeal,R.drawable.chickenmeal,R.drawable.chickenwings,R.drawable.frenchfries
    ,R.drawable.kabab,R.drawable.pizza,R.drawable.rolls};

    String[] food_titles;
    String[] food_price;
    FoodAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list_view);   // this is for initialize
        food_price=getResources().getStringArray(R.array.food_price);
        food_titles=getResources().getStringArray(R.array.food_items);
        int i=0;
        adapter = new FoodAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        for(String titles:food_titles)
        {
            FoodDataProvider dataProvider= new FoodDataProvider(food_poster_resource[i],
                    titles,food_price[i]);
            adapter.add(dataProvider);
            i++;
        }
    }


}
