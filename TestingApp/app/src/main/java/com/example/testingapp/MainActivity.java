package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CardView card1,card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = findViewById(R.id.buton1);
        card2 = findViewById(R.id.buton2);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }

    public void onClick (View view){
        switch (view.getId()){
            case R.id.buton1 :
                Intent move1 = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(move1);
                break;
            case R.id.buton2 :
                Intent move2 = new Intent ( MainActivity.this, CourseActivity.class);
                startActivity(move2);
                break;
        }
    }
}