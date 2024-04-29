package com.sema.redbullproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityRed extends AppCompatActivity {

    private EditText editTextNumber;
    private Button buttonIncrement;
    private Button buttonDecrement;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);

        editTextNumber = findViewById(R.id.editTextNumber4);
        buttonIncrement = findViewById(R.id.button8);
        buttonDecrement = findViewById(R.id.button10);

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                editTextNumber.setText(String.valueOf(counter));
            }
        });

        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) {
                    counter--;
                    editTextNumber.setText(String.valueOf(counter));
                }
            }
        });
    }
}