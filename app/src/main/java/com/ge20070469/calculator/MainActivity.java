package com.ge20070469.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText input;
    private Button one, two, three, four, five, six, seven, eight, nine, zero, devide, multiply, subtract, add, del, equal;
    private String symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.placeholder);// Input
        one = findViewById(R.id.one);// Input
        two = findViewById(R.id.two);// Input
        three = findViewById(R.id.three);// Input
        four = findViewById(R.id.four);// Input
        five = findViewById(R.id.five);// Input
        six = findViewById(R.id.six);// Input
        seven = findViewById(R.id.seven);// Input
        eight = findViewById(R.id.eight);// Input
        nine = findViewById(R.id.nine);// Input
        zero = findViewById(R.id.zero);// Input
        devide = findViewById(R.id.divide);// Input
        multiply = findViewById(R.id.multiply);// Input
        add = findViewById(R.id.add);// Input
        del = findViewById(R.id.del);// Input
        equal = findViewById(R.id.eq);// Input
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        devide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        add.setOnClickListener(this);
        del.setOnClickListener(this);
        equal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.one:
                addInput("1");
                break;
            case R.id.two:
                addInput("2");
                break;
            case R.id.three:
                addInput("3");
                break;
            case R.id.four:
                addInput("4");
                break;
            case R.id.five:
                addInput("5");
                break;
            case R.id.six:
                addInput("6");
                break;
            case R.id.seven:
                addInput("7");
                break;
            case R.id.eight:
                addInput("8");
                break;
            case R.id.nine:
                addInput("9");
                break;
            case R.id.zero:
                addInput("0");
                break;
            case R.id.multiply:
                addInput("*");
                symbol = "*";
                break;
            case R.id.divide:
                addInput("/");
                symbol = "/";
                break;
            case R.id.add:
                addInput("+");
                symbol = "+";
                break;
            case R.id.subtract:
                addInput("-");
                symbol = "-";
                break;
            case R.id.eq:
                getSum();
                break;
        }
    }
    public void addInput(String num) {
        String temp = input.getText().toString() + num;
        input.setText(temp);
    }
    public void getSum() {
        String temp = input.getText().toString();
        if(temp.contains(symbol)) {
            String temp1 = temp.substring(0, temp.indexOf(symbol));
            String temp2 = temp.substring(temp.indexOf(symbol), temp.length() - 1);
            int one = Integer.parseInt(temp1);
            int two = Integer.parseInt(temp2);
            int sum = 0;
            switch (symbol) {

                case "*":
                    sum = one * two;
                    break;

                case "/":
                    sum = one / two;
                    break;

                case "-":
                    sum = one - two;
                    break;

                case "+":
                    sum = one + two;
                    break;
            }
            input.setText(" " + sum);
        }
    }
}
