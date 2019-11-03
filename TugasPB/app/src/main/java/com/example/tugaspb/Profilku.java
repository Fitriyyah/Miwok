package com.example.tugaspb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profilku extends AppCompatActivity implements View.OnClickListener {

    private TextView foto;
    private ImageView foto1, ig,next_foto;
    private Button more, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilku);

        foto = findViewById(R.id.buka_galeri);
        foto.setOnClickListener(this);

        foto1 = findViewById(R.id.click_pictures);
        foto1.setOnClickListener(this);

        more = findViewById(R.id.buka_biografi);
        more.setOnClickListener(this);

        next_foto=findViewById(R.id.next_foto);
        next_foto.setOnClickListener(this);

        back = findViewById(R.id.btn_back);
        back.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ig = findViewById(R.id.click_instagram);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/serraselvia");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try{
                    Toast.makeText(Profilku.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/serraselvia")));
                }
            }
        });
    }

    public void email (View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"selviaserraa@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari aplikasi android");

        try {
            startActivity(Intent.createChooser(intent, "do you want to sent email?"));
        } catch (android.content.ActivityNotFoundException ex) {
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    @Override
    public void onClick (View view){
        switch (view.getId()) {
            case R.id.buka_galeri:
                startActivity(new Intent(this, Galeri.class));
                break;

            case R.id.click_pictures:
                startActivity(new Intent(this, Galeri.class));
                break;

            case R.id.buka_biografi:
                startActivity(new Intent(this, SecondActivity.class));
                break;

            case R.id.btn_back:
                finish();
                break;

            case R.id.next_foto:
                startActivity(new Intent(this, Galeri.class));
        }

    }
}
