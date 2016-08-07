package com.mateusz.htlbaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Customers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
        LinearLayout customerLayout =(LinearLayout)findViewById(R.id.CustomersLinearLayout);
        customerLayout.setBackgroundResource(R.drawable.custbg);


        final Button CustomersBack = (Button) findViewById(R.id.CustomersBack);

        CustomersBack.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Customers.this, MainActivity.class);
                Customers.this.startActivity(myIntent);
                overridePendingTransition(R.anim.slide_n100_0, R.anim.slide_0_100);
                finish();

            }
        });
    }
}
