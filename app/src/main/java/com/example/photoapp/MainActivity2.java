package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent= getIntent();
        int id= intent.getIntExtra("id",0);
        ImageView imageView= (ImageView) findViewById(R.id.imageView);
        Picasso.get().load(photoData.photoList.get(id).getSource() ).into(imageView);

        TextView textView= (TextView) findViewById(R.id.textView);
        textView.setText(photoData.photoList.get(id).getTitle());
        TextView    textView2= (TextView) findViewById(R.id.textView2);
        textView2.setText(photoData.photoList.get(id).getDescription());

    }
}