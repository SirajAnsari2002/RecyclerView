package com.example.animalapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Item> itemList;

    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item item = itemList.get(position);

        holder.aimage.setImageResource(item.getImageId());
        holder.name1.setText(item.getAnimalName());
        holder.type1.setText(item.getAnimalType());

    }

    @Override
    public int getItemCount() {

        return itemList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView aimage;
        TextView name1;
        TextView type1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            aimage = itemView.findViewById(R.id.animal);
            name1 = itemView.findViewById(R.id.name);
            type1 = itemView.findViewById(R.id.type);
        }

    }


}
