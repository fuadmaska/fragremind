package com.example.fuadmaska.myfeature;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.fuadmaska.myfeature.Fragment.ClaimFragment;
import com.example.fuadmaska.myfeature.Fragment.HomeFragment;
import com.example.fuadmaska.myfeature.Fragment.MessageFragment;
import com.example.fuadmaska.myfeature.Fragment.ProfileFragment;
import com.example.fuadmaska.myfeature.Fragment.ReminderFragment;

public class MainActivity extends AppCompatActivity {
    TabLayout tabbawah;
    ViewPager pageatas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabbawah = findViewById(R.id.Tabbawah);
        pageatas = findViewById(R.id.idtab);
        tabbawah.addTab(tabbawah.newTab().setText("Home").setIcon(R.drawable.ic_home_black_24dp));
        tabbawah.addTab(tabbawah.newTab().setText("Claim").setIcon(R.drawable.ic_library_books_black_24dp));
        tabbawah.addTab(tabbawah.newTab().setText("Reminder").setIcon(R.drawable.ic_notifications_black_24dp));
        tabbawah.addTab(tabbawah.newTab().setText("Message").setIcon(R.drawable.ic_comment_black_24dp));
        tabbawah.addTab(tabbawah.newTab().setText("Profile").setIcon(R.drawable.ic_person_black_24dp));
        tabbawah.setSelectedTabIndicatorColor(Color.parseColor("#B71C1C"));
        tabbawah.setTabTextColors(Color.parseColor("#757575"), Color.parseColor("#B71C1C"));


        tabbawah.setTabGravity(TabLayout.GRAVITY_FILL);
        tabbawah.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabbawah.setTabGravity(TabLayout.MODE_FIXED);




        Custom adapter = new Custom(getSupportFragmentManager());
        pageatas.setAdapter(adapter);
        pageatas.setOffscreenPageLimit(adapter.getCount());

        pageatas.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabbawah));

        tabbawah.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pageatas.setCurrentItem(tab.getPosition());

                tab.getIcon().setColorFilter(getResources().getColor(R.color.crimson), PorterDuff.Mode.SRC_IN);


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                tab.getIcon().setColorFilter(getResources().getColor(R.color.abuabu), PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    private class Custom extends FragmentStatePagerAdapter {

        public Custom(FragmentManager tabcount) {
            super(tabcount);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new HomeFragment();
            } else if (position == 1) {
                return new ClaimFragment();
            } else if (position == 2) {
                return new ReminderFragment();
            } else if (position == 3) {
                return new MessageFragment();
            } else {
                return new ProfileFragment();
            }

        }

        @Override
        public int getCount() {
            return 5;
        }


    }


}
