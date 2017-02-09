package com.example.angela.forceerror;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //forceError()

        Log.i(DEBUG_TAG "In thee on Create method of the Welcome App")
    }

    public void forceError(){
        if(true){
            throw new Error("Woops");
        }
    }
}
