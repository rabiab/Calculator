package com.example.hp.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    private double n1,n2,t;
    char op;

    EditText et1;
    Button bt1 ,bt2,bt3,div,bt5,bt6,bt7,mul,bt9,bt10,bt11,sub,bt13,bt14,result,add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState);
        setContentView(R.layout.activity_main);

         et1=(EditText)findViewById(R.id.txt1);
        bt1=(Button)findViewById(R.id.b1);
        bt2=(Button)findViewById(R.id.b2);
        bt3=(Button)findViewById(R.id.b3);
        div=(Button)findViewById(R.id.b4);
        bt5=(Button)findViewById(R.id.b5);
        bt6=(Button)findViewById(R.id.b6);
        bt7=(Button)findViewById(R.id.b7);
        mul=(Button)findViewById(R.id.b8);
        bt9=(Button)findViewById(R.id.b9);
        bt10=(Button)findViewById(R.id.b10);
        bt11=(Button)findViewById(R.id.b11);
        sub=(Button)findViewById(R.id.b12);
        bt13=(Button)findViewById(R.id.b13);
        bt14=(Button)findViewById(R.id.b14);
        result=(Button)findViewById(R.id.b15);
        add=(Button)findViewById(R.id.b16);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn1 = bt1.getText().toString();
                et1.setText(et1.getText() + btn1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn2 = bt2.getText().toString();
                et1.setText(et1.getText() + btn2);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn3 = bt3.getText().toString();
                et1.setText(et1.getText() + btn3);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble   (et1.getText().toString());
                op = div.getText().charAt(0);
                et1.setText("");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn5 = bt5.getText().toString();
                et1.setText(et1.getText() + btn5);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn6 = bt6.getText().toString();
                et1.setText(et1.getText() + btn6);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn7 = bt7.getText().toString();
                et1.setText(et1.getText() + btn7);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble   (et1.getText().toString());

                op = mul.getText().charAt(0);
                et1.setText("");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn9 = bt9.getText().toString();
                et1.setText(et1.getText() + btn9);
            }
        });

        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn10 = bt10.getText().toString();
                et1.setText(et1.getText() + btn10);
            }
        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn11 = bt11.getText().toString();
                et1.setText(et1.getText() + btn11);
            }
        });

      sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble   (et1.getText().toString());

                op = sub.getText().charAt(0);

                et1.setText( "");
            }
        });

        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn13 = bt13.getText().toString();
                et1.setText(et1.getText() + btn13);
            }
        });

        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText("");
            }
        });


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2=Double.parseDouble(et1.getText().toString());
                switch(op) {
                    case '+':
                      t = n1 + n2;
                        break;
                    case '-':
                        t = n1 - n2;
                        break;
                    case '*':
                        t = n1 * n2;
                        break;
                    case '/':
                        t = n1 / n2;
                        break;
                }
                et1.setText(Double.toString(t));

                String btn15 = result.getText().toString();
                et1.setText(
                        (String.format("%s%s%s", n1, op, n2))+"="+et1.getText() );

                n1 = 0;
                n2 = 0;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble   (et1.getText().toString());

                op = add.getText().charAt(0);
                et1.setText("");
            }
        });









    }



}
