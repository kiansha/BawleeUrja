package com.example.aakansha.bawleeurja;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Knowledge extends AppCompatActivity {


    ImageView v1;
    ImageView v2;
    ImageView v3;

    String url = "http://www.thebetterindia.com/84807/union-budget-agriculture-farmer/";
    String url1 = "http://www.forbesindia.com/blog/economy-policy/the-path-to-effectively-scaling-skill-development-programmes/";
    String url2 = "http://www.thehygienecompany.com/top-5-tips-kitchen-hygiene";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge);
        getSupportActionBar().setTitle("Knowledge Center");
        v1 = (ImageView) findViewById(R.id.imageView);
        v1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url2));
                startActivity(i);
            }
        });
        v2 = (ImageView) findViewById(R.id.imageView1);
        v2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        v3 = (ImageView) findViewById(R.id.imageView2);
        v3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url1));
                startActivity(i);
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i= new Intent(Knowledge.this,AfterLogIn.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

}