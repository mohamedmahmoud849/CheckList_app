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


public class second_stage_page extends Fragment {


    String title1;
    String title2;
    String [] fire_taxing_cases;
    public second_stage_page(String string1, String string2){
        title1 = string1;
        title2 = string2;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_stage_page, container, false);
        TextView first_title = view.findViewById(R.id.sec_case_txt);
        first_title.setText(title1);
        TextView sec_title = view.findViewById(R.id.sec_case_txt2);
        sec_title.setText(title2);




        if(title1.equalsIgnoreCase("fire") && title2.equalsIgnoreCase("taxing")){
            fire_taxing_cases = getResources().getStringArray(R.array.fire_taxing);
            int l = R.id.sec_bt1 ;
            for(int i = 0 ; i< fire_taxing_cases.length;i++){

                Button b = view.findViewById(l);
                b.setText(fire_taxing_cases[i]);
                b.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(b.getText().toString().equalsIgnoreCase("eng & aagb")){
                            setFragment(new last_page("Fire","Taxing","eng & aagb"));

                        }
                    }
                });
                l++;}
            }else if(title1.equalsIgnoreCase("fire") && title2.equalsIgnoreCase("take-off run")){
                fire_taxing_cases = getResources().getStringArray(R.array.fire_taxing);
                int l = R.id.sec_bt1 ;
                for(int i = 0 ; i< fire_taxing_cases.length;i++){

                    Button b = view.findViewById(l);
                    b.setText(fire_taxing_cases[i]);
                    b.setVisibility(View.VISIBLE);
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(b.getText().toString().equalsIgnoreCase("eng & aagb")){
                                setFragment(new last_page("Fire","take-off run","eng & aagb"));

                            }
                        }
                    });
                    l++;
                }}else if(title1.equalsIgnoreCase("fire") && title2.equalsIgnoreCase("AFTER LEFT-OFF")){
                    fire_taxing_cases = getResources().getStringArray(R.array.fire);
                    int l = R.id.sec_bt1 ;
                for(int i = 0 ; i< fire_taxing_cases.length;i++){

                    Button b = view.findViewById(l);
                    b.setText(fire_taxing_cases[i]);
                    b.setVisibility(View.VISIBLE);
                    b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(b.getText().toString().equalsIgnoreCase("eng")){
                            setFragment(new last_page("Fire","AFTER LEFT-OFF","eng"));

                        }else if(b.getText().toString().equalsIgnoreCase("aagb")){

                            setFragment(new last_page("Fire","AFTER LEFT-OFF","AAGB"));
                        }
                    }
                });
                l++;
            }}else if(title1.equalsIgnoreCase("fire") && title2.equalsIgnoreCase("IN FLIGHT")){
            fire_taxing_cases = getResources().getStringArray(R.array.fire);
            int l = R.id.sec_bt1 ;
            for(int i = 0 ; i< fire_taxing_cases.length;i++){

                Button b = view.findViewById(l);
                b.setText(fire_taxing_cases[i]);
                b.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(b.getText().toString().equalsIgnoreCase("eng")){
                            setFragment(new last_page("Fire","IN FLIGHT","eng"));

                        }else if(b.getText().toString().equalsIgnoreCase("aagb")){

                            setFragment(new last_page("Fire","IN FLIGHT","AAGB"));
                        }
                    }
                });
                l++;
            }}


        /*else if(title1.equalsIgnoreCase("fire") && title2.equalsIgnoreCase("take-off run")){
            fire_taxing_cases = getResources().getStringArray(R.array.fire_taxing);
            int l = R.id.sec_bt1 ;
            for(int i = 0 ; i< fire_taxing_cases.length;i++){

                Button b = view.findViewById(l);
                b.setText(fire_taxing_cases[i]);
                b.setVisibility(View.VISIBLE);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(b.getText().toString().equalsIgnoreCase("eng")){
                            setFragment(new last_page("Fire","Taxing","eng"));

                        }else if(b.getText().toString().equalsIgnoreCase("aagb")){

                            setFragment(new last_page("Fire","Taxing","aagb"));
                        }
                    }
                });
                l++;
            }


        }*/



        /* buttons in page */
        /*Button n = view.findViewById(R.id.sec_bt1);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n.getText().toString().equalsIgnoreCase("eng")){
                    setFragment(new last_page("Fire","Taxing","eng"));

                }else if(n.getText().toString().equalsIgnoreCase("aagb")){

                    setFragment(new last_page("Fire","Taxing","aagb"));
                }
            }
        });
        Button n2 = view.findViewById(R.id.sec_bt2);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n2.getText().toString().equalsIgnoreCase("eng")){
                    setFragment(new last_page("Fire","Taxing","eng"));

                }else if(n2.getText().toString().equalsIgnoreCase("aagb")){

                    setFragment(new last_page("Fire","Taxing","aagb"));
                }
            }
        });
        Button n3 = view.findViewById(R.id.sec_bt3);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n3.getText().toString().equalsIgnoreCase("eng")){
                    setFragment(new last_page("Fire","Taxing","eng"));

                }else if(n3.getText().toString().equalsIgnoreCase("aagb")){

                    setFragment(new last_page("Fire","Taxing","aagb"));
                }
            }
        });
        Button n4 = view.findViewById(R.id.sec_bt4);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n4.getText().toString().equalsIgnoreCase("eng")){
                    setFragment(new last_page("Fire","Taxing","eng"));

                }else if(n4.getText().toString().equalsIgnoreCase("aagb")){

                    setFragment(new last_page("Fire","Taxing","aagb"));
                }
            }
        });
        Button n5 = view.findViewById(R.id.sec_bt5);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n5.getText().toString().equalsIgnoreCase("eng")){
                    setFragment(new last_page("Fire","Taxing","eng"));

                }else if(n5.getText().toString().equalsIgnoreCase("aagb")){

                    setFragment(new last_page("Fire","Taxing","aagb"));
                }
            }
        });
        Button n6 = view.findViewById(R.id.sec_bt6);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n6.getText().toString().equalsIgnoreCase("eng")){
                    setFragment(new last_page("Fire","Taxing","eng"));

                }else if(n6.getText().toString().equalsIgnoreCase("aagb")){

                    setFragment(new last_page("Fire","Taxing","aagb"));
                }
            }
        });
        Button n7 = view.findViewById(R.id.sec_bt7);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n7.getText().toString().equalsIgnoreCase("eng")){
                    setFragment(new last_page("Fire","Taxing","eng"));

                }else if(n7.getText().toString().equalsIgnoreCase("aagb")){

                    setFragment(new last_page("Fire","Taxing","aagb"));
                }
            }
        });*/



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