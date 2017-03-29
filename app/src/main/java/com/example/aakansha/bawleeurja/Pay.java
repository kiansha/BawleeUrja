package com.example.aakansha.bawleeurja;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Pay extends AppCompatActivity {

    ListView list;
    String[] titles;
    String[] description;
    int[] imgs = {R.drawable.picture1, R.drawable.picture2, R.drawable.picture2, R.drawable.picture4, R.drawable.picture5, R.drawable.picture6,
            R.drawable.picture7, R.drawable.picture8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);


        Resources res = getResources();
        titles = res.getStringArray(R.array.titles);
        description = res.getStringArray(R.array.description);
        list = (ListView) findViewById(R.id.list1);
        MyAdapter adapter = new MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);


    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        int[] images;
        String[] mytitles;
        String[] myDescriptions;

        MyAdapter(Context c, String[] titles, int imgs[], String[] desc) {
            super(c, R.layout.row, R.id.text1, titles);
            this.context = c;
            this.images = imgs;
            this.mytitles = titles;
            this.myDescriptions = desc;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.row, parent, false);
            ImageView myImage = (ImageView) row.findViewById(R.id.icon);
            TextView myTitle = (TextView) row.findViewById(R.id.text1);
            TextView myDesc = (TextView) row.findViewById(R.id.text2);
            myImage.setImageResource(images[position]);
            myTitle.setText(mytitles[position]);
            myDesc.setText(myDescriptions[position]);

            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i= new Intent(Pay.this, Description.class);
                    startActivity(i);
                }
            });
            return row;
        }

    }
}