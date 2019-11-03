package com.example.tugaspb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tugaspb.R;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private Button back,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        back = findViewById(R.id.btn_back);
        back.setOnClickListener(this);

        next = findViewById(R.id.btn_next);
        next.setOnClickListener(this);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_back:
                finish();
                break;

            case R.id.btn_next:
                startActivity(new Intent(this, Profilku.class));


        }

    }
}
