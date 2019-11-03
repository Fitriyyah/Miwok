package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1_click);
        btn2 = findViewById(R.id.btn2_click);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
            @Override
                    public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn1_click:
                        Toast.makeText(getApplicationContext(), "BTN1 DI KLIK", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.btn2_click:
                        Toast.makeText(getApplicationContext(), "BTN2 DI KLIK", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
}
