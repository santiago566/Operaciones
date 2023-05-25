package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Dividir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);
    }

    public void regresa(View view){
        this.finish();

    }

    public void Dividir(View view){

        EditText numD1=(EditText) findViewById(R.id.numD1);
        EditText numD2=(EditText) findViewById(R.id.numD2);

        double resultado =
                Double.parseDouble(numD1.getText().toString()) / Double.parseDouble(numD2.getText().toString());

        TextView total = findViewById(R.id.numD);
        total.setText(resultado+"");

    }
}