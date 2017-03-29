package com.example.aakansha.bawleeurja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NGO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo);

        getSupportActionBar().setTitle("NGO");

        ImageView register= (ImageView) findViewById(R.id.register);
        ImageView pay= (ImageView) findViewById(R.id.pay);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(NGO.this,Register.class);
                startActivity(i);
            }
        });

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(NGO.this,Pay.class);
                startActivity(i);
            }
        });
    }
}
