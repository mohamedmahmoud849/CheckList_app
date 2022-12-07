package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class dc_case extends Fragment {
    String case_name ;
    String [] dc_cases ;
    public dc_case(String string){
        case_name= string;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_dc_case, container, false);
        TextView first_title = view.findViewById(R.id.case_txt);
        first_title.setText(case_name);
        first_title.setVisibility(View.VISIBLE);

        dc_cases = getResources().getStringArray(R.array.dc_cases);
        /* buttons in page */

        Button n = view.findViewById(R.id.bt1);
        n.setText(dc_cases[0]);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("dc",dc_cases[0],""));


            }
        });
        Button n2 = view.findViewById(R.id.bt2);
        n2.setText(dc_cases[1]);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("dc",dc_cases[1],""));


            }
        });
        Button n3 = view.findViewById(R.id.bt3);
        n3.setText(dc_cases[2]);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("dc",dc_cases[2],""));


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