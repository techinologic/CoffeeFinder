package net.androidbootcamp.coffeefinder;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] coffeeShop = {"Starbucks Coffee", "Bread Furst Bakery", "Politics and Prose", "Coffee Nature"};
        setListAdapter(new ArrayAdapter<>(this, R.layout.activity_main, R.id.coffee, coffeeShop));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, Starbucks.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, BreadFurst.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Politics.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, CoffeeNature.class));
                break;
        }
    }


}
