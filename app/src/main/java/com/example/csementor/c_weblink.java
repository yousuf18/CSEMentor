package com.example.csementor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class c_weblink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_weblink);
        getSupportActionBar().setTitle("c link");
    }

    public void learnc(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("b", "c_tuto");
        Intent nextintent = new Intent(this, browsing.class);
        nextintent.putExtras(bundle);
        startActivity(nextintent);
    }
}
