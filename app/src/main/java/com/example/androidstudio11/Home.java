package com.example.androidstudio11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {
     Button art , artist ,artsupply;
     TextView back ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        back =findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });

        art =(Button)findViewById(R.id.art);
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Art.class);
                startActivity(intent);
            }
        });


        artist = (Button) findViewById(R.id.artist1);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Artist.class);
                startActivity(intent);
            }
        });


        artsupply=(Button)findViewById(R.id.artsupply);
        artsupply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Artsupply.class);
                startActivity(intent);
            }
        });



    }
}