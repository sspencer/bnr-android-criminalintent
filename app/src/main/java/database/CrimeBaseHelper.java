package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import database.CrimeDbSchema.CrimeTable;

/**
 * Created by sspencer on 2/16/16.
 */
public class CrimeBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public CrimeBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = String.format("CREATE TABLE %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s, %s, %s, %s, %s)",
                CrimeTable.NAME,
                CrimeTable.Cols.UUID,
                CrimeTable.Cols.TITLE,
                CrimeTable.Cols.DATE,
                CrimeTable.Cols.SOLVED,
                CrimeTable.Cols.SUSPECT
        );

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
