package com.example.resepkue;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private Context ctx;
    private static final String DATABASE_NAME = "db_perhitungan";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "tbl_perhitungan";
    private static final String FIELD_ID = "id";
    private static final String FIELD_TERIGU = "terigu";
    private static final String FIELD_GULA = "gula";
    private static final String FIELD_MENTEGA = "mentega";
    private static final String FIELD_MAURIPAN = "mauripan";
    private static final String FIELD_SODA = "soda";
    private static final String FIELD_PANILI = "panili";
    private static final String FIELD_AIR_HANGAT = "airhangat";

    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.ctx = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " (" +
                FIELD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                FIELD_TERIGU + " TEXT, " +
                FIELD_GULA + " TEXT, " +
                FIELD_MENTEGA + " TEXT, " +
                FIELD_MAURIPAN + " TEXT, " +
                FIELD_SODA + " TEXT, " +
                FIELD_PANILI + " TEXT, " +
                FIELD_AIR_HANGAT + " TEXT ); ";

        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public long tambahResep(String terigu, String gula, String mentega, String mauripan, String soda, String panili, String airhangat) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(FIELD_TERIGU, terigu);
        cv.put(FIELD_GULA, gula);
        cv.put(FIELD_MENTEGA, mentega);
        cv.put(FIELD_MAURIPAN, mauripan);
        cv.put(FIELD_SODA, soda);
        cv.put(FIELD_PANILI, panili);
        cv.put(FIELD_AIR_HANGAT, airhangat);

        long eksekusi = db.insert(TABLE_NAME, null, cv);
        return eksekusi;
    }

    public long hapusResep(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        long eksekusi = db.delete(TABLE_NAME, "id= ?", new String[]{id});

        return eksekusi;
    }

    public Cursor bacaSemuaData() {
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null) {
            cursor = db.rawQuery(query, null);
        }

        return cursor;
    }

    public static class MyDatabaseHelper2 extends SQLiteOpenHelper {
        private Context ctx;
        private static final String DATABASE_NAME = "db_putuayu";
        private static final int DATABASE_VERSION = 1;

        private static final String TABLE_NAME = "tbl_putuayu";
        private static final String FIELD_ID = "id";
        private static final String FIELD_TERIGU = "terigu";
        private static final String FIELD_GULA = "gula";
        private static final String FIELD_TEPUNGMAIZENA = "tepung maizena";
        private static final String FIELD_TELUR = "telur";
        private static final String FIELD_SP = "sp";
        private static final String FIELD_PANILI = "panili";
        private static final String FIELD_GARAM = "garam";
        private static final String FIELD_SANTAN = "santan";
        private static final String FIELD_PASTAPANDAN = "pastapandan";
        private static final String FIELD_DAUNPANDAN = "daunpandan";

        public MyDatabaseHelper2(@Nullable Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.ctx = context;
        }

        @Override
        public void onCreate(SQLiteDatabase db2) {
            String query = "CREATE TABLE " + TABLE_NAME + " (" +
                    FIELD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    FIELD_TERIGU + " TEXT, " +
                    FIELD_GULA + " TEXT, " +
                    FIELD_TEPUNGMAIZENA + "TEXT, " +
                    FIELD_TELUR + " TEXT, " +
                    FIELD_SP + " TEXT, " +
                    FIELD_PANILI + " TEXT, " +
                    FIELD_GARAM + " TEXT , " +
                    FIELD_SANTAN + " TEXT , " +
                    FIELD_PASTAPANDAN + " TEXT , " +
                    FIELD_DAUNPANDAN + " TEXT ); ";

            db2.execSQL(query);


        }

        @Override
        public void onUpgrade(SQLiteDatabase db2, int i, int i1) {

        }

        public long tambahResep2(String terigu, String gula, String tepungmaizena, String telur, String sp,
                                   String panili, String garam, String santan, String pastapandan, String daunpandan) {


            {
                SQLiteDatabase db2 = this.getWritableDatabase();
                ContentValues cv = new ContentValues();

                cv.put(MyDatabaseHelper2.FIELD_TERIGU, terigu);
                cv.put(MyDatabaseHelper2.FIELD_GULA, gula);
                cv.put(MyDatabaseHelper2.FIELD_TEPUNGMAIZENA, tepungmaizena);
                cv.put(MyDatabaseHelper2.FIELD_TELUR, telur);
                cv.put(MyDatabaseHelper2.FIELD_SP, sp);
                cv.put(MyDatabaseHelper2.FIELD_PANILI, panili);
                cv.put(MyDatabaseHelper2.FIELD_GARAM, garam);
                cv.put(MyDatabaseHelper2.FIELD_SANTAN, santan);
                cv.put(MyDatabaseHelper2.FIELD_PASTAPANDAN, pastapandan);
                cv.put(MyDatabaseHelper2.FIELD_DAUNPANDAN, daunpandan);

                long eksekusi = db2.insert(TABLE_NAME, null, cv);
                return eksekusi;


            }
        }
    }
}

