package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBio;
    private Button btnSosmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBio = findViewById(R.id.Btn_Biodata);
        btnSosmed = findViewById(R.id.Btn_SosialMedia);

        btnBio.setOnClickListener(this);
        btnSosmed.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.Btn_Biodata:
                startActivity(new Intent( this, MyProfile.class));
                break;
            case R.id.Btn_SosialMedia:
                startActivity(new Intent(this, LifeGoals.class));
                break;
        }
    }
}
