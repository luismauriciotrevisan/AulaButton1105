package com.example.aulabutton1105;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_01 = (TextView) findViewById(R.id.tv_01_view);

    }
    //Trata o click do botão '+'
    public void handleClickMais(View view){
        //Lê o valor da View tv_01_view
        String strCounter = tv_01.getText().toString();
        //converte o valor para inteiro
        int iCounter = Integer.parseInt(strCounter);
        //incrementa
        iCounter++;
        tv_01.setText(String.format("%d", iCounter));

        TextView tv_02 = (TextView) findViewById(R.id.tv_02_view);
        Button myButton = (Button) view;
        tv_02.setText(myButton.getText().toString());
    }

    //Trata o click do botão '-'
    public void handleClickMenos(View view){
        //Lê o valor da View tv_01_view
        String strCounter = tv_01.getText().toString();
        //converte o valor para inteiro
        int iCounter = Integer.parseInt(strCounter);
        //decrementa
        iCounter--;
        tv_01.setText(String.format("%d", iCounter));

        TextView tv_02 = (TextView) findViewById(R.id.tv_02_view);
        Button myButton = (Button) view;
        tv_02.setText(myButton.getText().toString());
    }

}
