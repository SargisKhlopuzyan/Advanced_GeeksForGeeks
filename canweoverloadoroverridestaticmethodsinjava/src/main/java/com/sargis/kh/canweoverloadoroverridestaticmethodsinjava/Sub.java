package com.sargis.kh.canweoverloadoroverridestaticmethodsinjava;

import android.util.Log;

public class Sub extends Base {

//    public static void display() {
//        Log.e("LOG_TAG", "Static or class method from Sub");
//    }

    // TODO - Static is removed here (Causes Compiler Error)
//    public void display() {
//        Log.e("LOG_TAG", "Non-static method from Derived");
//    }

    // TODO -  Static is added here (Causes Compiler Error)
//    public static void print() {
//        Log.e("LOG_TAG", "Static method from Derived");
//    }

    // TODO - If in Base class it is private => Compilation Error will be shown
//    @Override
//    public void privatePrint()  {
//        Log.e("LOG_TAG", "Non-static or Instance method from Base - privatePrint");
//    }

}
