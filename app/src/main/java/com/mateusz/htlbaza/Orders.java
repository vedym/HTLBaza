package com.mateusz.htlbaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Orders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        LinearLayout ordersLayout =(LinearLayout)findViewById(R.id.OrdersLinearLayout);
        ordersLayout.setBackgroundResource(R.drawable.ordbg);

        final Button OrdersBack = (Button) findViewById(R.id.OrdersBack);

        OrdersBack.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Orders.this, MainActivity.class);
                Orders.this.startActivity(myIntent);
                overridePendingTransition(R.anim.slide_n100_0, R.anim.slide_0_100);
                finish();
            }
        });
    }

    /*public static void main (String[] args) {

        int loopCount = 1;

        try {

            FileInputStream fiStream = new FileInputStream("C:/Users/Teresa/Desktop/OrdersIDNameDate.txt");

            DataInputStream dInputStream = new DataInputStream(fiStream);
            BufferedReader bReader = new BufferedReader(new InputStreamReader(dInputStream));
            String strLine;

            while ((strLine = bReader.readLine()) != null) {
                //While text line != empty...

                String currentOrderID = (strLine.substring(0, strLine.indexOf(";")));
                System.out.println(currentOrderID);
                String currentStockAmount = (strLine.substring(strLine.indexOf(";") + 1, strLine.length() -11));
                System.out.println(currentStockAmount);
                String currentOrderDate = (strLine.substring(strLine.length()  -10, strLine.length()));
                System.out.println(currentOrderDate);



                loopCount ++;

            }

            dInputStream.close();
            //Close DataInputStream when text line is null

        } catch (Exception e) {
            System.err.println("Error encountered: " + e.getMessage());
            //Display any potential errors
        }
    }

public void textviewcreator(String currentOrderID, String currentStockAmount, String currentOrderDate){

}*/
}
