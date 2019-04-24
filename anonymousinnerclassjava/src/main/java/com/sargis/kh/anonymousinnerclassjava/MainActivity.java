package com.sargis.kh.anonymousinnerclassjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

//It is an inner class without a name and for which only a single object is created.
// An anonymous inner class can be useful when making an instance of an object with certain “extras”
// such as overloading methods of a class or interface, without having to actually subclass a class.

//Anonymous inner class are mainly created in two ways:
//    Class (may be abstract or concrete)
//    Interface


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1) TODO
        //Here we are using Anonymous Inner class
        //that extends a class i.e. Here a Thread class
        Thread t1 = new Thread()
        {
            public void run()
            {
                Log.e("LOG_TAG","Child Thread 1");
            }
        };
        t1.start();
        Log.e("LOG_TAG","Main Thread 1");

        //*******************************************************************//

        //2) TODO
        //Here we are using Anonymous Inner class
        //that implements a interface i.e. Here Runnable interface

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                Log.e("LOG_TAG","Runnable - Child Thread 2");

            }
        };
        Thread t2 = new Thread(r2);
        t2.run();
        Log.e("LOG_TAG","Main Thread 2");

        //*******************************************************************//

        //3) TODO
        //Here we are using Anonymous Inner class
        //that define inside argument, here constructor argument

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.e("LOG_TAG","new Thread(new Runnable() - Child Thread 3");
            }
        });
        t3.start();
        Log.e("LOG_TAG","Main Thread 3");

        //*******************************************************************//

//        TODO - Difference between Normal/Regular class and Anonymous Inner class:
//        1) A normal class can implement any number of interfaces but anonymous inner class can implement only one interface
//           at a time. A regular class can extend a class and implement any number of interface simultaneously.
//        2) But anonymous Inner class can extend a class or can implement an interface but not both at a time.
//        3) For regular/normal class, we can write any number of constructors but we cant write any constructor
//           for anonymous Inner class because anonymous class does not have any name and while defining
//           constructor class name and constructor name must be same.
        Interface1 interface1 = new Interface1() {
        };
        NormalClass normalClass1 = new NormalClass() {
        };
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void print() {

            }
        };


        //*******************************************************************//

        //TODO - Accessing Local Variables of the Enclosing Scope, and Declaring and Accessing Members of the Anonymous Class
//        Like local classes, anonymous classes can capture variables; they have the same access to local variables of the enclosing scope:
//
//        An anonymous class has access to the members of its enclosing class.
//        An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final.
//        Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other declarations in the enclosing scope that have the same name.



//        //TODO - Anonymous classes also have the same restrictions as local classes with respect to their members:
//        1) We cannot declare static initializers or member interfaces in an anonymous class.
//        2) An anonymous class can have static members provided that they are constant variables.

//        TODO - Note that you can declare the following in anonymous classes:
//        3) Fields
//        4) Extra methods (even if they do not implement any methods of the supertype)
//        5) Instance initializers
//        6) Local classes
        NormalClass normalClass2 = new NormalClass() {
//            1)
//            static  int x = 10;
//            interface innerInterface {
//            }

//            2)
            int x = GLOBAL_CONSTANT;

//            3)
            int y = 10;

//            4)
            void secondFunction() {

                class InnerFunctionInnerClass {

                }

            }

//            5)
            Object obj = new Object();

//            6)
            class InnerInnerClass {

            }



        };
    }
}
