package com.minhpt.DrawerNavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.minhpt.DrawerNavigation.databinding.ActivityMain2Binding;


public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Chat()).commit();
        }

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.chat) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Chat()).commit();
            } else if (item.getItemId() == R.id.map) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Map()).commit();
            } else if (item.getItemId() == R.id.collection) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Collection()).commit();
            }
            return true;
        });
    }
}