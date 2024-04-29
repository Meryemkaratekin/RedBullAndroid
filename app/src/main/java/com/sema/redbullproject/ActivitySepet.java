package com.sema.redbullproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.sema.redbullproject.R;



    public class ActivitySepet extends AppCompatActivity {

        private EditText editTextNumber7;
        private EditText editTextNumber8;
        private EditText editTextNumberDecimal2;
        private Button button13;
        private Button button15;
        private Button button16;
        private Button button18;
        private TextView textView12;
        private TextView textView14;

        private int price1 = 45;
        private int price2 = 50;
        private int quantity1 = 0;
        private int quantity2 = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sepet);

            editTextNumber7 = findViewById(R.id.editTextNumber7);
            editTextNumber8 = findViewById(R.id.editTextNumber8);
            editTextNumberDecimal2 = findViewById(R.id.editTextNumberDecimal2);
            button13 = findViewById(R.id.button13);
            button15 = findViewById(R.id.button15);
            button16 = findViewById(R.id.button16);
            button18 = findViewById(R.id.button18);
            textView12 = findViewById(R.id.textView12);
            textView14 = findViewById(R.id.textView14);

            button15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quantity1++;
                    editTextNumber7.setText(String.valueOf(quantity1));
                    textView12.setText(String.valueOf(price1 * quantity1));
                    updateTotalPrice();
                }
            });

            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (quantity1 > 0) {
                        quantity1--;
                        editTextNumber7.setText(String.valueOf(quantity1));
                        textView12.setText(String.valueOf(price1 * quantity1));
                        updateTotalPrice();
                    }
                }
            });

            button16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quantity2++;
                    editTextNumber8.setText(String.valueOf(quantity2));
                    textView14.setText(String.valueOf(price2 * quantity2));
                    updateTotalPrice();
                }
            });

            button18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (quantity2 > 0) {
                        quantity2--;
                        editTextNumber8.setText(String.valueOf(quantity2));
                        textView14.setText(String.valueOf(price2 * quantity2));
                        updateTotalPrice();
                    }
                }
            });
        }

        private void updateTotalPrice() {
            int totalPrice = (price1 * quantity1) + (price2 * quantity2);
            editTextNumberDecimal2.setText(String.valueOf(totalPrice));
        }
    }
