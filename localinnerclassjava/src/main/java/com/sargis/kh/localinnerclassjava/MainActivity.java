package com.sargis.kh.localinnerclassjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//        TODO Rules of Local Inner Class:
//
//        1) The scope of local inner class is restricted to the block they are defined in.
//        2) Local inner class cannot be instantiated from outside the block where it is created in.
//        3) Till JDK 7,Local inner class can access only final local variable of the enclosing block.
//           However From JDK 8, it is possible to access the non-final local variable of enclosing block in local inner class.
//        4) A local class has access to the members of its enclosing class.
//        5) Local inner classes can extend an abstract class or can also implement an interface.

//        TODO
//        Inner classes cannot be declared as static

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Outer outer = new Outer();
        outer.getValue();
    }
}
