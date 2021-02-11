package com.zaguette.ordemdotruco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        TextView card_1 = (TextView) findViewById(R.id.card_1);
        TextView card_2 = (TextView) findViewById(R.id.card_2);
        TextView card_3 = (TextView) findViewById(R.id.card_3);
        TextView card_4 = (TextView) findViewById(R.id.card_4);
        TextView card_5 = (TextView) findViewById(R.id.card_5);
        TextView card_6 = (TextView) findViewById(R.id.card_6);
        TextView card_7 = (TextView) findViewById(R.id.card_7);
        TextView card_8 = (TextView) findViewById(R.id.card_8);
        TextView card_9 = (TextView) findViewById(R.id.card_9);
        TextView card_10 = (TextView) findViewById(R.id.card_10);

        TextView card_ord_1 = (TextView) findViewById(R.id.card_ord_1);
        TextView card_ord_2 = (TextView) findViewById(R.id.card_ord_2);
        TextView card_ord_3 = (TextView) findViewById(R.id.card_ord_3);
        TextView card_ord_4 = (TextView) findViewById(R.id.card_ord_4);
        TextView card_ord_5 = (TextView) findViewById(R.id.card_ord_5);
        TextView card_ord_6 = (TextView) findViewById(R.id.card_ord_6);
        TextView card_ord_7 = (TextView) findViewById(R.id.card_ord_7);
        TextView card_ord_8 = (TextView) findViewById(R.id.card_ord_8);
        TextView card_ord_9 = (TextView) findViewById(R.id.card_ord_9);
        TextView card_ord_10 = (TextView) findViewById(R.id.card_ord_10);
        TextView card_ord_n1 = (TextView) findViewById(R.id.card_ord_n1);
        TextView card_ord_n2 = (TextView) findViewById(R.id.card_ord_n2);
        TextView card_ord_n3 = (TextView) findViewById(R.id.card_ord_n3);
        TextView card_ord_n4 = (TextView) findViewById(R.id.card_ord_n4);
        Button button_voltar = (Button) findViewById(R.id.button_voltar);
        Button button_saibamais = (Button) findViewById(R.id.button_saibamais);

        DeixarVisivelButton();

        button_saibamais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PopupActivity.class));
            }
        });

        card_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("6");
                card_ord_3.setText("7");
                card_ord_4.setText("Q");
                card_ord_5.setText("J");
                card_ord_6.setText("K");
                card_ord_7.setText("A");
                card_ord_8.setText("2");
                card_ord_9.setText("3");
                card_ord_10.setText("5");
            }
        });

        card_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("5");
                card_ord_3.setText("7");
                card_ord_4.setText("Q");
                card_ord_5.setText("J");
                card_ord_6.setText("K");
                card_ord_7.setText("A");
                card_ord_8.setText("2");
                card_ord_9.setText("3");
                card_ord_10.setText("6");
            }
        });

        card_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("5");
                card_ord_3.setText("6");
                card_ord_4.setText("Q");
                card_ord_5.setText("J");
                card_ord_6.setText("K");
                card_ord_7.setText("A");
                card_ord_8.setText("2");
                card_ord_9.setText("3");
                card_ord_10.setText("7");
                }
        });

        card_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("5");
                card_ord_3.setText("6");
                card_ord_4.setText("7");
                card_ord_5.setText("J");
                card_ord_6.setText("K");
                card_ord_7.setText("A");
                card_ord_8.setText("2");
                card_ord_9.setText("3");
                card_ord_10.setText("Q");
            }
        });

        card_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("5");
                card_ord_3.setText("6");
                card_ord_4.setText("7");
                card_ord_5.setText("Q");
                card_ord_6.setText("K");
                card_ord_7.setText("A");
                card_ord_8.setText("2");
                card_ord_9.setText("3");
                card_ord_10.setText("J");
            }
        });

        card_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("5");
                card_ord_3.setText("6");
                card_ord_4.setText("7");
                card_ord_5.setText("Q");
                card_ord_6.setText("J");
                card_ord_7.setText("A");
                card_ord_8.setText("2");
                card_ord_9.setText("3");
                card_ord_10.setText("K");
            }
        });

        card_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("5");
                card_ord_3.setText("6");
                card_ord_4.setText("7");
                card_ord_5.setText("Q");
                card_ord_6.setText("J");
                card_ord_7.setText("K");
                card_ord_8.setText("2");
                card_ord_9.setText("3");
                card_ord_10.setText("A");
            }
        });

        card_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("5");
                card_ord_3.setText("6");
                card_ord_4.setText("7");
                card_ord_5.setText("Q");
                card_ord_6.setText("J");
                card_ord_7.setText("K");
                card_ord_8.setText("A");
                card_ord_9.setText("3");
                card_ord_10.setText("2");
            }
        });

        card_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();

                card_ord_1.setText("4");
                card_ord_2.setText("5");
                card_ord_3.setText("6");
                card_ord_4.setText("7");
                card_ord_5.setText("Q");
                card_ord_6.setText("J");
                card_ord_7.setText("K");
                card_ord_8.setText("A");
                card_ord_9.setText("2");
                card_ord_10.setText("3");
            }
        });

        card_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelOrd();
                card_ord_1.setText("5");
                card_ord_2.setText("6");
                card_ord_3.setText("7");
                card_ord_4.setText("Q");
                card_ord_5.setText("J");
                card_ord_6.setText("K");
                card_ord_7.setText("A");
                card_ord_8.setText("2");
                card_ord_9.setText("3");
                card_ord_10.setText("4");
            }
        });

        button_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeixarVisivelButton();
            }
        });
    }

    private void DeixarVisivelButton() {
        findViewById(R.id.card_1).setVisibility(View.VISIBLE);
        findViewById(R.id.card_2).setVisibility(View.VISIBLE);
        findViewById(R.id. card_3).setVisibility(View.VISIBLE);
        findViewById(R.id.card_4).setVisibility(View.VISIBLE);
        findViewById(R.id.card_5).setVisibility(View.VISIBLE);
        findViewById(R.id.card_6).setVisibility(View.VISIBLE);
        findViewById(R.id.card_7).setVisibility(View.VISIBLE);
        findViewById(R.id.card_8).setVisibility(View.VISIBLE);
        findViewById(R.id.card_9).setVisibility(View.VISIBLE);
        findViewById(R.id.card_10).setVisibility(View.VISIBLE);
        findViewById(R.id.button_saibamais).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_1).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_2).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_3).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_4).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_5).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_6).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_7).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_8).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_9).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_10).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_n1).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_n2).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_n3).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_n4).setVisibility(View.INVISIBLE);
        findViewById(R.id.button_voltar).setVisibility(View.INVISIBLE);
    }

    private void DeixarVisivelOrd(){
        findViewById(R.id.card_1).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_2).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_3).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_4).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_5).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_6).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_7).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_8).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_9).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_10).setVisibility(View.INVISIBLE);
        findViewById(R.id.button_saibamais).setVisibility(View.INVISIBLE);
        findViewById(R.id.card_ord_1).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_2).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_3).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_4).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_5).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_6).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_7).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_8).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_9).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_10).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_n1).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_n2).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_n3).setVisibility(View.VISIBLE);
        findViewById(R.id.card_ord_n4).setVisibility(View.VISIBLE);
        findViewById(R.id.button_voltar).setVisibility(View.VISIBLE);
    }
}