package com.example.csementor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Home");

    }

    public void algorithm(View view) {
        Intent intent=new Intent(MainActivity.this, algorithm_web_link.class);
        startActivity(intent);

    }

    public void java(View view) {
        Intent yousuf = new Intent(MainActivity.this,java_weblink.class);
        startActivity(yousuf);
    }

    public void cplusplus(View view) {
        Intent yf = new Intent(MainActivity.this,C_plus_plus_wl.class);
        startActivity(yf);
    }

    public void python(View view) {
        Intent yfp = new Intent(MainActivity.this,python_weblink.class);
        startActivity(yfp);
    }

    public void learn_c(View view) {
        Intent yfc = new Intent(MainActivity.this,c_weblink.class);
        startActivity(yfc);
    }

    public void teacher(View view) {

        Intent yft = new Intent(MainActivity.this,teacher_cse.class);
        startActivity(yft);
    }

}
