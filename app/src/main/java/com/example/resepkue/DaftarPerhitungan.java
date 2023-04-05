package com.example.resepkue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarPerhitungan extends AppCompatActivity {
    private Button btn_Hitung1, btn_Hitung2, btn_Hitung3, btn_Hitung4, btn_Hitung5, btn_Hitung6, btn_Hitung7, btn_Hitung8,
    btn_Hitung9, btn_Hitung10, btn_Hitung11, btn_Hitung12, btn_Hitung13, btn_Hitung14, btn_Hitung15, btn_Hitung16, btn_Hitung17,
    btn_Hitung18, btn_Hitung19, btn_Hitung20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_perhitungan);

        btn_Hitung1 = findViewById(R.id.btn_hitung1);
        btn_Hitung2 = findViewById(R.id.btn_hitung2);
        btn_Hitung3 = findViewById(R.id.btn_hitung3);
        btn_Hitung4 = findViewById(R.id.btn_hitung4);
        btn_Hitung5 = findViewById(R.id.btn_hitung5);
        btn_Hitung6 = findViewById(R.id.btn_hitung6);
        btn_Hitung7 = findViewById(R.id.btn_hitung7);
        btn_Hitung8 = findViewById(R.id.btn_hitung8);
        btn_Hitung9 = findViewById(R.id.btn_hitung9);
        btn_Hitung10= findViewById(R.id.btn_hitung10);
        btn_Hitung11= findViewById(R.id.btn_hitung11);
        btn_Hitung12= findViewById(R.id.btn_hitung12);
        btn_Hitung13= findViewById(R.id.btn_hitung13);
        btn_Hitung14= findViewById(R.id.btn_hitung14);
        btn_Hitung15= findViewById(R.id.btn_hitung15);
        btn_Hitung16= findViewById(R.id.btn_hitung16);
        btn_Hitung17= findViewById(R.id.btn_hitung17);
        btn_Hitung18= findViewById(R.id.btn_hitung18);
        btn_Hitung19= findViewById(R.id.btn_hitung19);
        btn_Hitung20= findViewById(R.id.btn_Hitung20);

        btn_Hitung1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganGelek.class));
            }
        });

        btn_Hitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganPutuAyu.class));
            }
        });

        btn_Hitung3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganDadarGulung.class));
            }
        });

        btn_Hitung4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKueLapis.class));
            }
        });

        btn_Hitung5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganBoluKukus.class));
            }
        });

        btn_Hitung6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganBoluPanggang.class));
            }
        });

        btn_Hitung7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganCakwe.class));
            }
        });

        btn_Hitung8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKueLumpur.class));
            }
        });

        btn_Hitung9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganOndeOnde.class));
            }
        });

        btn_Hitung10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKueCucur.class));
            }
        });

        btn_Hitung11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKueLemet.class));
            }
        });

        btn_Hitung12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKueMolen.class));
            }
        });

        btn_Hitung13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganApemKukus.class));
            }
        });

        btn_Hitung14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKueNagasari.class));
            }
        });

        btn_Hitung15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKueMangkok.class));
            }
        });

        btn_Hitung16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKueSerabi.class));
            }
        });

        btn_Hitung17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKuePutuMayang.class));
            }
        });

        btn_Hitung18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganBakpao.class));
            }
        });

        btn_Hitung19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganKuePukis.class));
            }
        });

        btn_Hitung20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerhitunganBikaAmbon.class));
            }
        });

    }
}