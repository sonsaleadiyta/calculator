package com.aditya.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText input;
private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        input=findViewById(R.id.input);
        textView=findViewById(R.id.textView);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//              String s=input.getText().toString();
//              if(s.isEmpty())
//              {
//                  Toast.makeText(MainActivity.this,"input field is black !!! ",Toast.LENGTH_SHORT).show();
//              }
//              else
//              {
//                  Toast.makeText(MainActivity.this,"info submitted",Toast.LENGTH_SHORT).show();
//                 // int kg = Integer.parseInt(s);
//                 // Double pound = kg * 2.205;
//                  //textView.setText(kg + " KG in pound will be " + pound + " POUND");
//              }
//            }
//        });


    }
    public void calculate(View view)
    {
        String s=input.getText().toString();

         if(s.isEmpty())
         {
             textView.setText("invalid input");
         }
         else {
             int kg = Integer.parseInt(s);
             Double pound = kg * 2.205;
             textView.setText(kg + " KG in pound will be " + pound + " POUND");

         }
    }




}