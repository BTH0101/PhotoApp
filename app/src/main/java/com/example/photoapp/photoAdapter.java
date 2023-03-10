package com.example.photoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

class photoAdapter extends RecyclerView.Adapter<photoholder> {

    List<photo> photoList;
    Context context;

    public photoAdapter(List<photo> photoList, Context context) {
        this.photoList = photoList;
        this.context = context;
    }


    @NonNull
    @Override
    public photoholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new photoholder(LayoutInflater.from(context).inflate(R.layout.photo_disp_tpl, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull photoholder holder, int position) {
        holder.textView.setText(photoList.get(position).title);

        Picasso.get().load(photoList.get(position).getSource()).into(holder.imageView);

    }


    @Override
    public int getItemCount() {
        return photoList.size();
    }
}
