package com.example.resepkue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PerhitunganGelek extends AppCompatActivity {
    EditText Ed_Grm, EdTerigu, EdGula, EdMentega, EdMauripan, EdSoda, EdPanili, EdAirHangat, EdHrgTerigu, EdHrgGula, EdHrgMentega, EdHrgMauripan, EdHrgSoda, EdHrgPanili, EdTotal;
    Button btn_Hitung,btn_Simpan;
    double vGr, vTr, vGl, vMy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perhitungan_gelek);
        Ed_Grm = (EditText) findViewById(R.id.Ed_Grm);
        EdTerigu = (EditText) findViewById(R.id.Ed_Terigu);
        EdGula = (EditText) findViewById(R.id.Ed_Gl);
        EdMentega = (EditText) findViewById(R.id.Ed_Mentega);
        EdMauripan = (EditText) findViewById(R.id.Ed_Mauripan);
        EdSoda = (EditText) findViewById(R.id.Ed_Soda);
        EdPanili = (EditText) findViewById(R.id.Ed_Panili);
        EdAirHangat = (EditText) findViewById(R.id.Ed_AirHangat);
        EdHrgTerigu = (EditText) findViewById(R.id.Ed_hrgTerigu);
        EdHrgGula = (EditText) findViewById(R.id.Ed_HrgGula);
        EdHrgMentega = (EditText) findViewById(R.id.Ed_HrgMentega);
        EdHrgMauripan = (EditText) findViewById(R.id.Ed_HrgMauripan);
        EdHrgSoda = (EditText) findViewById(R.id.Ed_HrgSoda);
        EdHrgPanili = (EditText) findViewById(R.id.Ed_HrgPanili);
        EdTotal = (EditText) findViewById(R.id.Ed_Total);
        btn_Hitung = (Button) findViewById(R.id.btn_Hitung);
        btn_Simpan = (Button) findViewById(R.id.btn_Simpan);

        EdTerigu = findViewById(R.id.Ed_Terigu);
        EdGula = findViewById(R.id.Ed_Gl);
        EdMentega = findViewById(R.id.Ed_Mentega);
        EdMauripan = findViewById(R.id.Ed_Mauripan);
        EdSoda = findViewById(R.id.Ed_Soda);
        EdPanili = findViewById(R.id.Ed_Panili);
        EdAirHangat = findViewById(R.id.Ed_AirHangat);
        EdHrgTerigu = findViewById(R.id.Ed_hrgTerigu);
        EdHrgGula = findViewById(R.id.Ed_HrgGula);
        EdHrgMentega = findViewById(R.id.Ed_HrgMentega);
        EdHrgMauripan = findViewById(R.id.Ed_HrgMauripan);
        EdHrgSoda = findViewById(R.id.Ed_HrgSoda);
        EdHrgPanili = findViewById(R.id.Ed_HrgPanili);

        btn_Simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getEdTerigu = EdTerigu.getText().toString();
                String getEdGula = EdGula.getText().toString();
                String  getEdMentega = EdMentega.getText().toString();
                String  getEdMauripan = EdMauripan.getText().toString();
                String  getEdSoda = EdSoda.getText().toString();
                String  getEdPanili = EdPanili.getText().toString();
                String  getEdAirHangat = EdAirHangat.getText().toString();
                String getEdHrgTerigu = EdHrgTerigu.getText().toString();
                String getEdHrgGula = EdHrgGula.getText().toString();
                String getEdHrgMentega = EdHrgMentega.getText().toString();
                String getEdHrgMauripan = EdHrgMauripan.getText().toString();
                String getEdHrgSoda = EdHrgSoda.getText().toString();
                String getEdHrgPanili = EdHrgPanili.getText().toString();

                if(getEdTerigu.trim().equals("")){
                    EdTerigu.setError("Terigu Tidak Boleh Kosong");
                }
                else  if (getEdGula.trim().equals("")){
                    EdGula.setError("Gula Tidak Boleh Kosong");
                }
                else if (getEdMentega.trim().equals("")){
                    EdMentega.setError("Mentega Tidak Boleh Kosong");
                }
                else if (getEdMauripan.trim().equals("")){
                    EdMauripan.setError("Mauripan Tidak Boleh Kosong");
                }
                else if (getEdSoda.trim().equals("")){
                    EdSoda.setError("Soda Tidak Boleh Kosong");
                }
                else if (getEdPanili.trim().equals("")){
                    EdPanili.setError("Panili Tidak Boleh Kosong");
                }
                else if (getEdAirHangat.trim().equals("")){
                    EdAirHangat.setError("Air Hangat Tidak Boleh Kosong");
                }
                else if (getEdHrgTerigu.trim().equals("")){
                    EdHrgTerigu.setError("Harga Terigu Tidak Boleh Kosong");
                }
                else if (getEdHrgGula.trim().equals("")){
                    EdHrgGula.setError("Harga Gula Tidak Boleh Kosong");
                }
                else if (getEdHrgMentega.trim().equals("")){
                    EdHrgMentega.setError("Harga Mentega Tidak Boleh Kosong");
                }
                else if (getEdHrgMauripan.trim().equals("")){
                    EdHrgMauripan.setError("Harga Mauripan Tidak Boleh Kosong");
                }
                else if (getEdHrgSoda.trim().equals("")){
                    EdHrgSoda.setError("Harga Soda Tidak Boleh Kosong");
                }
                else if (getEdHrgPanili.trim().equals("")){
                    EdHrgPanili.setError("Harga Panili Tidak Boleh Kosong");
                }
                else {
                    MyDatabaseHelper myDB = new MyDatabaseHelper(PerhitunganGelek.this);
                    long eksekusi = myDB.tambahResep( getEdTerigu, getEdGula, getEdMentega, getEdMauripan, getEdSoda, getEdPanili, getEdAirHangat);

                    if (eksekusi == -1){
                        Toast.makeText(PerhitunganGelek.this, "Gagal Menambah Data Resep", Toast.LENGTH_SHORT).show();
                        EdTerigu.requestFocus();
                    }
                    else {
                        Toast.makeText(PerhitunganGelek.this,"Resep Berhasil Ditambah", Toast.LENGTH_SHORT).show();
                        finish();
                    }

                }
            }
        });

    }

    public void Hitung(View view) {

        try {
            int ngram = Integer.parseInt(Ed_Grm.getText().toString());
            double nTerigu = ngram * 1.;
            double nGula = ngram * 0.6;
            double nMentega = ngram * 0.5;
            double nMauripan = ngram * 10.;
            double nSoda = ngram * 0.1;
            double nPanili = ngram * 0.2;
            double nAirHangat = ngram * 0.2;
            double nHrgTerigu = ngram * 12.;
            double nHrgGula = ngram * 6.5;
            double nHrgMentega = ngram * 1.;
            double nHrgMauripan = ngram * 2.;
            double nHrgSoda = ngram * 0.1;
            double nHrgPanili = ngram * 0.5;
            double nTotal = nHrgTerigu + nHrgGula + nHrgMentega + nHrgMauripan + nHrgSoda + nHrgPanili;

            EdTerigu.setText(String.valueOf(nTerigu));
            EdGula.setText(String.valueOf(nGula));
            EdMentega.setText(String.valueOf(nMentega));
            EdMauripan.setText(String.valueOf(nMauripan));
            EdSoda.setText(String.valueOf(nSoda));
            EdPanili.setText(String.valueOf(nPanili));
            EdAirHangat.setText(String.valueOf(nAirHangat));
            EdHrgTerigu.setText(String.valueOf(nHrgTerigu));
            EdHrgGula.setText(String.valueOf(nHrgGula));
            EdHrgMentega.setText(String.valueOf(nHrgMentega));
            EdHrgMauripan.setText(String.valueOf(nHrgMauripan));
            EdHrgSoda.setText(String.valueOf(nHrgSoda));
            EdHrgPanili.setText(String.valueOf(nHrgPanili));
            EdTotal.setText(String.valueOf(nTotal));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}