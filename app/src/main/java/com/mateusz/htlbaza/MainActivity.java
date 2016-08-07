package com.mateusz.htlbaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout mainLayout =(RelativeLayout)findViewById(R.id.RelativeLayoutMain);
        mainLayout.setBackgroundResource(R.drawable.bg);

        final Button CustomersButton = (Button) findViewById(R.id.CustomersButton);
        final Button OrdersButton = (Button) findViewById(R.id.OrdersButton);
        final Button ProductsButton = (Button) findViewById(R.id.ProductsButton);

        CustomersButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Customers.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_100_0, R.anim.slide_0_n100);
                finish();
            }
        });

        OrdersButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Orders.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_100_0, R.anim.slide_0_n100);
                finish();
            }
        });

        ProductsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Products.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_100_0, R.anim.slide_0_n100);
                finish();
            }
        });
    }
}