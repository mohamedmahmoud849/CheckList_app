package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class life_support_case extends Fragment {
    String case_name ;
    String [] life_support_cases ;
    public life_support_case(String string){
        case_name= string;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_life_support_case, container, false);

        TextView first_title = view.findViewById(R.id.case_txt);
        first_title.setText(case_name);
        first_title.setVisibility(View.VISIBLE);

        life_support_cases = getResources().getStringArray(R.array.life_support_cases);
        /* buttons in page */

        Button n = view.findViewById(R.id.bt1);
        n.setText(life_support_cases[0]);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("life support",life_support_cases[0],""));


            }
        });
        Button n2 = view.findViewById(R.id.bt2);
        n2.setText(life_support_cases[1]);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("life support",life_support_cases[1],""));


            }
        });
        Button n3 = view.findViewById(R.id.bt3);
        n3.setText(life_support_cases[2]);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("life support",life_support_cases[2],"",getResources().getString(R.string.ls_case3_pro)));


            }
        });
        Button n4 = view.findViewById(R.id.bt4);
        n4.setText(life_support_cases[3]);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("life support",life_support_cases[3],"",getResources().getString(R.string.ls_case4_pro)));


            }
        });
        Button n5 = view.findViewById(R.id.bt5);
        n5.setText(life_support_cases[4]);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new pro2("life support",life_support_cases[4],"",getResources().getString(R.string.ls_case5_pro)));


            }
        });
        Button n6 = view.findViewById(R.id.bt6);
        n6.setText(life_support_cases[5]);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("life support",life_support_cases[5],""));


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