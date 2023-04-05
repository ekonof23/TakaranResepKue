package com.example.resepkue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Histori extends AppCompatActivity {
    FloatingActionButton fabTambah;
    private RecyclerView rvResep;
    MyDatabaseHelper myDB;
    MyDatabaseHelper.MyDatabaseHelper2 myDB2;
    AdapterResep adapterResep;
    ArrayList<String> arrTerigu, arrGula, arrMentega, arrID, arrMauripan, arrSoda,
            arrPanili, arrAirHangat;
    public static int posisiData = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histori);

        rvResep = findViewById(R.id.rv_resep);

        myDB = new MyDatabaseHelper(Histori.this);

    }

    public void bukaActivityTambah(View view) {
        startActivity(new Intent(Histori.this, DaftarPerhitungan.class));

    }

    private void SQLitetoArrayList() {
        Cursor cursor = myDB.bacaSemuaData();
        if (cursor.getCount() == 0) {
            Toast.makeText(this, "Tidak ada data", Toast.LENGTH_SHORT).show();
        }
        else {
            while (cursor.moveToNext()){
                arrID.add(cursor.getString(0));
                arrTerigu.add(cursor.getString(1));
                arrGula.add(cursor.getString(2));
                arrMentega.add(cursor.getString(3));
                arrMauripan.add(cursor.getString(4));
                arrSoda.add(cursor.getString(5));
                arrPanili.add(cursor.getString(6));
                arrAirHangat.add(cursor.getString(7));

            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        arrID = new ArrayList<>();
        arrTerigu = new ArrayList<>();
        arrGula = new ArrayList<>();
        arrMentega = new ArrayList<>();
        arrMauripan = new ArrayList<>();
        arrSoda = new ArrayList<>();
        arrPanili = new ArrayList<>();
        arrAirHangat = new ArrayList<>();


        SQLitetoArrayList();

        rvResep = findViewById(R.id.rv_resep);

        rvResep.setAdapter(adapterResep);
        rvResep.setLayoutManager(new LinearLayoutManager(Histori.this));


    }
}





