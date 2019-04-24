package com.sargis.kh.innerclass;

import android.util.Log;


public class Outer {

    int x = 10;

//    1) Nested Inner class
    class Inner {

        public void show() {
            Log.e("LOG_TAG","In a nested class method -> x :" + x);
        }

//        We can’t have static method in a nested inner class
//        because an inner class is implicitly associated with an object of its outer class
//        so it cannot define any static method for itself.
//        For example the following program doesn’t compile.

//        public void static staticMethod() {}

    }

    //*********************************************************************************

//    2) Method Local inner classes
    void outerMethod() {

        int xxxx_not_final = 500;
        final int xxxx_final = 1000;

        class MethodInner {

            int yyyy = 20;

            void innerMethod(int zzzz) {

                Log.e("LOG_TAG","In a Method Local inner classes inside innerMethod -> x :" + x);
                Log.e("LOG_TAG","In a Method Local inner classes inside innerMethod -> yyyy :" + yyyy);
                Log.e("LOG_TAG","In a Method Local inner classes inside innerMethod -> zzzz :" + zzzz);
                Log.e("LOG_TAG","In a Method Local inner classes inside innerMethod -> xxxx_final :" + xxxx_final);

                // Method Local inner classes can’t use local variable of outer method until that local variable is not declared as final.
                Log.e("LOG_TAG","In a Method Local inner classes inside innerMethod -> xxxx_not_final :" + xxxx_not_final);
            }

        }

        MethodInner y = new MethodInner();
        y.innerMethod(50);
    }

    //*********************************************************************************

//    3) Static inner class
//    3) Static nested classes
    static class InnerStatic {
        public static void main(String[] args) {
            Log.e("LOG_TAG","Inside inner class Method");
            outerStaticMethod();
        }
    }

    private static void outerStaticMethod() {
        Log.e("LOG_TAG","Inside outerMethod");
    }

    //*********************************************************************************

//    4) Anonymous inner classes
//    a) As subclass of specified type
    class Demo {
        public void showAnonymousInner(int x) {
            Log.e("LOG_TAG","Anonymous inner classes ** I am in showAnonymousInner method of super class ** -> x: " + x);
        }
    }

    Demo demo = new Demo() {
        @Override
        public void showAnonymousInner(int x) {
                super.showAnonymousInner(x);
                Log.e("LOG_TAG","Anonymous inner classes ** I am in Flavor1Demo class ** -> x: " + x);
        }
    };

//    b) As implementer of the specified interface
    interface Hello {
        void show(int x);
    }

    Hello hello = new Hello() {
        @Override
        public void show(int x) {
            Log.e("LOG_TAG","I am in anonymous class ** As implementer of the specified interface ** -> x: " + x);
        }
    };
}