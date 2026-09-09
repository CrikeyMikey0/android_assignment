package com.example.madassignment1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class prod_adapter extends RecyclerView.Adapter<prod_adapter.ProductViewHolder> {
    ArrayList<Product> products;

    public prod_adapter(ArrayList<Product> products) {
        this.products = products;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView prodname;
        TextView prodprice;

    }
}
