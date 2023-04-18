package com.example.ejerciciomedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_number1);
        et2 = (EditText) findViewById(R.id.txt_number2);
        et3 = (EditText) findViewById(R.id.txt_number3);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
    }

    public void Media (View view) {
        String resultado = "";
        String mates = et1.getText().toString();
        String química = et2.getText().toString();
        String lengua = et3.getText().toString();


        int nMates = Integer.parseInt(mates);
        int nQuímica = Integer.parseInt(química);
        int nLengua = Integer.parseInt(lengua);

        int media = (nMates + nQuímica + nLengua) / 3;


        if (media >= 5){
            resultado = "Tu nota es " + media + "Has Aprobado";
        }
        else{
            resultado = "Tu nota es" + media + "Has Suspendido";
        }

        tv1.setText(resultado);


    }
}