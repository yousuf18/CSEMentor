package com.example.csementor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class algorithm_web_link extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm_web_link);
        getSupportActionBar().setTitle("Algorithm Link");
    }

    public void GeekforGeeks(View view) {
        Bundle bundle=new Bundle();
        bundle.putString("b", "algo_geek");
        Intent nextintent=new Intent(this, browsing.class);
        nextintent.putExtras(bundle);
        startActivity(nextintent);

    }

    public void tutorialpoint(View view) {
        Bundle bundle=new Bundle();
        bundle.putString("b", "algo_tuto");
        Intent nextintent=new Intent(this, browsing.class);
        nextintent.putExtras(bundle);
        startActivity(nextintent);
    }
    public void safu_Planet(View view) {
        Bundle bundle=new Bundle();
        bundle.putString("b", "algo_safu");
        Intent nextintent=new Intent(this, browsing.class);
        nextintent.putExtras(bundle);
        startActivity(nextintent);
    }

    /*public void safu_Planet(View view) {
        Intent intent=new Intent(algorithm_web_link.this, browsing.class);
        startActivity(intent);
    }*/
}
