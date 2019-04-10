package com.example.csementor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class java_weblink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_weblink);
        getSupportActionBar().setTitle("Java Link");
    }

    public void java(View view) {
        Bundle bundle=new Bundle();
        bundle.putString("b", "Learn_Java");
        Intent nextintent=new Intent(this, browsing.class);
        nextintent.putExtras(bundle);
        startActivity(nextintent);
    }

    public void tutorialpoint(View view) {
        Bundle bundle=new Bundle();
        bundle.putString("b", "Java_tuto");
        Intent nextintent=new Intent(this, browsing.class);
        nextintent.putExtras(bundle);
        startActivity(nextintent);
    }
}
