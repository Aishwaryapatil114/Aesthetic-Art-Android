package com.example.androidstudio11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class registration extends AppCompatActivity {
    ImageView fb,insta,tw,google;
    Button button;

    EditText username,pass ;

    TextView  back;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fb = findViewById(R.id.fb);
        insta = findViewById(R.id.insta);
        google = findViewById(R.id.google);
        tw = findViewById(R.id.tw);
        button = (Button) findViewById(R.id.loginbtn);
        username = (EditText) findViewById(R.id.Username);
        pass = findViewById(R.id.Password);


            back =findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            });





        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com");
            }

        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com");
            }

        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com");
            }

        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.twitter.com");
            }

        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}
