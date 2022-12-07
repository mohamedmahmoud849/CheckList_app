package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class second_stage_eject extends Fragment {

    String title1;

    String [] eject_cases ;

    public second_stage_eject(String string1){
        title1 = string1;


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second_stage_eject, container, false);
        TextView first_title = view.findViewById(R.id.case_txt);
        first_title.setText(title1);
        first_title.setVisibility(View.VISIBLE);

        eject_cases = getResources().getStringArray(R.array.eject_cases);



        Button n = view.findViewById(R.id.bt1);
        n.setText(eject_cases[0]);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("EJECT",eject_cases[0],"",getResources().getString(R.string.eject_case1_pro)));


            }
        });
        Button n1 = view.findViewById(R.id.bt2);
        n1.setText(eject_cases[1]);
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("EJECT",eject_cases[1],"",getResources().getString(R.string.eject_case2_pro)));


            }
        });
        Button n2 = view.findViewById(R.id.bt3);
        n2.setText(eject_cases[2]);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("EJECT",eject_cases[2],"",getResources().getString(R.string.eject_case3_pro)));


            }
        });
        Button n3 = view.findViewById(R.id.bt4);
        n3.setText(eject_cases[3]);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("EJECT",eject_cases[3],"",getResources().getString(R.string.eject_case4_pro)));


            }
        });
        Button n4 = view.findViewById(R.id.bt5);
        n4.setText(eject_cases[4]);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("EJECT",eject_cases[4],"",getResources().getString(R.string.eject_case5_pro)));


            }
        });
        Button n5 = view.findViewById(R.id.bt6);
        n5.setText(eject_cases[5]);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("EJECT",eject_cases[5],"",getResources().getString(R.string.eject_case6_pro)));


            }
        });




        return view;
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