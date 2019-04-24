package com.sargis.kh.lambdaexpressionsjava8;

import android.util.Log;

@java.lang.FunctionalInterface
public interface FunctionalInterfaceWithMultipleParameters {

    void abstractFunctionWithMultipleParameters(int x, int y);

    default void defaultFunctionWithMultipleParameters(int x, int y) {
        Log.e("LOG_TAG", "defaultFunction1 -> x : " + x + ", y: " + y);
    }

}
