package com.sargis.kh.lambdaexpressionsjava8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

//    Enable to treat functionality as a method argument, or code as data.
//    A function that can be created without belonging to any class.
//    A lambda expression can be passed around as if it was an object and executed on demand.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //************************** Functional Interface With One Parameter **************************/

        FunctionalInterfaceWithOneParameter functionalInterfaceWithOneParameter = (int x) -> Log.e("LOG_TAG", "X: " + x);

        functionalInterfaceWithOneParameter.abstractFunction(5);

        functionalInterfaceWithOneParameter.defaultFunctionWithOneParameter1(56);


        
        //************************** Functional Interface With Multiple Parameters **************************/

//        FunctionalInterfaceWithMultipleParameters functionalInterfaceWithMultipleParameters = (x, y) -> {
        FunctionalInterfaceWithMultipleParameters functionalInterfaceWithMultipleParameters = (int x, int y) -> {
            Log.e("LOG_TAG", "FunctionalInterfaceWithMultipleParameters: x: " + x + ", y: " + y);
        };

        functionalInterfaceWithMultipleParameters.abstractFunctionWithMultipleParameters(5, 7);

    }
}
