package com.mateusz.htlbaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Products extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createProductsViews();
        setContentView(R.layout.activity_products);

        LinearLayout productLayout =(LinearLayout)findViewById(R.id.ProductsLinearLayout);
        productLayout.setBackgroundResource(R.drawable.prodbg);

        Button ProductsBack = (Button) findViewById(R.id.ProductsBack);
        ProductsBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Products.this, MainActivity.class);
                Products.this.startActivity(myIntent);
                overridePendingTransition(R.anim.slide_n100_0, R.anim.slide_0_100);
                finish();
            }
        });
    }

    public void createProductsViews (){

        int loopCount = 1;

        try {

            TableLayout productsLayout = (TableLayout) findViewById(R.id.ProductsTableLayout);
            TableRow row = new TableRow(this);
            TableRow.LayoutParams layoutParamsColumn0 = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
            TableRow.LayoutParams layoutParamsColumn1 = new TableRow.LayoutParams(1, TableRow.LayoutParams.WRAP_CONTENT);
            TextView rowTextView;

            FileInputStream fiStream = new FileInputStream("C:\\Users\\Teresa\\Desktop\\ProdNameStock.txt");
            DataInputStream dInputStream = new DataInputStream(fiStream);
            BufferedReader bReader = new BufferedReader(new InputStreamReader(dInputStream));
            String strLine;

            while ((strLine = bReader.readLine()) != null) {

                String currentProdName = (strLine.substring(0, strLine.indexOf(";")));

                row.setLayoutParams(layoutParamsColumn0);
                rowTextView = new TextView(this);
                rowTextView.setText(currentProdName);
                row.addView(rowTextView);
                productsLayout.addView(row, loopCount);

                String currentStockAmount = (strLine.substring(strLine.indexOf(";") + 1, strLine.length()));

                row.setLayoutParams(layoutParamsColumn1);
                rowTextView = new TextView(this);
                rowTextView.setText(currentStockAmount);
                row.addView(rowTextView);
                productsLayout.addView(row, loopCount);

                loopCount ++;

            }

            dInputStream.close();

        } catch (Exception e) {
            System.err.println("Error encountered: " + e.getMessage());
        }
    }
}
