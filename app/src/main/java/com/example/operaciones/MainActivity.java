package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void irsuma(View view){

        Intent intent = new Intent (this,sumar.class);
        view.getContext().startActivity(intent);


    }
    public void irDivision(View view){

        Intent intent = new Intent (this,Dividir.class);
        view.getContext().startActivity(intent);


    }
    public void irresta(View view){

        Intent intent = new Intent (this,Restar.class);
        view.getContext().startActivity(intent);


    }
    public void irMultiplicacio(View view){

        Intent intent = new Intent (this, Multiplicar.class);
        view.getContext().startActivity(intent);


    }

}