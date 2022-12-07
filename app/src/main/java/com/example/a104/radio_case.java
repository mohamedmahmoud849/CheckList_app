package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class radio_case extends Fragment {

    String case_name ;
    String [] radio_cases ;
    public radio_case(String string){
        case_name= string;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_radio_case, container, false);

        TextView first_title = view.findViewById(R.id.case_txt);
        first_title.setText(case_name);
        first_title.setVisibility(View.VISIBLE);

        radio_cases = getResources().getStringArray(R.array.radio_cases);


        Button n = view.findViewById(R.id.bt1);
        n.setText(radio_cases[0]);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[0],""));


            }
        });
        Button n2 = view.findViewById(R.id.bt2);
        n2.setText(radio_cases[1]);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[1],""));


            }
        });
        Button n3 = view.findViewById(R.id.bt3);
        n3.setText(radio_cases[2]);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[2],""));


            }
        });
        Button n4 = view.findViewById(R.id.bt4);
        n4.setText(radio_cases[3]);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[3],""));


            }
        });
        Button n5 = view.findViewById(R.id.bt5);
        n5.setText(radio_cases[4]);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[4],""));


            }
        });
        Button n6 = view.findViewById(R.id.bt6);
        n6.setText(radio_cases[5]);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[5],""));


            }
        });
        Button n7 = view.findViewById(R.id.bt7);
        n7.setText(radio_cases[6]);
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[6],""));


            }
        });
        Button n8 = view.findViewById(R.id.bt8);
        n8.setText(radio_cases[7]);
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[7],""));


            }
        });
        Button n9 = view.findViewById(R.id.bt9);
        n9.setText(radio_cases[8]);
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[8],""));


            }
        });
        Button n10 = view.findViewById(R.id.bt10);
        n10.setText(radio_cases[9]);
        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[9],""));


            }
        });
        Button n11 = view.findViewById(R.id.bt11);
        n11.setText(radio_cases[10]);
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("RADIO",radio_cases[10],""));


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