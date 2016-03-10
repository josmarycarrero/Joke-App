package com.jc.laughtertime.paid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jc.laughtertime.FetchJoke;
import com.jc.laughtertime.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void tellJoke(View view) {
        new FetchJoke(MainActivity.this).execute();
    }


}
