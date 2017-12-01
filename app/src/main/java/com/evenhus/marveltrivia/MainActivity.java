package com.evenhus.marveltrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    CallOnHttp callOnHttp;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callOnHttp = new CallOnHttp();
        try {
            result = callOnHttp.execute("https://comicvine.gamespot.com/profile/theoptimist/lists/top-100-marvel-characters/32199/").get();

            String[] splitResult = result.split("<ul class=\"editorial user-list js-simple-paginator-container\">");
            Log.i("Content of page", result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void charChoosen(View view){

    }
}
