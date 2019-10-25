package com.example.carpark;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyVehicleFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View root =  inflater.inflate(R.layout.activity_my_vehicle, container, false);
        Toolbar toolbar = root.findViewById(R.id.toolbar);

        FloatingActionButton fab = root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transactionIntent = new Intent(getContext(), TransactionActivity.class);
                startActivity(transactionIntent);
                Snackbar.make(root, "Add new Vehicle", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        return root;
    }
}
