package com.example.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button tntgsy;
    TextView sosmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sosmed = findViewById(R.id.social_media);
        sosmed.setOnClickListener(this);

        tntgsy = findViewById(R.id.tentang_saya);
        tntgsy.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.social_media:
                startActivity(new Intent(this, SocialMedia.class));
                break;

            case R.id.tentang_saya:
                startActivity(new Intent(this, TentangSaya.class));
                break;
        }

    }
}
