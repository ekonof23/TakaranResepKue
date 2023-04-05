package com.example.resepkue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarResep extends AppCompatActivity {
    private Button rsp_gelek, rsp_putuayu, rsp_dadargulung, rsp_kuelapis, rsp_bolukukus, rsp_bolupanggang,
            rsp_cakwe, rsp_kuelumpur, rsp_ondeonde, rsp_kuecucur, rsp_kuelemet, rsp_kuemolen, rsp_apemkukus,
            rsp_kuenagasari, rsp_kuemangkok, rsp_kueserabi, rsp_kueputumayang, rsp_bakpao, rsp_kuepukis, rsp_bikaambon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_resep);

        rsp_gelek = findViewById(R.id.rsp_gelek);
        rsp_putuayu = findViewById(R.id.rsp_putuayu);
        rsp_dadargulung = findViewById(R.id.rsp_dadargulung);
        rsp_kuelapis = findViewById(R.id.rsp_kuelapis);
        rsp_bolukukus = findViewById(R.id.rsp_bolukukus);
        rsp_bolupanggang = findViewById(R.id.rsp_bolupanggang);
        rsp_cakwe = findViewById(R.id.rsp_cakwe);
        rsp_kuelumpur = findViewById(R.id.rsp_kuelumpur);
        rsp_ondeonde = findViewById(R.id.rsp_ondeonde);
        rsp_kuecucur = findViewById(R.id.rsp_kuecucur);
        rsp_kuelemet = findViewById(R.id.rsp_kuelemet);
        rsp_kuemolen = findViewById(R.id.rsp_kuemolen);
        rsp_apemkukus = findViewById(R.id.rsp_apemkukus);
        rsp_kuenagasari = findViewById(R.id.rsp_kuenagasari);
        rsp_kuemangkok = findViewById(R.id.rsp_kuemangkok);
        rsp_kueserabi = findViewById(R.id.rsp_kueserabi);
        rsp_kueputumayang = findViewById(R.id.rsp_kueputumayang);
        rsp_bakpao = findViewById(R.id.rsp_bakpao);
        rsp_kuepukis = findViewById(R.id.rsp_kuepukis);
        rsp_bikaambon = findViewById(R.id.rsp_bikaambon);

        rsp_gelek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepGelek.class));
            }
        });
        rsp_putuayu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepPutuAyu.class));
            }
        });
        rsp_dadargulung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepDadarGulung.class));

            }
        });
        rsp_kuelapis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKueLapis.class));
            }
        });
        rsp_bolukukus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepBoluKukus.class));
            }
        });
        rsp_bolupanggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepBoluPanggang.class));
            }
        });
        rsp_cakwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepCakwe.class));
            }
        });
        rsp_kuelumpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKueLumpur.class));
            }
        });
        rsp_ondeonde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepOndeOnde.class));
            }
        });
        rsp_kuecucur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKueCucur.class));
            }
        });
        rsp_kuelemet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKueLemet.class));
            }
        });
        rsp_kuemolen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKueMolen.class));
            }
        });
        rsp_apemkukus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepApemKukus.class));
            }
        });
        rsp_kuenagasari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKueNagasari.class));
            }
        });
        rsp_kuemangkok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKueMangkok.class));
            }
        });
        rsp_kueserabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKueSerabi.class));
            }
        });
        rsp_kueputumayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepPutuMayang.class));
            }
        });
        rsp_bakpao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepBakpao.class));
            }
        });
        rsp_kuepukis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepKuePukis.class));
            }
        });
        rsp_bikaambon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ResepBikaAmbon.class));
            }
        });

    }

}