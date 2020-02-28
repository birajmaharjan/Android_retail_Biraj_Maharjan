package com.e.androidretailapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.e.androidretailapp.R;
import com.e.androidretailapp.model.Product;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.PostViewHolder>{

    private List<Product> list;

    public ProductAdapter(List<Product> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_card, parent, false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Product product = list.get(position);
        holder.tvUsername.setText(product.getProductName());
        holder.tvCaption.setText(product.getProductCode());
        holder.imgProfilePicPost.setImageResource(product.getImg());
        holder.imgPost.setImageResource(product.getImg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgProfilePicPost;
        ImageView imgPost;
        TextView tvUsername, tvCaption;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfilePicPost = itemView.findViewById(R.id.imgProfilePicPost);
            imgPost = itemView.findViewById(R.id.imgPost);
            tvCaption = itemView.findViewById(R.id.tvCaption);
            tvUsername = itemView.findViewById(R.id.tvUsername);

        }
    }

}
