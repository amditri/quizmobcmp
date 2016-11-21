package com.example.pustikom.adapterplay.com.example.pustikom;

import android.provider.BaseColumns;

import com.example.pustikom.adapterplay.com.example.pustikom.user.Student;

public class StudentContract {

    public static final String TABLE_NAME = "student";
    public static final String _ID = BaseColumns._ID;
    public final static String COLUMN_NIM ="noreg";
    public final static String COLUMN_NAME = "name";
    public final static String COLUMN_GENDER = "gender";
    public final static String COLUMN_EMAIL = "email";
    public final static String COLUMN_PHONE = "phone";

    //public Student(int id, String noreg, String name, int gender, String email, String phone);

}
