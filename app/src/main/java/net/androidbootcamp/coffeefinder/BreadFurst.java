package net.androidbootcamp.coffeefinder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreadFurst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bread_furst);

        Button button0 = (Button) findViewById(R.id.txtAddBreadFurst);
        Button button1 = (Button) findViewById(R.id.webBreadFurst);
        Button button2 = (Button) findViewById(R.id.callBreadFurst);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/8hPsCNfoBey")));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.breadfurst.com/")));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:2027651200")));
            }
        });
    }
}
