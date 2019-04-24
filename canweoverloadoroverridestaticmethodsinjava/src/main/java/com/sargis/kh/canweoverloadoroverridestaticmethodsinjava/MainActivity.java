package com.sargis.kh.canweoverloadoroverridestaticmethodsinjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    Following are some important points for method overriding and static methods in Java.

//    1) For class (or static) methods, the method according to the type of reference is called, not according to the object being referred,
//    which means method call is decided at compile time.
//
//    2) For instance (or non-static) methods, the method is called according to the type of object being referred,
//    not according to the type of reference, which means method calls is decided at run time.
//
//    3) An instance method cannot override a static method, and a static method cannot hide an instance method.
//
//    4) In a subclass (or Derived Class), we can overload the methods inherited from the superclass.
//    Such overloaded methods neither hide nor override the superclass methods — they are new methods, unique to the subclass

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sub sub = new Sub();
        Base subBase = new Sub();

        Base.display();
        sub.display();
        subBase.display();

    }
}