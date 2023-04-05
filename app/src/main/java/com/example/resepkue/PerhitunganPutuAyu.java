package com.example.resepkue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PerhitunganPutuAyu extends AppCompatActivity {
    EditText  EdGrmptay, EdTerigu, EdGl, EdTepungMaizena, EdTelur, EdSP, EdPanili, EdGaram, EdSantan, EdPastaPandan, EdDaunPandan;
    Button btn_Hitung2,btn_Simpan;
    double vGr, vTr, vGl, vMy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perhitungan_putu_ayu);
        EdGrmptay = (EditText) findViewById(R.id.Ed_Grmptay);
        EdTerigu = (EditText) findViewById(R.id.Ed_Terigu);
        EdGl = (EditText) findViewById(R.id.Ed_Gl);
        EdTepungMaizena = (EditText) findViewById(R.id.Ed_TepungMaizena);
        EdTelur = (EditText) findViewById(R.id.Ed_Telur);
        EdSP = (EditText) findViewById(R.id.Ed_SP);
        EdPanili = (EditText) findViewById(R.id.Ed_Panili);
        EdGaram = (EditText) findViewById(R.id.Ed_Garam);
        EdSantan = (EditText) findViewById(R.id.Ed_Santan);
        EdPastaPandan = (EditText) findViewById(R.id.Ed_PastaPandan);
        EdDaunPandan = (EditText) findViewById(R.id.Ed_DaunPandan);
        btn_Hitung2 = (Button) findViewById(R.id.btn_Hitung2);
        btn_Simpan = (Button) findViewById(R.id.btn_Simpan);

        EdTerigu = findViewById(R.id.Ed_Terigu);
        EdGl = findViewById(R.id.Ed_Gl);
        EdTepungMaizena = findViewById(R.id.Ed_TepungMaizena);
        EdTelur = findViewById(R.id.Ed_Telur);
        EdSP = findViewById(R.id.Ed_SP);
        EdPanili = findViewById(R.id.Ed_Panili);
        EdGaram = findViewById(R.id.Ed_Garam);
        EdSantan = findViewById(R.id.Ed_Santan);
        EdPastaPandan = findViewById(R.id.Ed_PastaPandan);
        EdDaunPandan = findViewById(R.id.Ed_DaunPandan);

        btn_Simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getEdTerigu = EdTerigu.getText().toString();
                String getEdGula = EdGl.getText().toString();
                String getEdTepungMaizena = EdTepungMaizena.getText().toString();
                String getEdTelur = EdTelur.getText().toString();
                String getEdSP = EdSP.getText().toString();
                String getEdPanili = EdPanili.getText().toString();
                String getEdGaram = EdGaram.getText().toString();
                String getEdSantan = EdSantan.getText().toString();
                String getEdPastaPandan = EdPastaPandan.getText().toString();
                String getEdDaunPandan = EdDaunPandan.getText().toString();

                if (getEdTerigu.trim().equals("")) {
                    EdTerigu.setError("Terigu Tidak Boleh Kosong");
                } else if (getEdGula.trim().equals("")) {
                    EdGl.setError("Gula Tidak Boleh Kosong");
                } else if (getEdTepungMaizena.trim().equals("")) {
                    EdTepungMaizena.setError("Tepung Maizena Tidak Boleh Kosong");
                } else if (getEdTelur.trim().equals("")) {
                    EdTelur.setError("Telur Tidak Boleh Kosong");
                } else if (getEdSP.trim().equals("")) {
                    EdSP.setError("SP Tidak Boleh Kosong");
                } else if (getEdPanili.trim().equals("")) {
                    EdPanili.setError("Panili Tidak Boleh Kosong");
                } else if (getEdGaram.trim().equals("")) {
                    EdGaram.setError("Garam Tidak Boleh Kosong");
                } else if (getEdSantan.trim().equals("")) {
                    EdSantan.setError("Santan Tidak Boleh Kosong");
                } else if (getEdPastaPandan.trim().equals("")) {
                    EdPastaPandan.setError("Harga Gula Tidak Boleh Kosong");
                } else if (getEdDaunPandan.trim().equals("")) {
                    EdDaunPandan.setError("Harga Mentega Tidak Boleh Kosong");
                } else {
                    MyDatabaseHelper.MyDatabaseHelper2 myDB = new MyDatabaseHelper.MyDatabaseHelper2(PerhitunganPutuAyu.this);
                    long eksekusi = (long) myDB.tambahResep2( getEdTerigu, getEdGula, getEdTepungMaizena, getEdTelur, getEdSP, getEdPanili, getEdGaram, getEdSantan, getEdPastaPandan, getEdDaunPandan);

                    if (eksekusi == -1) {
                        Toast.makeText(PerhitunganPutuAyu.this, "Gagal Menambah Data Resep", Toast.LENGTH_SHORT).show();
                        EdTerigu.requestFocus();
                    } else {
                        Toast.makeText(PerhitunganPutuAyu.this, "Resep Berhasil Ditambah", Toast.LENGTH_SHORT).show();
                        finish();
                    }

                }
            }
        });
    }


    public void Hitung(View view) {

        try {
            int ngram = Integer.parseInt(EdGrmptay.getText().toString());
            double nTerigu = ngram * 1.;
            double nGula = ngram * 0.7;
            double nTepungMaizena = ngram * 0.5;
            double nTelur = ngram * 10.;
            double nSP = ngram * 0.1;
            double nPanili = ngram * 0.2;
            double nGaram = ngram * 0.2;
            double nSantan = ngram * 12.;
            double nPastaPandan = ngram * 6.5;
            double nDaunPandan = ngram * 1.;

            EdTerigu.setText(String.valueOf(nTerigu));
            EdGl.setText(String.valueOf(nGula));
            EdTepungMaizena.setText(String.valueOf(nTepungMaizena));
            EdTelur.setText(String.valueOf(nTelur));
            EdSP.setText(String.valueOf(nSP));
            EdPanili.setText(String.valueOf(nPanili));
            EdGaram.setText(String.valueOf(nGaram));
            EdSantan.setText(String.valueOf(nSantan));
            EdPastaPandan.setText(String.valueOf(nPastaPandan));
            EdDaunPandan.setText(String.valueOf(nDaunPandan));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}