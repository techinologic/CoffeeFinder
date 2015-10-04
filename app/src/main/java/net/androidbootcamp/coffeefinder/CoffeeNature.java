package net.androidbootcamp.coffeefinder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoffeeNature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_nature);

        Button button0 = (Button) findViewById(R.id.txtAddCoffeeNature);
        Button button1 = (Button) findViewById(R.id.webCoffeeNature);
        Button button2 = (Button) findViewById(R.id.callCoffeeNature);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ymhD7ADWhp72")));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.coffeenature.wordpress.com/")));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:2022378989")));
            }
        });
    }
}
