package com.example.eazyorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;
import android.view.MenuItem;

import com.example.eazyorder.Fragments.HomeFragment;
import com.example.eazyorder.Methods.NavigationUtils;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {
public BottomNavigationView bottomNavigationView;
NavigationUtils navigationUtils;
FragmentManager fragmentManager;
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = getSupportActionBar();
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.navigation);
        NavigationUtils.showHomeFragment(getFragmentManager());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                switch (menuItem.getItemId()){
                    case R.id.navigation_home:
                        NavigationUtils.showHomeFragment(getFragmentManager());
                        return true;
                    case R.id.navigation_order:
                        NavigationUtils.showOrderFragment(getFragmentManager());
                        return true;
                    case R.id.navigation_cart:
                        NavigationUtils.showCartFragment(getFragmentManager());
                        return true;
                    case R.id.navigation_profile:
                        NavigationUtils.showProfileFragment(getFragmentManager());
                        return true;


                }
                return false;
            }
        });


    }

}
