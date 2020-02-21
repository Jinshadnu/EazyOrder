package com.example.eazyorder.Methods;



import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;


import com.example.eazyorder.Fragments.CartFragment;
import com.example.eazyorder.Fragments.HomeFragment;
import com.example.eazyorder.Fragments.OrderFragment;
import com.example.eazyorder.Fragments.ProfileFragment;
import com.example.eazyorder.R;

public class NavigationUtils {
    Context context;

public static void loadFragment(Fragment fragment, FragmentManager fragmentManager, Boolean addToBackStack){
    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.frame_container,fragment);

    if (addToBackStack){
     fragmentTransaction.addToBackStack("");
    }

    fragmentTransaction.commitAllowingStateLoss();
}

  public static void showHomeFragment(FragmentManager fragmentManager){
    HomeFragment homeFragment=new HomeFragment();
    loadFragment(homeFragment,fragmentManager,true);
   }
    public static void showOrderFragment(FragmentManager fragmentManager){
        OrderFragment orderFragment=new OrderFragment();
        loadFragment(orderFragment,fragmentManager,true);
    }
    public static void showCartFragment(FragmentManager fragmentManager){
        CartFragment cartFragment=new CartFragment();
        loadFragment(cartFragment,fragmentManager,true);
    }
    public static void showProfileFragment(FragmentManager fragmentManager){
        ProfileFragment profileFragment=new ProfileFragment();
        loadFragment(profileFragment,fragmentManager,true);
    }



}
