package com.zaguette.ordemdotruco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

public class PopupActivity extends AppCompatActivity {

    ImageView github;
    ImageView linkedin;
    ImageView email;
    ImageView whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        getSupportActionBar().hide();

        DisplayMetrics metricas = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metricas);
        int comprimento = metricas.widthPixels;
        int altura = metricas.heightPixels;

        getWindow().setLayout((int) (comprimento*0.5),(int) (altura*0.3));


        github = (ImageView) findViewById(R.id.github);
        linkedin = (ImageView) findViewById(R.id.linkedin);
        email = (ImageView) findViewById(R.id.email);
        whatsapp = (ImageView) findViewById(R.id.whatsapp);



        String url_github = "https://github.com/m-zaguette";
        String url_linkedin = "https://www.linkedin.com/in/marcelozaguettejunior/";
        String url_email = "mailto:Mzaguettej@hotmail.com";
        String url_whatsapp = "https://api.whatsapp.com/send?phone=5515991300709&text=Gostar%C3%ADamos%20de%20agendar%20uma%20entrevista%20com%20voc%C3%AA!";


        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse(url_github)));
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse(url_linkedin)));
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse(url_email)));
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse(url_whatsapp)));
            }
        });
    }
}