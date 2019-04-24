package com.sargis.kh.howareparameterspassedinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// In Java, parameters are always passed by value.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        Log.e("LOG_TAG", "i = " + i + ", j = " + j);

        MyClass myClass1 = new MyClass(10);
        MyClass myClass2 = new MyClass(20);

        swapTWithT(myClass1, myClass2);
        Log.e("LOG_TAG", "T1 = " + myClass1.x + ", T2 = " + myClass2.x);
    }

    public static void swap(Integer i, Integer j) {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }

    public static <T> void swapTWithT(T t1, T t2) {
        T temp = t1;
        t1 = t2;
        t2 = temp;
    }

    class MyClass {
        int x = 0;
        public MyClass(int _x) {
            x = _x;
        }
    }

}