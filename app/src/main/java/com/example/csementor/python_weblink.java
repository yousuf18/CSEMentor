package com.example.csementor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class python_weblink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_weblink);
        getSupportActionBar().setTitle("python link");
    }

    public void learnpython(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("b", "learn_python");
        Intent nextintent = new Intent(this, browsing.class);
        nextintent.putExtras(bundle);
        startActivity(nextintent);
    }
}
