package com.sargis.kh.lambdaexpressionsjava8;

import android.util.Log;

//@java.lang.FunctionalInterface
public interface FunctionalInterfaceWithOneParameter {

    void abstractFunction(int x);

    default void defaultFunctionWithOneParameter1(int x) {
        Log.e("LOG_TAG", "defaultFunction1 -> x : " + x);
    }

}
