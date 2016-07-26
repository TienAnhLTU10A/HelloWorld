package com.tienanh.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonSave,buttonClear;
    EditText editTextName,editTextAge,editTextAddress,editTextHobbies;
    String Name,Age,Address;
    CheckBox English,Japanese,Java,Android;
    RadioButton male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtincannhan);
        buttonSave = (Button)findViewById(R.id.btnSave);
        buttonClear = (Button)findViewById(R.id.btnClear);
        editTextName = (EditText)findViewById(R.id.EditTextName);
        editTextAge = (EditText)findViewById(R.id.EditTextAge);
        editTextAddress = (EditText)findViewById(R.id.EditTextAddress);
        editTextHobbies = (EditText)findViewById(R.id.EditTextHobbies);
        English = (CheckBox)findViewById(R.id.skillEnglish);
        Japanese = (CheckBox)findViewById(R.id.skillJapanese);
        Java = (CheckBox)findViewById(R.id.skillJava);
        Android = (CheckBox)findViewById(R.id.skillAndroid);
        male =(RadioButton)findViewById(R.id.radioMale);
        female =(RadioButton)findViewById(R.id.radioFemale);


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name = editTextName.getText().toString();
                Age = editTextAge.getText().toString();
                Address = editTextAddress.getText().toString();
                //Toast a = Toast.makeText(MainActivity.this,Name,Toast.LENGTH_LONG);
                //a.show();
                Intent intent = new Intent(MainActivity.this,luuthongtincanhan.class);
                intent.putExtra("data", "demo");
                Bundle bundle = new Bundle();
                bundle.putString("Name",Name);
                bundle.putString("Age",Age);
                bundle.putString("Address",Address);
                bundle.putString("Hobbies",editTextHobbies.getText().toString());
                bundle.putBoolean("English",English.isChecked());
                bundle.putBoolean("Japanese",Japanese.isChecked());
                bundle.putBoolean("Java",Java.isChecked());
                bundle.putBoolean("Android",Android.isChecked());
                bundle.putBoolean("Male",male.isChecked());
                bundle.putBoolean("Female",female.isChecked());
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextName.setText("");
                editTextAge.setText("");
                editTextAddress.setText("");
            }
        });

        }
    }


