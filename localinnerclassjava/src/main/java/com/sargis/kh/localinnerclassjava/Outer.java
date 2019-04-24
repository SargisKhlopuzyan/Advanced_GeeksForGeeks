package com.sargis.kh.localinnerclassjava;

import android.util.Log;

public class Outer {

//    Note : A local class can access local variables and parameters of the enclosing block that are effectively final.
//    For example, if you add the highlighted assignment statement in the Inner class constructor or in any method of Inner class:

    public void getValue() {

        // Note that local variable(sum) must be final till JDK 7
        // hence this code will work only in JDK 8
//        final int sum = 20;

        int sum = 20;

        // TODO
        // A local class can access local variables and parameters of the enclosing block that are effectively final.
        // Compilation error if not final
        //
        // Because of this assignment statement, the variable sum is not effectively final anymore.
        // As a result, the Java compiler generates an error message similar to “local variables referenced from an inner class must be final or effectively final”.
//        sum = 40; //TODO

        class Inner {

            public int divisor;
            public int remainder;

            public Inner() {
                divisor = 4;
                remainder = sum%divisor;
            }

            private int getDivisor()
            {
                return divisor;
            }

            private int getRemainder()
            {
                return sum%divisor;
            }

            private int getQuotient()
            {
                Log.e("LOG_TAG","Inside inner class");
                return sum / divisor;
            }

        }

        Inner inner = new Inner();
        Log.e("LOG_TAG", "Divisor = "+ inner.getDivisor());
        Log.e("LOG_TAG", "Remainder = " + inner.getRemainder());
        Log.e("LOG_TAG", "Quotient = " + inner.getQuotient());

    }

}