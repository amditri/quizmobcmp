package com.example.pustikom.adapterplay.com.example.pustikom;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.pustikom.adapterplay.com.example.pustikom.user.Student;

public class StudentDbHelper extends SQLiteOpenHelper{

    private StudentDbHelper dbHelper;

    public static final String DATABASE_NAME="college.db";
    public static final int DATABASE_VERSION=1;

    public StudentDbHelper (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE" + StudentContract.TABLE_NAME + " " +
                StudentContract._ID + "INTEGER PRIMARY KEY AUTOINCREMENT" +
                StudentContract.COLUMN_NIM + "TEXT NOT NULL" +
                StudentContract.COLUMN_NAME + "TEXT NOT NULL" +
                StudentContract.COLUMN_GENDER + "INTEGER NOT NULL" +
                StudentContract.COLUMN_EMAIL + "TEXT" +
                StudentContract.COLUMN_PHONE + "NUMBER";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //empty
    }

    public void insertStudent (SQLiteDatabase db, Student student){
        ContentValues values = new ContentValues();
        values.put(StudentContract.COLUMN_NIM, student.getNoreg());
        values.put(StudentContract.COLUMN_NAME, student.getName());
        values.put(StudentContract.COLUMN_GENDER, student.getGender());
        values.put(StudentContract.COLUMN_EMAIL, student.getMail());
        values.put(StudentContract.COLUMN_PHONE, student.getPhone());
        db.insert(StudentContract.TABLE_NAME, null, values);
    }

    public void updateStudent (SQLiteDatabase db, Student student){
        ContentValues values = new ContentValues();
        values.put(StudentContract.COLUMN_NIM, student.getNoreg());
        values.put(StudentContract.COLUMN_NAME, student.getName());
        values.put(StudentContract.COLUMN_GENDER, student.getGender());
        values.put(StudentContract.COLUMN_EMAIL, student.getMail());
        values.put(StudentContract.COLUMN_PHONE, student.getPhone());
        String condition = StudentContract._ID + "= ?";
        String[] conditionArgs = {student.getId() + " "};
        db.update(StudentContract.TABLE_NAME, values, condition, conditionArgs);
    }

    public void deleteStudent (SQLiteDatabase db, Student student){
        ContentValues values = new ContentValues();
        values.put(StudentContract.COLUMN_NIM, student.getNoreg());
        values.put(StudentContract.COLUMN_NAME, student.getName());
        values.put(StudentContract.COLUMN_GENDER, student.getGender());
        values.put(StudentContract.COLUMN_EMAIL, student.getMail());
        values.put(StudentContract.COLUMN_PHONE, student.getPhone());
        String selection = StudentContract._ID + "= ?";
        String[] selectionArgs = {student.getId() + " "};
        db.delete(StudentContract.TABLE_NAME, selection, selectionArgs);
    }

    public void truncateStudent (SQLiteDatabase db, Student student){
        String SQL_TRUNCATE_TABLE =  "DELETE FROM " + StudentContract.TABLE_NAME;
        String SQL_VACUUM = "VACUUM";
        db.execSQL(SQL_TRUNCATE_TABLE);
        db.execSQL(SQL_VACUUM);
    }

    public void fetchStudent (SQLiteDatabase db, Student student){
        ContentValues values = new ContentValues();
        values.put(StudentContract.COLUMN_NIM, student.getNoreg());
        values.put(StudentContract.COLUMN_NAME, student.getName());
        values.put(StudentContract.COLUMN_GENDER, student.getGender());
        values.put(StudentContract.COLUMN_EMAIL, student.getMail());
        values.put(StudentContract.COLUMN_PHONE, student.getPhone());
        String condition = StudentContract._ID + "= ?";
        String[] conditionArgs = {student.getId() + " "};
        db.update(StudentContract.TABLE_NAME, values, condition, conditionArgs);
    }

}
