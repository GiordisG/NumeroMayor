package com.example.mayornumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ok;
    EditText txt_Num1;
    EditText txt_Num2;
    TextView txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_resultado = findViewById(R.id.resultado);
        txt_Num1 = findViewById(R.id.primerNum);
        txt_Num2 = findViewById(R.id.segundoNum);
        ok = findViewById(R.id.button);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(txt_Num1.getText().toString()) > Integer.parseInt(txt_Num2.getText().toString())){
                    txt_resultado.setText("El numero mayor es: "+txt_Num1.getText().toString());
                }
                else if(Integer.parseInt(txt_Num1.getText().toString()) < Integer.parseInt(txt_Num2.getText().toString())){
                    txt_resultado.setText("El numero mayor es: "+txt_Num2.getText().toString());
                }
                else{
                    txt_resultado.setText("Los numeros introducidos son iguales");
                }

            }
        });
    }
}