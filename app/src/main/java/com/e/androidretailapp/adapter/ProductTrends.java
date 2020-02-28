package com.e.androidretailapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.e.androidretailapp.R;

import com.e.androidretailapp.model.ProductCategory;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProductTrends extends RecyclerView.Adapter<ProductTrends.StoryViewHolder> {

   List<ProductCategory> trendsList;
   Context mContext;

    public ProductTrends(List<ProductCategory> listStories, Context mContext) {
        this.trendsList = trendsList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.product_cart_cart, parent, false);

        return new StoryViewHolder(view, mContext, trendsList);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        ProductCategory story = trendsList.get(position);
        holder.story.setImageResource(story.getProductPhoto());
        holder.name.setText(story.getProductName());
    }

    @Override
    public int getItemCount() {
        return trendsList.size();
    }

    public class StoryViewHolder extends RecyclerView.ViewHolder{

        CircleImageView story;
        TextView name;
        Context mContext;
        List<ProductCategory> list;

        public StoryViewHolder(@NonNull View itemView, final Context mContext, final List<ProductCategory> list) {
            super(itemView);
            story = itemView.findViewById(R.id.imgInstaStory);

            this.mContext = mContext ;
            this.list = list;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ProductCategory story = list.get(getAdapterPosition());
                    Toast.makeText(mContext, "" + story.getProductName(), Toast.LENGTH_SHORT).show();

                }
            });

        }

    }
}
