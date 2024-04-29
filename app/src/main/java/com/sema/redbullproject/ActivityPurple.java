package com.sema.redbullproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPurple extends AppCompatActivity {

    private EditText editTextNumber;
    private Button buttonIncrement;
    private Button buttonDecrement;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purple);

        editTextNumber = findViewById(R.id.editTextNumber);
        buttonIncrement = findViewById(R.id.button4);
        buttonDecrement = findViewById(R.id.button5);

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
