package com.e.androidretailapp.fragment.CartFragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.e.androidretailapp.R;
import com.e.androidretailapp.adapter.ProductAdapter;
import com.e.androidretailapp.adapter.ProductTrends;
import com.e.androidretailapp.model.Product;
import com.e.androidretailapp.model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

    public static List<Product> productList = new ArrayList<>();
    public static List<ProductCategory> productCategoriesList = new ArrayList<>();

    RecyclerView recyclerView;
    RecyclerView rvProduct;


    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_cart, container, false);

        recyclerView = root.findViewById(R.id.productRecyclerView);
        rvProduct = root.findViewById(R.id.rvProducts);

        ProductAdapter productAdapter = new ProductAdapter(CartFragment.productList);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);

        ProductTrends productCategory =  new ProductTrends(productCategoriesList, getContext());
        rvProduct.setAdapter(productCategory);
        rvProduct.setLayoutManager(layoutManager);

        return root;
    }

}
