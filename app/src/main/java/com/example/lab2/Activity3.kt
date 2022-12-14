package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class Activity3 : AppCompatActivity() {

    lateinit var creamCheck: CheckBox;
    lateinit var chocoCheck: CheckBox;
    lateinit var subBtn: Button;
    lateinit var addBtn: Button;
    lateinit var txtQt: TextView;
    lateinit var orderBtn: Button;
    lateinit var txtSummary: TextView;
    var quantity = 0;
    var cream = "";
    var choco = "";
    var price = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        creamCheck = findViewById(R.id.checkCream);
        chocoCheck = findViewById(R.id.checkChoco);
        subBtn = findViewById(R.id.subBtn);
        addBtn = findViewById(R.id.addBtn);
        txtQt = findViewById(R.id.txtQt);
        orderBtn = findViewById(R.id.orderBtn);
        txtSummary = findViewById(R.id.txtSummary);
    }

    public fun addBtnClk(view:View){
        quantity++;
        txtQt.setText(quantity.toString());
    }

    public fun subBtnClk(view:View){
        if(quantity>0){
            quantity--;
            txtQt.setText(quantity.toString());
        }
    }

    public fun OrderOnClick(view: View){

        if(creamCheck.isChecked){
            cream="Yes";
            price++;
        }
        else{
            cream="No";
        }

        if(chocoCheck.isChecked){
            choco="Yes";
            price++;
        }
        else{
            choco="No";
        }

        price = (price*quantity) + (quantity*4);

        txtSummary.setText("Add Whipped Cream?" + cream +
                       "\nAdd Chocolate? "+ choco +
                       "\nQuanity: " + quantity +

                    "\n\nPrice: " + price + "\nTHANK YOU!");

        price = 0;

    }
}