package com.example.a104;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class indications extends Fragment {

    String title1;
    String title2;
    String title3;
    String ind_data;
    String pro_data;
    TextView textView1;
    AlertDialog.Builder dialogBuilder;
    AlertDialog dialog;
    Button ok;

    public  indications(String string1,String string2 ,String string3,String string4,String string5){
        title1=string1;
        title2=string2;
        title3=string3;
        ind_data=string4;
        pro_data=string5;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_indications, container, false);


        TextView lapel1 = view.findViewById(R.id.indi_case_txt);
        lapel1.setText(title1);
        TextView lapel2 = view.findViewById(R.id.indi_case_txt2);
        lapel2.setText(title2);
        TextView lapel3 = view.findViewById(R.id.indi_case_txt3);
        if(title3.equalsIgnoreCase("")){
            lapel3.setVisibility(View.GONE);
        }else{
            lapel3.setText(title3);
        }

        TextView info = view.findViewById(R.id.info);
        info.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        TextView textView1 = view.findViewById(R.id.textView1);
        textView1.setText(Html.fromHtml(ind_data));
        textView1.setMovementMethod(new ScrollingMovementMethod());

        Button sw_bt = view.findViewById(R.id.switch_bt);
        sw_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new proceduers(title1,title2,title3,pro_data,ind_data));
            }
        });
        Button bt = view.findViewById(R.id.note_bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pop();
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
    public void pop(){
        dialogBuilder = new AlertDialog.Builder(getContext());
        View popup_window = getLayoutInflater().inflate(R.layout.popup,null);
        textView1 =popup_window.findViewById(R.id.textView);
        String tst =getResources().getString(R.string.dialog_test);
        textView1.setText(Html.fromHtml(tst));
        ok= popup_window.findViewById(R.id.button);
        dialogBuilder.setView(popup_window);

        dialog= dialogBuilder.create();

        dialog.show();
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }
}