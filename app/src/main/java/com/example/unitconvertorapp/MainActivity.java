package com.example.unitconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView head;
    TextView result;
    EditText input;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        head = findViewById(R.id.heading);
        result=findViewById(R.id.result);
        input = findViewById(R.id.input);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kilos = Double.parseDouble(input.getText().toString());
                double pounds = convertToPounds(kilos);
                result.setText(" The value in pounds :- \n"+pounds);
            }
        });
    }

    public double convertToPounds(double kilos){
        return kilos*2.20462;
    }
}