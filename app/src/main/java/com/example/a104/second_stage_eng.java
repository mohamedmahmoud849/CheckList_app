package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class second_stage_eng extends Fragment {
    String title1;
    String title2;
    String [] eng_cases ;

   public  second_stage_eng(String string1, String string2){
       title1 = string1;
       title2 = string2;

   }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_stage_eng, container, false);
        TextView first_title = view.findViewById(R.id.case_txt);
        first_title.setText(title1);
        first_title.setVisibility(View.VISIBLE);
        TextView sec_title = view.findViewById(R.id.case_txt2);
        sec_title.setText(title2);
        eng_cases = getResources().getStringArray(R.array.eng_case1_cases);
        Button n = view.findViewById(R.id.bt1);
        n.setText(eng_cases[0]);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",title2,eng_cases[0]));


            }
        });
        if(title2.equalsIgnoreCase("INCREASE OF DIFFERENTIAL PRESSURE AT ENGINE FUEL FILTER")){
            Button n2 = view.findViewById(R.id.bt2);
            n2.setVisibility(View.GONE);



        }else{
            Button n2 = view.findViewById(R.id.bt2);
            n2.setText(eng_cases[1]);
            n2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    setFragment(new last_page("ENG",title2,eng_cases[1]));


                }
            });


        }

        Button n3 = view.findViewById(R.id.bt3);
        n3.setText(eng_cases[2]);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("ENG",title2,eng_cases[2]));


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