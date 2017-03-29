package com.example.aakansha.bawleeurja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Scholarship extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);

        getSupportActionBar().setTitle("Scholarship");

        Toast.makeText(Scholarship.this, "Click on it to get information", Toast.LENGTH_LONG).show();

        CardView kadam= (CardView) findViewById(R.id.tv_name);
        CardView protsahan= (CardView) findViewById(R.id.tv_name1);

        kadam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.findViewById(R.id.kadam).getVisibility()==View.GONE){

                    v.findViewById(R.id.kadam).setVisibility(View.VISIBLE);
                }

                else
                    v.findViewById(R.id.kadam).setVisibility(View.GONE);
            }
        });

        protsahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.findViewById(R.id.protsahan).getVisibility()==View.GONE){

                    v.findViewById(R.id.protsahan).setVisibility(View.VISIBLE);
                }

                else
                    v.findViewById(R.id.protsahan).setVisibility(View.GONE);
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i= new Intent(Scholarship.this,AfterLogIn.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
