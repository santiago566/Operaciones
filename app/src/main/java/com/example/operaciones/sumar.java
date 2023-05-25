package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sumar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);
    }

    public void regresa(View view){
        this.finish();

    }

    public void sumar(View view){

        EditText num1=(EditText) findViewById(R.id.num1);
        EditText num2=(EditText) findViewById(R.id.num2);

        double resultado =
            Double.parseDouble(num1.getText().toString())+Double.parseDouble(num2.getText().toString());

        TextView total = findViewById(R.id.res);
        total.setText(resultado+"");

    }
}