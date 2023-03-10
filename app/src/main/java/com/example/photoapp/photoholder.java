package com.example.photoapp;





import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class photoholder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView textView;
    ImageView imageView;
    public photoholder(@NonNull View itemView) {
        super(itemView);
        textView= itemView.findViewById(R.id.tv_title);
imageView=itemView.findViewById(R.id.imv_photo);
itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d("TAG", "onClick: "+getAdapterPosition());



    }

}
