package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Restar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);
    }

    public void regresa(View view){
        this.finish();

    }

    public void restar(View view){

        EditText numR1=(EditText) findViewById(R.id.numR1);
        EditText numR2=(EditText) findViewById(R.id.numR2);

        double resultado =
                Double.parseDouble(numR1.getText().toString()) - Double.parseDouble(numR2.getText().toString());

        TextView total = findViewById(R.id.resuR);
        total.setText(resultado+"");

    }
}

