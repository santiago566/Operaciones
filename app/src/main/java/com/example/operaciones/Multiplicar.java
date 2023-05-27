package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
    }
    public void regresa(View view){
        this.finish();

    }

    public void Multiplicar(View view){

        EditText numM1=(EditText) findViewById(R.id.numM1);
        EditText numM2=(EditText) findViewById(R.id.numM2);

        double resultado =
                Double.parseDouble(numM1.getText().toString()) * Double.parseDouble(numM2.getText().toString());

        TextView total = findViewById(R.id.resuM);
        total.setText(resultado+"");

    }
}