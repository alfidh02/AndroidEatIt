package com.example.androideatit.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androideatit.Interface.ItemClickListener;
import com.example.androideatit.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView foods_name;
    public ImageView foods_image;

    private ItemClickListener itemClickListener;


    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        foods_name = itemView.findViewById(R.id.nama_foods);
        foods_image = itemView.findViewById(R.id.gambar_foods);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
