package com.example.androidtest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidtest.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clicked(View view) {
        TextView txt = (TextView)findViewById(R.id.Text1);
        txt.setText("You clicked the button");
    }
}