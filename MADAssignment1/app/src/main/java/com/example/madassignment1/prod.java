package com.example.madassignment1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class prod extends Fragment {

    public prod() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_prod, container, false);

        RecyclerView recyclerView =
                view.findViewById(R.id.prodrecycle);

        String[] names = {
                "Laptop",
                "Mobile",
                "Headphones",
                "Keyboard"
        };

        String[] prices = {
                "₹50000",
                "₹25000",
                "₹2000",
                "₹1500"
        };

        recyclerView.setLayoutManager(
                new LinearLayoutManager(requireContext()));
        prod_adapter adapter =
                new prod_adapter(names, prices);

        recyclerView.setAdapter(adapter);
        return view;
    }
}