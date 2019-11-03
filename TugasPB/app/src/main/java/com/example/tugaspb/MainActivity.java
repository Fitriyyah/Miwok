package com.example.tugaspb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugaspb.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnMove ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.buka_profil);
        btnMove.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buka_profil:
                startActivity(new Intent(this, SecondActivity.class));
                break;
        }

    }
}
