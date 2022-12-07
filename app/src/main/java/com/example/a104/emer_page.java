package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class emer_page extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_emer_page, container, false);
        View view1 = getActivity().findViewById(R.id.toolbar);
        View view2 = getActivity().findViewById(R.id.coordinator_layout);
        View view3 = inflater.inflate(R.layout.fragment_emer_cases, container, false);


        Button ll = view2.findViewById(R.id.emer_button);
        ll.setVisibility(View.INVISIBLE);






        /* handling emergencies buttons  */

        Button em_bt1 = view.findViewById(R.id.em_bt1);
        em_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new emer_cases((String) em_bt1.getText()));





            }
        });
        Button em_bt2 = view.findViewById(R.id.em_bt2);
        em_bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new eng_case((String) em_bt2.getText()));





            }
        });
        Button em_bt3 = view.findViewById(R.id.em_bt3);
        em_bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new rp_case((String) em_bt3.getText()));





            }
        });
        Button em_bt4 = view.findViewById(R.id.em_bt4);
        em_bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new fbw_case((String) em_bt4.getText()));





            }
        });
        Button em_bt5 = view.findViewById(R.id.em_bt5);
        em_bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new lg_case((String) em_bt5.getText()));





            }
        });

        Button em_bt6 = view.findViewById(R.id.em_bt6);
        em_bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new dc_case((String) em_bt6.getText()));





            }
        });
        Button em_bt7 = view.findViewById(R.id.em_bt7);
        em_bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new ac_case((String) em_bt7.getText()));





            }
        });
        Button em_bt8 = view.findViewById(R.id.em_bt8);
        em_bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new life_support_case((String) em_bt8.getText()));





            }
        });
        Button em_bt9 = view.findViewById(R.id.em_bt9);
        em_bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new nav_case((String) em_bt9.getText()));





            }
        });
        Button em_bt10 = view.findViewById(R.id.em_bt10);
        em_bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new misc_case((String) em_bt10.getText()));


            }
        });

        Button em_bt11 = view.findViewById(R.id.em_bt11);
        em_bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new radio_case((String) em_bt11.getText()));





            }
        });
        Button em_bt12 = view.findViewById(R.id.em_bt12);
        em_bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new hyd_case((String) em_bt12.getText()));





            }
        });
        Button em_bt13 = view.findViewById(R.id.em_bt13);
        em_bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new pnum_case((String) em_bt13.getText()));





            }
        });
        Button em_bt14 = view.findViewById(R.id.em_bt14);
        em_bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new fuel_case((String) em_bt14.getText()));





            }
        });
        Button em_bt15 = view.findViewById(R.id.em_bt15);
        em_bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new second_stage_eject((String) em_bt15.getText()));


            }
        });
        Button em_bt16 = view.findViewById(R.id.em_bt16);
        em_bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new pro2((String) em_bt16.getText(),"","",getResources().getString(R.string.egress_case_pro)));





            }
        });
        Button em_bt17 = view.findViewById(R.id.em_bt17);
        em_bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new last_page((String) em_bt17.getText(),"",""));





            }
        });
        Button em_bt18 = view.findViewById(R.id.em_bt18);
        em_bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new cj_case((String) em_bt18.getText()));





            }
        });



        return  view;
    }
    public void setFragment(Fragment fragment){

        // bdl ama n3ml kol l stoor d tany mmln n3ml function t3mlo w hta5od parameter l fragment
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.coordinator_layout_emer_page,fragment);
        //back in history of opened fragments
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }


}