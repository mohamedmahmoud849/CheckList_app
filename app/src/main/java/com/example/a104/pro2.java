package com.example.a104;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class pro2 extends Fragment {

    String title1;
    String title2;
    String title3;
    String pro_data;

    public  pro2(String string1,String string2 ,String string3,String string4){
        title1=string1;
        title2=string2;
        title3=string3;
        pro_data=string4;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_pro2, container, false);
        TextView lapel1 = view.findViewById(R.id.pro_case_txt);
        lapel1.setText(title1);
        TextView lapel2 = view.findViewById(R.id.pro_case_txt2);
        if(title2.equalsIgnoreCase("")){
            lapel2.setVisibility(View.GONE);
        }else{
            lapel2.setText(title2);
        }

        TextView lapel3 = view.findViewById(R.id.pro_case_txt3);
        if(title3.equalsIgnoreCase("")){
            lapel3.setVisibility(View.GONE);
        }else{
            lapel3.setText(title3);
        }
        TextView info = view.findViewById(R.id.info);
        info.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        TextView textView1 = view.findViewById(R.id.textView1);
        textView1.setText(Html.fromHtml(pro_data));

        textView1.setMovementMethod(new ScrollingMovementMethod());


       return view;
    }
}