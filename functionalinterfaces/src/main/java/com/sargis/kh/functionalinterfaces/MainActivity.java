package com.sargis.kh.functionalinterfaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a list of strings
        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");

        Predicate<String> predicate = (String s) -> s.startsWith("G");


        for (String str: names) {
            if (predicate.test(str)) {
                Log.e("LOG_TAG", "str: " + str);
            }
        }
    }
}
