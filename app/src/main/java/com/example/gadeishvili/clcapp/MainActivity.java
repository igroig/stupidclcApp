package com.example.gadeishvili.clcapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvCalc;
    private Button bN1;
    private Button bN2;
    private Button bN3;
    private Button bN4;
    private Button bN5;
    private Button bN6;
    private Button bN7;
    private Button bN8;
    private Button bN9;
    private Button bN0;
    private Button bDelete;
    private Button bPlus;
    private Button bSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }


    private void setTvCalc(String n) {
        String old = tvCalc.getText().toString();
        tvCalc.setText(old + n);
    }


    public void onClicked(View view) {
        switch (view.getId()) {
            case R.id.bN1:
                setTvCalc("1");
                break;
            case R.id.bN2:
                setTvCalc("2");
                break;
            case R.id.bN3:
                setTvCalc("3");
                break;
            case R.id.bN4:
                setTvCalc("4");
                break;
            case R.id.bN5:
                setTvCalc("5");
                break;
            case R.id.bN6:
                setTvCalc("6");
                break;
            case R.id.bN7:
                setTvCalc("7");
                break;
            case R.id.bN8:
                setTvCalc("8");
                break;
            case R.id.bN9:
                setTvCalc("9");
                break;
            case R.id.bN0:
                setTvCalc("0");
                break;
            case R.id.bDelete:
                delete();
                break;
            case R.id.bPlus:
           setTvCalc("-");

                break;
            case R.id.bSum:
                sum();
                 break;
        }
    }

    private void sum() {


        String a = tvCalc.getText().toString();
        String [] parts = a.split("-");

        String a1 = parts[0];
        String a2 = parts[1];

        int x1 = Integer.parseInt(a1);
        int x2 = Integer.parseInt(a2);
        int sum = x1-x2;
        tvCalc.setText(Integer.toString(sum));
    }

    private void delete() {
        String old = tvCalc.getText().toString();
        if (!old.equals("") && old.length() > 0) {
            old = old.substring(0, old.length() - 1);
            tvCalc.setText(old);
        }
    }

    private void initView() {
        tvCalc = (TextView) findViewById(R.id.tvCalc);
        bN1 = (Button) findViewById(R.id.bN1);
        bN2 = (Button) findViewById(R.id.bN2);
        bN3 = (Button) findViewById(R.id.bN3);
        bN4 = (Button) findViewById(R.id.bN4);
        bN5 = (Button) findViewById(R.id.bN5);
        bN6 = (Button) findViewById(R.id.bN6);
        bN7 = (Button) findViewById(R.id.bN7);
        bN8 = (Button) findViewById(R.id.bN8);
        bN9 = (Button) findViewById(R.id.bN9);
        bN0 = (Button) findViewById(R.id.bN0);
        bDelete = (Button) findViewById(R.id.bDelete);
        bPlus = (Button) findViewById(R.id.bPlus);

        bSum = (Button) findViewById(R.id.bSum);
    }

}
