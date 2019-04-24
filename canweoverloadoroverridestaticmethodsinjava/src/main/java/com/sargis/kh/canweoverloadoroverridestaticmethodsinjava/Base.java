package com.sargis.kh.canweoverloadoroverridestaticmethodsinjava;

import android.util.Log;

public abstract class Base {

    public static void display() {
        Log.e("LOG_TAG", "Static or class method from Base");
    }

    // Non-static method which will be overridden in derived class
    public void print()  {
        Log.e("LOG_TAG", "Non-static or Instance method from Base");
    }

    private void privatePrint()  {
        Log.e("LOG_TAG", "Non-static or Instance method from Base - privatePrint");
    }

}