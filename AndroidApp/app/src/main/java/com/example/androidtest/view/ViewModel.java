package com.example.androidtest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidtest.R;
import com.example.androidtest.model.Model;

public class ViewModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void Clicked(android.view.View view) {
        Model modelContent = new Model(); //wrapper Model class
        String getUppercase = modelContent.uppercase; //finder uppercase variablen i modelContent
        String lowerCase = getUppercase.toLowerCase();//laver uppercase til lowercase

        TextView txt = (TextView)findViewById(R.id.Text1);
        txt.setText(lowerCase); //viser lowerCase

        modelContent.notifyObservers();

    }
}