package com.example.csementor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class C_plus_plus_wl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_plus_plus_wl);
        getSupportActionBar().setTitle("c++ link");


        //a
    }

    public void codeacademy(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("b", "cplus_c_academy");
        Intent nextintent = new Intent(this, browsing.class);
        nextintent.putExtras(bundle);
        startActivity(nextintent);
    }
}
