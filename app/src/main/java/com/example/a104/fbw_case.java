package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class fbw_case extends Fragment {
    String case_name ;
    String [] fbw_cases ;
    public fbw_case(String string){
        case_name= string;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_fbw_case, container, false);
        TextView first_title = view.findViewById(R.id.case_txt);
        first_title.setText(case_name);
        first_title.setVisibility(View.VISIBLE);

        fbw_cases = getResources().getStringArray(R.array.fbw_cases);

        Button n = view.findViewById(R.id.bt1);
        n.setText(fbw_cases[0]);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[0],""));


            }
        });
        Button n2 = view.findViewById(R.id.bt2);
        n2.setText(fbw_cases[1]);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[1],""));


            }
        });
        Button n3 = view.findViewById(R.id.bt3);
        n3.setText(fbw_cases[2]);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[2],""));


            }
        });
        Button n4 = view.findViewById(R.id.bt4);
        n4.setText(fbw_cases[3]);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[3],""));


            }
        });
        Button n5 = view.findViewById(R.id.bt5);
        n5.setText(fbw_cases[4]);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[4],""));


            }
        });
        Button n6 = view.findViewById(R.id.bt6);
        n6.setText(fbw_cases[5]);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[5],""));


            }
        });
        Button n7 = view.findViewById(R.id.bt7);
        n7.setText(fbw_cases[6]);
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[6],""));


            }
        });
        Button n8 = view.findViewById(R.id.bt8);
        n8.setText(fbw_cases[7]);
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[7],""));


            }
        });
        Button n9 = view.findViewById(R.id.bt9);
        n9.setText(fbw_cases[8]);
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[8],""));


            }
        });
        Button n10 = view.findViewById(R.id.bt10);
        n10.setText(fbw_cases[9]);
        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[9],""));


            }
        });
        Button n11 = view.findViewById(R.id.bt11);
        n11.setText(fbw_cases[10]);
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[10],""));


            }
        });
        Button n12 = view.findViewById(R.id.bt12);
        n12.setText(fbw_cases[11]);
        n12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[11],""));


            }
        });
        Button n13 = view.findViewById(R.id.bt13);
        n13.setText(fbw_cases[12]);
        n13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[12],""));


            }
        });
        Button n14 = view.findViewById(R.id.bt14);
        n14.setText(fbw_cases[13]);
        n14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[13],""));


            }
        });
        Button n15 = view.findViewById(R.id.bt15);
        n15.setText(fbw_cases[14]);
        n15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[14],""));


            }
        });
        Button n16 = view.findViewById(R.id.bt16);
        n16.setText(fbw_cases[15]);
        n16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[15],""));


            }
        });
        Button n17 = view.findViewById(R.id.bt17);
        n17.setText(fbw_cases[16]);
        n17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[16],""));


            }
        });
        Button n18 = view.findViewById(R.id.bt18);
        n18.setText(fbw_cases[17]);
        n18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[17],""));


            }
        });
        Button n19 = view.findViewById(R.id.bt19);
        n19.setText(fbw_cases[18]);
        n19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[18],""));


            }
        });
        Button n20 = view.findViewById(R.id.bt20);
        n20.setText(fbw_cases[19]);
        n20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[19],""));


            }
        });
        Button n21 = view.findViewById(R.id.bt21);
        n21.setText(fbw_cases[20]);
        n21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[20],""));


            }
        });
        Button n22 = view.findViewById(R.id.bt22);
        n22.setText(fbw_cases[21]);
        n22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[21],""));


            }
        });
        Button n23 = view.findViewById(R.id.bt23);
        n23.setText(fbw_cases[22]);
        n23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[22],""));


            }
        });
        Button n24 = view.findViewById(R.id.bt24);
        n24.setText(fbw_cases[23]);
        n24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[23],""));


            }
        });
        Button n25 = view.findViewById(R.id.bt25);
        n25.setText(fbw_cases[24]);
        n25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[24],""));


            }
        });
        Button n26 = view.findViewById(R.id.bt26);
        n26.setText(fbw_cases[25]);
        n26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[25],""));


            }
        });
        Button n27 = view.findViewById(R.id.bt27);
        n27.setText(fbw_cases[26]);
        n27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[26],""));


            }
        });
        Button n28 = view.findViewById(R.id.bt28);
        n28.setText(fbw_cases[27]);
        n28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[27],""));


            }
        });
        Button n29 = view.findViewById(R.id.bt29);
        n29.setText(fbw_cases[28]);
        n29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[28],""));


            }
        });
        Button n30 = view.findViewById(R.id.bt30);
        n30.setText(fbw_cases[29]);
        n30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[29],""));


            }
        });
        Button n31 = view.findViewById(R.id.bt31);
        n31.setText(fbw_cases[30]);
        n31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[30],""));


            }
        });
        Button n32 = view.findViewById(R.id.bt32);
        n32.setText(fbw_cases[31]);
        n32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[31],""));


            }
        });
        Button n33 = view.findViewById(R.id.bt33);
        n33.setText(fbw_cases[32]);
        n33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[32],""));


            }
        });
        Button n34 = view.findViewById(R.id.bt34);
        n34.setText(fbw_cases[33]);
        n34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new last_page("FBW",fbw_cases[33],""));


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