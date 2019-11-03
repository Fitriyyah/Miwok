package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static String TEST_KEY = "test_key";
    TextView test_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        test_text = findViewById(R.id.text_diterima);

        String text = getIntent().getStringExtra("test_value");
        test_text.setText(text);
    }
}
