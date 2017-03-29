package com.example.aakansha.bawleeurja;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Agriculture extends AppCompatActivity {

    ListView list;
    String[] titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);

        getSupportActionBar().setTitle("Agriculture");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colour1)));
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colour2));
        }

        Resources res = getResources();
        titles = res.getStringArray(R.array.courses);
        list = (ListView) findViewById(R.id.lv);
        MyAdapter adapter = new MyAdapter(this,titles);
        list.setAdapter(adapter);
    }


    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String [] course;
        MyAdapter(Context c,String[] titles)
        {
            super(c,R.layout.lv_activity,R.id.text1,titles);
            this.context=c;
            this.course =titles;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.lv_activity,parent,false);
           // ImageView myImage = (ImageView) row.findViewById(R.id.icon);
            TextView myTitle = (TextView) row.findViewById(R.id.text1);
           // TextView myDesc = (TextView) row.findViewById(R.id.text2);
           // myImage.setImageResource(images[position]);
            myTitle.setText(course[position]);
           // myDesc.setText(myDescriptions[position]);

            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i= new Intent(Agriculture.this, Course.class);
                    startActivity(i);
                }
            });
            return row;

        }


    }


}
