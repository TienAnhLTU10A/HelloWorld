package com.tienanh.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;

    Button button4;
    Button button5;
    Button button6;

    Button button7;
    Button button8;
    Button button9;

    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demoview);
        button1 = (Button)findViewById(R.id.bt1);
        button2 = (Button)findViewById(R.id.bt2);
        button3 = (Button)findViewById(R.id.bt3);

        button4 = (Button)findViewById(R.id.bt4);
        button5 = (Button)findViewById(R.id.bt5);
        button6 = (Button)findViewById(R.id.bt6);

        button7 = (Button)findViewById(R.id.bt7);
        button8 = (Button)findViewById(R.id.bt8);
        button9 = (Button)findViewById(R.id.bt9);

        result = (EditText)findViewById(R.id.edText1);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                addTextButton(button1.getText().toString());
                break;
            case R.id.bt2:
                addTextButton(button2.getText().toString());
                break;
            case R.id.bt3:
                addTextButton(button3.getText().toString());
                break;
            case R.id.bt4:
                addTextButton(button4.getText().toString());
                break;
            case R.id.bt5:
                addTextButton(button5.getText().toString());
                break;
            case R.id.bt6:
                addTextButton(button6.getText().toString());
                break;
            case R.id.bt7:
                addTextButton(button7.getText().toString());
                break;
            case R.id.bt8:
                addTextButton(button8.getText().toString());
                break;
            case R.id.bt9:
                addTextButton(button9.getText().toString());
                break;
        }

    }

    private void addTextButton(String addContent) {
        String content = result.getText().toString() + addContent;
        result.setText(content);
    }
}
