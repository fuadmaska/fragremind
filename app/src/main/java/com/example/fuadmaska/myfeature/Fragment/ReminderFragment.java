package com.example.fuadmaska.myfeature.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fuadmaska.myfeature.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReminderFragment extends Fragment {
    Button btnsetnewrmndr;

    public ReminderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reminder, container, false);
        // Inflate the layout for this fragment

        btnsetnewrmndr = view.findViewById(R.id.btnsetnewreminder);
        btnsetnewrmndr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ReminderAddFragment rmaf = new ReminderAddFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container_remin,rmaf);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
//                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.container_remin, rmaf);
//                ft.addToBackStack(null);
//                ft.commit();


            }
        });


        return view;
    }


}
