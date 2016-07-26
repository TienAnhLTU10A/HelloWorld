package com.tienanh.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class luuthongtincanhan extends AppCompatActivity {
    String getName, getAge, getAddress;
    TextView textViewName2, textViewAge2, textViewAddress2;
    TextView textViewskillEnglish, textViewskillJapanese, textViewskillJava, textViewskillAndroid;
    TextView textViewSavedHobbies;
    boolean checkEnglish, checkJapanese, checkJava, checkAndroid, checkMale, checkFemale;
    Button buttonBack;
    ImageView ImgMale, ImgFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luuthongtincanhan);
        buttonBack = (Button) findViewById(R.id.btnBack);
        ImgMale = (ImageView) findViewById(R.id.imgmale);
        ImgFemale = (ImageView) findViewById(R.id.imgfemale);
        textViewName2 = (TextView) findViewById(R.id.textviewName2);
        textViewAge2 = (TextView) findViewById(R.id.textviewAge2);
        textViewAddress2 = (TextView) findViewById(R.id.textviewAddress2);
        textViewSavedHobbies =(TextView)findViewById(R.id.tvSavedHobbies);

        textViewskillEnglish = (TextView) findViewById(R.id.tvenglish);
        textViewskillJapanese = (TextView) findViewById(R.id.tvjapan);
        textViewskillJava = (TextView) findViewById(R.id.tvjava);
        textViewskillAndroid = (TextView) findViewById(R.id.tvandroid);

        textViewskillEnglish.setVisibility(textViewskillEnglish.INVISIBLE);
        textViewskillJapanese.setVisibility(textViewskillJapanese.INVISIBLE);
        textViewskillJava.setVisibility(textViewskillAndroid.INVISIBLE);
        textViewskillAndroid.setVisibility(textViewskillAndroid.INVISIBLE);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        getName = bundle.getString("Name", "ABC");
        getAge = bundle.getString("Age", "0");
        getAddress = bundle.getString("Address", "Hanoi");
        textViewName2.setText(getName);
        textViewAddress2.setText(getAddress);
        textViewAge2.setText(getAge);
        textViewSavedHobbies.setText(bundle.getString("Hobbies","Null"));

        checkEnglish = bundle.getBoolean("English", false);
        checkJapanese = bundle.getBoolean("Japanese", false);
        checkJava = bundle.getBoolean("Java", false);
        checkAndroid = bundle.getBoolean("Android", false);
        checkMale = bundle.getBoolean("Male", false);
        checkFemale = bundle.getBoolean("Female", false);

        if (checkEnglish == true) {
            textViewskillEnglish.setVisibility(textViewskillEnglish.VISIBLE);
        } else if (checkEnglish == false)
            textViewskillEnglish.setVisibility(textViewskillEnglish.GONE);

        if (checkJapanese == true) {
            textViewskillJapanese.setVisibility(textViewskillJapanese.VISIBLE);
        } else if (checkJapanese == false)
            textViewskillJapanese.setVisibility(textViewskillJapanese.GONE);

        if (checkJava == true) {
            textViewskillJava.setVisibility(textViewskillJava.VISIBLE);
        } else if (checkJava == false) textViewskillJava.setVisibility(textViewskillJava.GONE);

        if (checkAndroid == true) {
            textViewskillAndroid.setVisibility(textViewskillAndroid.VISIBLE);
        } else if (checkAndroid == false)
            textViewskillAndroid.setVisibility(textViewskillAndroid.GONE);

        if (checkMale == true) {
            ImgMale.setVisibility(ImgMale.VISIBLE);
        } else if (checkMale == false) ImgMale.setVisibility(ImgMale.GONE);
        if (checkFemale == true) {
            ImgMale.setVisibility(ImgFemale.VISIBLE);
        } else if (checkFemale == false) ImgFemale.setVisibility(ImgFemale.GONE);


        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(luuthongtincanhan.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
