package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity  {
   private TextView output, input;
   private Button btn1,btn2,btn0,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn00,btnDot;
   private Button btnAdd,btnSub,btnMultiply,btnDivide,btnEqual,btnClear;

   private char action;
   private final char ADDITION=  '+';
    private final char SUBTRACTION=  '-';
    private final char MULTIPLY=  '*';
    private final char DIVISION=  '%';
   private final char EQUAL=0;

   private Double firstNum= Double.NaN;
   private Double secondNum;

   private DecimalFormat df;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        output=findViewById(R.id.results);
        input=findViewById(R.id.calc);

        btn0=findViewById(R.id.btn_0);
        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        btn4=findViewById(R.id.btn_4);
        btn5=findViewById(R.id.btn_5);
        btn6=findViewById(R.id.btn_6);
        btn7=findViewById(R.id.btn_7);
        btn8=findViewById(R.id.btn_8);
        btn9=findViewById(R.id.btn_9);
        btn00=findViewById(R.id.btn_00);
        btnDot=findViewById(R.id.decimal);

        btnAdd=findViewById(R.id.btn_add);
        btnSub=findViewById(R.id.btn_sub);
        btnMultiply=findViewById(R.id.btn_multiply);
        btnDivide=findViewById(R.id.btn_divide);
        btnEqual=findViewById(R.id.btn_equal);
        btnClear=findViewById(R.id.btn_clear);

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"00");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+"9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString()+".");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum=Double.NaN;
                secondNum=0.0;
                input.setText("0");
                output.setText("0");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                action=ADDITION;
                input.setText(String.valueOf(firstNum)+"+");
                output.setText(null);            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                action=SUBTRACTION;
                input.setText(String.valueOf(firstNum)+"-");
                output.setText(null);            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=MULTIPLY;
                compute();

                input.setText(String.valueOf(firstNum)+"*");
                output.setText(null);            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                action=DIVISION;
                input.setText(String.valueOf(firstNum)+"/");
                output.setText(null);            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            compute();
            action=EQUAL;
            output.setText(String.valueOf(firstNum));
            }
        });



    }
 private void compute()
 {
     if(!Double.isNaN(firstNum))
     {
      secondNum=Double.parseDouble(output.getText().toString());

      switch(action)
      {
          case ADDITION:
              firstNum+=secondNum;
              break;
          case SUBTRACTION:
              firstNum-=secondNum;
              break;
          case MULTIPLY:
              firstNum=firstNum*secondNum;
              break;
          case DIVISION:
              firstNum=firstNum/secondNum;
              break;
          case EQUAL:
              break;
      }
      }
     else
     {
        firstNum=Double.parseDouble(output.getText().toString());

     }

 }






}