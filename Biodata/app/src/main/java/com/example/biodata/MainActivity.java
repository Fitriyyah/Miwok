package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button medsos, abtme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medsos = findViewById(R.id.media_sosial);
        medsos.setOnClickListener(this);

        abtme = findViewById(R.id.about_me);
        abtme.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.media_sosial:
                startActivity(new Intent(this, MediaSosial.class));
                break;

            case R.id.about_me:
                startActivity(new Intent(this, AboutMe.class));
        }
    }
}
