package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class eng_case extends Fragment {
    String case_name ;
    String [] eng_cases ;
    public eng_case(String string){
        case_name= string;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eng_case, container, false);


        TextView first_title = view.findViewById(R.id.case_txt);
        first_title.setText(case_name);
        first_title.setVisibility(View.VISIBLE);

        eng_cases = getResources().getStringArray(R.array.eng_cases);

        Button n = view.findViewById(R.id.bt1);
        n.setText(eng_cases[0]);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new second_stage_eng("ENG",eng_cases[0]));


            }
        });
        Button n2 = view.findViewById(R.id.bt2);
        n2.setText(eng_cases[1]);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[1],""));


            }
        });
        Button n3 = view.findViewById(R.id.bt3);
        n3.setText(eng_cases[2]);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[2],""));


            }
        });
        Button n4 = view.findViewById(R.id.bt4);
        n4.setText(eng_cases[3]);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[3],""));


            }
        });
        Button n5 = view.findViewById(R.id.bt5);
        n5.setText(eng_cases[4]);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[4],""));


            }
        });
        Button n6 = view.findViewById(R.id.bt6);
        n6.setText(eng_cases[5]);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[5],""));


            }
        });
        Button n7 = view.findViewById(R.id.bt7);
        n7.setText(eng_cases[6]);
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[6],""));


            }
        });
        Button n8 = view.findViewById(R.id.bt8);
        n8.setText(eng_cases[7]);
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[7],""));


            }
        });
        Button n9 = view.findViewById(R.id.bt9);
        n9.setText(eng_cases[8]);
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[8],""));


            }
        });
        Button n10 = view.findViewById(R.id.bt10);
        n10.setText(eng_cases[9]);
        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[9],""));


            }
        });
        Button n11 = view.findViewById(R.id.bt11);
        n11.setText(eng_cases[10]);
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[10],""));


            }
        });
        Button n12 = view.findViewById(R.id.bt12);
        n12.setText(eng_cases[11]);
        n12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new second_stage_eng("ENG",eng_cases[11]));


            }
        });
        Button n13 = view.findViewById(R.id.bt13);
        n13.setText(eng_cases[12]);
        n13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[12],""));


            }
        });
        Button n14 = view.findViewById(R.id.bt14);
        n14.setText(eng_cases[13]);
        n14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[13],""));


            }
        });
        Button n15 = view.findViewById(R.id.bt15);
        n15.setText(eng_cases[14]);
        n15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new second_stage_eng("ENG",eng_cases[14]));


            }
        });
        Button n16 = view.findViewById(R.id.bt16);
        n16.setText(eng_cases[15]);
        n16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new second_stage_eng("ENG",eng_cases[15]));


            }
        });
        Button n17 = view.findViewById(R.id.bt17);
        n17.setText(eng_cases[16]);
        n17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[16],""));


            }
        });
        Button n18 = view.findViewById(R.id.bt18);
        n18.setText(eng_cases[17]);
        n18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",eng_cases[17],""));


            }
        });



        return view ;
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