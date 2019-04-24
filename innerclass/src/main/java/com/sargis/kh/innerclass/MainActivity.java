package com.sargis.kh.innerclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

//1) Nested Inner class
//2) Method Local inner classes
//3) Static nested classes
//4) Anonymous inner classes

public class MainActivity extends AppCompatActivity {

    int x = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Outer.Inner inner = new Outer().new Inner();
        inner.show();

        Outer outer = new Outer();
        outer.outerMethod();

        outer.demo.showAnonymousInner(40);

        outer.hello.show(45);

    }

}