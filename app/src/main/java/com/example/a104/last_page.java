package com.example.a104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class last_page extends Fragment {
    String title1;
    String title2;
    String title3;
    String ind_data;
    String pro_data;
    public  last_page(String string1,String string2 ,String string3){
        title1=string1;
        title2=string2;
        title3=string3;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_last_page, container, false);

        TextView lapel1 = view.findViewById(R.id.last_case_txt);
        lapel1.setText(title1);
        TextView lapel2 = view.findViewById(R.id.last_case_txt2);
        if(title2.equalsIgnoreCase("")){
            lapel2.setVisibility(View.GONE);
        }else{
            lapel2.setText(title2);
        }
        TextView lapel3 = view.findViewById(R.id.last_case_txt3);
        if(title3.equalsIgnoreCase("")){
            lapel3.setVisibility(View.GONE);
        }else{
            lapel3.setText(title3);
        }


        if(title1.equalsIgnoreCase("fire")&&title2.equalsIgnoreCase("taxing")&&title3.equalsIgnoreCase("eng & aagb") ){
            ind_data =  getResources().getString(R.string.fire_taxing_eng_ind);
            pro_data =  getResources().getString(R.string.fire_taxing_eng_pro);
        }else if(title1.equalsIgnoreCase("fire")&&title2.equalsIgnoreCase("take-off run")&&title3.equalsIgnoreCase("eng & aagb")){
            ind_data =  getResources().getString(R.string.fire_taxing_eng_ind);
            pro_data =  getResources().getString(R.string.fire_takeoff_eng_pro);}
        else if(title1.equalsIgnoreCase("fire")&&title2.equalsIgnoreCase("AFTER LEFT-OFF")&&title3.equalsIgnoreCase("eng")){
            ind_data =  getResources().getString(R.string.fire_taxing_eng_ind);
            pro_data =  getResources().getString(R.string.fire_leftoff_eng_pro);}
        else if(title1.equalsIgnoreCase("fire")&&title2.equalsIgnoreCase("AFTER LEFT-OFF")&&title3.equalsIgnoreCase("aagb")){
            ind_data =  getResources().getString(R.string.fire_taxing_eng_ind);
            pro_data =  getResources().getString(R.string.fire_leftoff_aagb_pro);}
        else if(title1.equalsIgnoreCase("fire")&&title2.equalsIgnoreCase("IN FLIGHT")&&title3.equalsIgnoreCase("eng")){
            ind_data =  getResources().getString(R.string.fire_taxing_eng_ind);
            pro_data =  getResources().getString(R.string.fire_inflight_eng_pro);}
        else if(title1.equalsIgnoreCase("fire")&&title2.equalsIgnoreCase("IN FLIGHT")&&title3.equalsIgnoreCase("aagb")){
            ind_data =  getResources().getString(R.string.fire_taxing_eng_ind);
            pro_data =  getResources().getString(R.string.fire_inflight_aagb_pro);}
        else if(title1.equalsIgnoreCase("rp")&&title2.equalsIgnoreCase("REFUELING POD FIRE")){
            ind_data =  getResources().getString(R.string.rp_case1_ind);
            pro_data =  getResources().getString(R.string.rp_case1_pro);}
        else if(title1.equalsIgnoreCase("rp")&&title2.equalsIgnoreCase("REFUELING POD FAILURE")){
            ind_data =  getResources().getString(R.string.rp_case2_ind);
            pro_data =  getResources().getString(R.string.rp_case2_pro);}
        else if(title1.equalsIgnoreCase("rp")&&title2.equalsIgnoreCase("EMERGENCY SITUATION AT FUEL TRANSFER TO ANOTHER AIRCRAFT")){
            ind_data =  getResources().getString(R.string.rp_case3_ind);
            pro_data =  getResources().getString(R.string.rp_case3_pro);}
        else if(title1.equalsIgnoreCase("rp")&&title2.equalsIgnoreCase("ABNORMAL IN-FLIGHT REFUELING MODE")){
            ind_data =  getResources().getString(R.string.rp_case4_ind);
            pro_data =  getResources().getString(R.string.rp_case4_pro);}
        else if(title1.equalsIgnoreCase("lg")&&title2.equalsIgnoreCase("BLOWN MLG TIRE")&&title3.equalsIgnoreCase("AT TAKE-OFF BEFORE NLG WHEELS LIFTING")){
            ind_data = getResources().getString(R.string.lg_case1_ind);
            pro_data =  getResources().getString(R.string.lg_case1_1_pro);}
        else if(title1.equalsIgnoreCase("lg")&&title2.equalsIgnoreCase("BLOWN MLG TIRE")&&title3.equalsIgnoreCase("AFTER NLG WHEELS LIFTING")){
            ind_data =  getResources().getString(R.string.lg_case1_ind);
            pro_data =  getResources().getString(R.string.lg_case1_2_pro);}
        else if(title1.equalsIgnoreCase("lg")&&title2.equalsIgnoreCase("BLOWN MLG TIRE")&&title3.equalsIgnoreCase("DURING LANDING RUN")){
            ind_data =  getResources().getString(R.string.lg_case1_ind);
            pro_data =  getResources().getString(R.string.lg_case1_3_pro);}

        else if(title1.equalsIgnoreCase("lg")&&title2.equalsIgnoreCase("FAILURE OF ONE MLG TO EXTEND")){
            ind_data =  getResources().getString(R.string.lg_case2_ind);
            pro_data =  getResources().getString(R.string.lg_case2_pro);}
        else if(title1.equalsIgnoreCase("lg")&&title2.equalsIgnoreCase("FAILURE OF NLG TO EXTEND")){
            ind_data =  getResources().getString(R.string.lg_case3_ind);
            pro_data =  getResources().getString(R.string.lg_case3_pro);}

        else if(title1.equalsIgnoreCase("dc")&&title2.equalsIgnoreCase("DC GENERATOR FAILURE")){
            ind_data =  getResources().getString(R.string.dc_case1_ind);
            pro_data =  getResources().getString(R.string.dc_case1_pro);}
        else if(title1.equalsIgnoreCase("dc")&&title2.equalsIgnoreCase("BOTH DC GENERATORS FAILURE")){
            ind_data =  getResources().getString(R.string.dc_case2_ind);
            pro_data =  getResources().getString(R.string.dc_case2_pro);}
        else if(title1.equalsIgnoreCase("dc")&&title2.equalsIgnoreCase("FAILURE OF TWO DC GENERATORS AND RECTIFIER")){
            ind_data = getResources().getString(R.string.dc_case3_ind);
            pro_data =  getResources().getString(R.string.dc_case3_pro);}
        else if(title1.equalsIgnoreCase("ac")&&title2.equalsIgnoreCase("AC INTEGRATED GENERATOR FAILURE")){
            ind_data =  getResources().getString(R.string.ac_case1_ind);
            pro_data =  getResources().getString(R.string.ac_case1_pro);}
        else if(title1.equalsIgnoreCase("ac")&&title2.equalsIgnoreCase("BOTH AC INTEGRATED GENERATORS FAILURE")){
            ind_data =  getResources().getString(R.string.ac_case2_ind);
            pro_data =  getResources().getString(R.string.ac_case2_pro);}
        else if(title1.equalsIgnoreCase("life support")&&title2.equalsIgnoreCase("COCKPIT DEPRESSURIZATION AT ALTITUDES ABOVE 39350 FT")){
            ind_data =  getResources().getString(R.string.ls_case1_ind);
            pro_data =  getResources().getString(R.string.ls_case1_pro);}
        else if(title1.equalsIgnoreCase("life support")&&title2.equalsIgnoreCase("FAILURE OF AUTOMATIC CONTROL SYSTEM OF COCKPIT TEMPERATURE")){
            ind_data =  getResources().getString(R.string.ls_case2_ind);
            pro_data =  getResources().getString(R.string.ls_case2_pro);}

        else if(title1.equalsIgnoreCase("life support")&&title2.equalsIgnoreCase("FAILURE OF OXYGEN EQUIPMENT")){
            ind_data =  getResources().getString(R.string.ls_case6_ind);
            pro_data =  getResources().getString(R.string.ls_case6_pro);}

        else if(title1.equalsIgnoreCase("hyd")&&title2.equalsIgnoreCase("BOOSTER HYDRAULIC SYSTEM FAILURE")){
            ind_data =  getResources().getString(R.string.hyd_case1_ind);
            pro_data =   getResources().getString(R.string.hyd_case1_pro);}
        else if(title1.equalsIgnoreCase("hyd")&&title2.equalsIgnoreCase("MAIN HYDRAULIC SYSTEM FAILURE")){
            ind_data =  getResources().getString(R.string.hyd_case2_ind);
            pro_data =   getResources().getString(R.string.hyd_case2_pro);}
        else if(title1.equalsIgnoreCase("hyd")&&title2.equalsIgnoreCase("BOTH HYDRAULIC SYSTEMS FAILURE")){
            ind_data =  getResources().getString(R.string.hyd_case3_ind);
            pro_data =   getResources().getString(R.string.hyd_case3_pro);}
        else if(title1.equalsIgnoreCase("pnum")&&title2.equalsIgnoreCase("MAIN PNEUMATIC SYSTEM FAILURE")){
            ind_data =   getResources().getString(R.string.pnum_case1_ind);
            pro_data =  getResources().getString(R.string.pnum_case1_pro);}
        else if(title1.equalsIgnoreCase("pnum")&&title2.equalsIgnoreCase("EMERGENCY PNEUMATIC SYSTEM FAILURE")){
            ind_data =   getResources().getString(R.string.pnum_case2_ind);
            pro_data =  getResources().getString(R.string.pnum_case2_pro);}
        else if(title1.equalsIgnoreCase("pnum")&&title2.equalsIgnoreCase("BOTH PNEUMATIC SYSTEMS FAILURE")){
            ind_data =   getResources().getString(R.string.pnum_case3_ind);
            pro_data =  getResources().getString(R.string.pnum_case3_pro);}
        else if(title1.equalsIgnoreCase("FUEL")&&title2.equalsIgnoreCase("FAILURE OF FUEL USE SEQUENCE IN FLIGHT")){
            ind_data =   getResources().getString(R.string.fuel_case1_ind);
            pro_data =  getResources().getString(R.string.fuel_case1_pro);}
        else if(title1.equalsIgnoreCase("FUEL")&&title2.equalsIgnoreCase("NO VENTRAL TANK CONSUMPTION")){
            ind_data =   getResources().getString(R.string.fuel_case2_ind);
            pro_data =  getResources().getString(R.string.fuel_case2_pro);}
        else if(title1.equalsIgnoreCase("FUEL")&&title2.equalsIgnoreCase("NO WDT CONSUMPTION")){
            ind_data =   getResources().getString(R.string.fuel_case3_ind);
            pro_data =  getResources().getString(R.string.fuel_case3_pro);}
        else if(title1.equalsIgnoreCase("FUEL")&&title2.equalsIgnoreCase("FAILURE OF EMG JETT TERMINATION OF ONE ENGINE")){
            ind_data =   getResources().getString(R.string.fuel_case4_ind);
            pro_data =  getResources().getString(R.string.fuel_case4_pro);}
        else if(title1.equalsIgnoreCase("FUEL")&&title2.equalsIgnoreCase("FAILURE OF EMG JETT TERMINATION OF BOTH ENGINES")){
            ind_data =   getResources().getString(R.string.fuel_case5_ind);
            pro_data =  getResources().getString(R.string.fuel_case5_pro);}
        else if(title1.equalsIgnoreCase("EMG LANDING")){
            ind_data =   getResources().getString(R.string.EmergLanding_case_ind);
            pro_data =  getResources().getString(R.string.EmergLanding_case_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("SINGLE ENGINE FAILURE")&&title3.equalsIgnoreCase("DURING TAKE-OFF RUN")){
            ind_data =   getResources().getString(R.string.eng_case1_ind);
            pro_data =  getResources().getString(R.string.eng_case1_1_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("SINGLE ENGINE FAILURE")&&title3.equalsIgnoreCase("AFTER LIFT-OFF")){
            ind_data =   getResources().getString(R.string.eng_case1_ind);
            pro_data =  getResources().getString(R.string.eng_case1_2_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("SINGLE ENGINE FAILURE")&&title3.equalsIgnoreCase("IN FLIGHT")){
            ind_data =   getResources().getString(R.string.eng_case1_ind);
            pro_data =  getResources().getString(R.string.eng_case1_3_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("POWER PLANT SURGE")){
            ind_data =   getResources().getString(R.string.eng_case2_ind);
            pro_data =  getResources().getString(R.string.eng_case2_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FAILURE OF BARK-42 ANTI-SURGE PROTECTION CHANNEL")){
            ind_data =   getResources().getString(R.string.eng_case3_ind);
            pro_data =  getResources().getString(R.string.eng_case3_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("SUDDEN FLAMEOUT OF BOTH ENGINES IN FLIGHT")){
            ind_data =   getResources().getString(R.string.eng_case4_ind);
            pro_data =  getResources().getString(R.string.eng_case4_pro);}
        /*else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("ENGINES AIR START")){
            ind_data =   getResources().getString(R.string.eng_case5_ind);
            pro_data =  getResources().getString(R.string.eng_case5_pro);}*/
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FAILURE OF ENGINE OIL SYSTEM")){
            ind_data =   getResources().getString(R.string.eng_case6_ind);
            pro_data =  getResources().getString(R.string.eng_case6_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FAILURE OF ELECTRONICS OF ENGINE AUTOMATIC CONTROL SYSTEM")){
            ind_data =   getResources().getString(R.string.eng_case7_ind);
            pro_data =  getResources().getString(R.string.eng_case7_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FAILURE OF BARK-42 LIMITATION AND ADJUSTMENT PROGRAMS.FUEL FLOW, NOZZLE THROAT AREA")){
            ind_data =   getResources().getString(R.string.eng_case8_ind);
            pro_data =  getResources().getString(R.string.eng_case8_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("AFTERBURNING FAILURE")){
            ind_data =   getResources().getString(R.string.eng_case9_ind);
            pro_data =  getResources().getString(R.string.eng_case9_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FUEL BOOST PUMP FAILURE")){
            ind_data =   getResources().getString(R.string.eng_case10_ind);
            pro_data =  getResources().getString(R.string.eng_case10_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("INCREASE OF ENGINE RPM, FUEL PRESSURE")){
            ind_data =   getResources().getString(R.string.eng_case11_ind);
            pro_data =  getResources().getString(R.string.eng_case11_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("INCREASE OF DIFFERENTIAL PRESSURE AT ENGINE FUEL FILTER")&&title3.equalsIgnoreCase("DURING TAKE-OFF RUN")){
            ind_data =   getResources().getString(R.string.eng_case12_ind);
            pro_data =  getResources().getString(R.string.eng_case12_1_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("INCREASE OF DIFFERENTIAL PRESSURE AT ENGINE FUEL FILTER")&&title3.equalsIgnoreCase("IN FLIGHT")){
            ind_data =   getResources().getString(R.string.eng_case12_ind);
            pro_data =  getResources().getString(R.string.eng_case12_2_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("INCREASE OF ENGINE VIBRATIONS")){
            ind_data =   getResources().getString(R.string.eng_case13_ind);
            pro_data =  getResources().getString(R.string.eng_case13_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("ENGINE OVERHEAT")){
            ind_data =   getResources().getString(R.string.eng_case14_ind);
            pro_data =  getResources().getString(R.string.eng_case14_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("TOTAL FAILURE OF AAGB (BOTH REDUCTION GEARS)")&&title3.equalsIgnoreCase("DURING TAKE-OFF RUN")){
            ind_data =   getResources().getString(R.string.eng_case15_ind);
            pro_data =  getResources().getString(R.string.eng_case15_1_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("TOTAL FAILURE OF AAGB (BOTH REDUCTION GEARS)")&&title3.equalsIgnoreCase("AFTER LIFT-OFF")){
            ind_data =   getResources().getString(R.string.eng_case15_ind);
            pro_data =  getResources().getString(R.string.eng_case15_2_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("TOTAL FAILURE OF AAGB (BOTH REDUCTION GEARS)")&&title3.equalsIgnoreCase("IN FLIGHT")){
            ind_data =   getResources().getString(R.string.eng_case15_ind);
            pro_data =  getResources().getString(R.string.eng_case15_3_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FAILURE OF ONE AAGB REDUCTION GEAR")&&title3.equalsIgnoreCase("DURING TAKE-OFF RUN")){
            ind_data =   getResources().getString(R.string.eng_case16_ind);
            pro_data =  getResources().getString(R.string.eng_case16_1_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FAILURE OF ONE AAGB REDUCTION GEAR")&&title3.equalsIgnoreCase("AFTER LIFT-OFF")){
            ind_data =   getResources().getString(R.string.eng_case16_ind);
            pro_data =  getResources().getString(R.string.eng_case16_2_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FAILURE OF ONE AAGB REDUCTION GEAR")&&title3.equalsIgnoreCase("IN FLIGHT")){
            ind_data =   getResources().getString(R.string.eng_case16_ind);
            pro_data =  getResources().getString(R.string.eng_case16_3_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("FAILURE OF AIR INTAKES GOVERNOR")){
            ind_data =   getResources().getString(R.string.eng_case17_ind);
            pro_data =  getResources().getString(R.string.eng_case17_pro);}
        else if(title1.equalsIgnoreCase("ENG")&&title2.equalsIgnoreCase("LH (RH) AIR INTAKE FAILURE")){
            ind_data =   getResources().getString(R.string.eng_case18_ind);
            pro_data =  getResources().getString(R.string.eng_case18_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF ONE SUB-CHANNEL OF FBW")){
            ind_data =   getResources().getString(R.string.fbw_case1_ind);
            pro_data =  getResources().getString(R.string.fbw_case1_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF TWO SUB-CHANNELS OF FBW")){
            ind_data =   getResources().getString(R.string.fbw_case2_ind);
            pro_data =  getResources().getString(R.string.fbw_case2_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("TOTAL FAILURE OF 2 AOA SENSORS")){
            ind_data =   getResources().getString(R.string.fbw_case3_ind);
            pro_data =  getResources().getString(R.string.fbw_case3_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF CONTROL STICK AND (OR) PEDALS MOVEMENT SENSORS")){
            ind_data =   getResources().getString(R.string.fbw_case4_ind);
            pro_data =  getResources().getString(R.string.fbw_case4_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF FBW COMPUTERS")){
            ind_data =   getResources().getString(R.string.fbw_case5_ind);
            pro_data =  getResources().getString(R.string.fbw_case5_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF SERVO DRIVE OF ONE HORIZONTAL STABILIZER")){
            ind_data =   getResources().getString(R.string.fbw_case6_ind);
            pro_data =  getResources().getString(R.string.fbw_case6_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF SERVO DRIVE OF ONE OF THE RUDDERS")){
            ind_data =   getResources().getString(R.string.fbw_case7_ind);
            pro_data =  getResources().getString(R.string.fbw_case7_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF SERVO DRIVE OF ONE AILERON")){
            ind_data =   getResources().getString(R.string.fbw_case8_ind);
            pro_data =  getResources().getString(R.string.fbw_case8_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF MAIN MODE IN ONE OF FBW PRESSURE CONTROL CHANNELS")){
            ind_data =   getResources().getString(R.string.fbw_case9_ind);
            pro_data =  getResources().getString(R.string.fbw_case9_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF FBW PRESSURE SENSORS")){
            ind_data =   getResources().getString(R.string.fbw_case10_ind);
            pro_data =  getResources().getString(R.string.fbw_case10_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF AUTOPILOT")){
            ind_data =   getResources().getString(R.string.fbw_case11_ind);
            pro_data =  getResources().getString(R.string.fbw_case11_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("AUTOTHROTTLE FAILURE")){
            ind_data =   getResources().getString(R.string.fbw_case12_ind);
            pro_data =  getResources().getString(R.string.fbw_case12_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF SIDESLIP ANGLE SENSORS")){
            ind_data =   getResources().getString(R.string.fbw_case13_ind);
            pro_data =  getResources().getString(R.string.fbw_case13_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF FRONT SIDESLIP ANGLE SENSOR")){
            ind_data =   getResources().getString(R.string.fbw_case14_ind);
            pro_data =  getResources().getString(R.string.fbw_case14_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF REAR SIDESLIP ANGLE SENSOR")){
            ind_data =   getResources().getString(R.string.fbw_case15_ind);
            pro_data =  getResources().getString(R.string.fbw_case15_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF ONE AOA SENSOR")){
            ind_data =   getResources().getString(R.string.fbw_case16_ind);
            pro_data =  getResources().getString(R.string.fbw_case16_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF ONE AOA SENSOR REDUNDANCY")){
            ind_data =   getResources().getString(R.string.fbw_case17_ind);
            pro_data =  getResources().getString(R.string.fbw_case17_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF 2 CHANNELS OF QUAD-REDUNDANT FBW COMPUTERS")){
            ind_data =   getResources().getString(R.string.fbw_case18_ind);
            pro_data =  getResources().getString(R.string.fbw_case18_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF 2 SUB-CHANNELS OF AUTOPILOT COMPUTERS")){
            ind_data =   getResources().getString(R.string.fbw_case19_ind);
            pro_data =  getResources().getString(R.string.fbw_case19_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF FBW COMMUNICATION WITH AIMING AND NAVIGATION SYSTEM")){
            ind_data =   getResources().getString(R.string.fbw_case20_ind);
            pro_data =  getResources().getString(R.string.fbw_case20_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF TWO REDUNDANT CHANNELS OF THE AIRCRAFT CONTROL SURFACES DRIVES")){
            ind_data =   getResources().getString(R.string.fbw_case21_ind);
            pro_data =  getResources().getString(R.string.fbw_case21_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF ONE ENGINE AUTO THROTTLE")){
            ind_data =   getResources().getString(R.string.fbw_case22_ind);
            pro_data =  getResources().getString(R.string.fbw_case22_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF SENSORS OF ONE OF THE TRIMMERS")){
            ind_data =   getResources().getString(R.string.fbw_case23_ind);
            pro_data =  getResources().getString(R.string.fbw_case23_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF TWO ENGINES AUTO THROTTLE")){
            ind_data =   getResources().getString(R.string.fbw_case24_ind);
            pro_data =  getResources().getString(R.string.fbw_case24_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF ONE OR TWO REDUNDANT CHANNELS OF AIRBRAKE POSITION SENSOR")){
            ind_data =   getResources().getString(R.string.fbw_case25_ind);
            pro_data =  getResources().getString(R.string.fbw_case25_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF AIRBRAKE POSITION SENSOR")){
            ind_data =   getResources().getString(R.string.fbw_case26_ind);
            pro_data =  getResources().getString(R.string.fbw_case26_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF TRIM ACTUATORS (DURING PRE-FLIGHT TEST)")){
            ind_data =   getResources().getString(R.string.fbw_case27_ind);
            pro_data =  getResources().getString(R.string.fbw_case27_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF POSITION SENSORS OF LH OR RH SLATS SECTION")){
            ind_data =   getResources().getString(R.string.fbw_case28_ind);
            pro_data =  getResources().getString(R.string.fbw_case28_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF LH AND RH SLATS SECTIONS CONTROL")){
            ind_data =   getResources().getString(R.string.fbw_case29_ind);
            pro_data =  getResources().getString(R.string.fbw_case29_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF POSITION SENSOR OF ONE OF THE FLAPS")){
            ind_data =   getResources().getString(R.string.fbw_case30_ind);
            pro_data =  getResources().getString(R.string.fbw_case30_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("AUTOPILOT MODES FAILURE FAILURE OF FLIGHT DIRECTOR CONTROL")){
            ind_data =   getResources().getString(R.string.fbw_case31_ind);
            pro_data =  getResources().getString(R.string.fbw_case31_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF AUTOPILOT")){
            ind_data =   getResources().getString(R.string.fbw_case32_ind);
            pro_data =  getResources().getString(R.string.fbw_case32_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FAILURE OF LSS")){
            ind_data =   getResources().getString(R.string.fbw_case33_ind);
            pro_data =  getResources().getString(R.string.fbw_case33_pro);}
        else if(title1.equalsIgnoreCase("FBW")&&title2.equalsIgnoreCase("FBW SETTING TO OWN LIMITATIONS (MODES LIMITER FROM FBW)")){
            ind_data =   getResources().getString(R.string.fbw_case34_ind);
            pro_data =  getResources().getString(R.string.fbw_case34_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("COM1 FAILURE")){
            ind_data =   getResources().getString(R.string.radio_case1_ind);
            pro_data =  getResources().getString(R.string.radio_case1_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("COM2 FAILYRE")){
            ind_data =   getResources().getString(R.string.radio_case2_ind);
            pro_data =  getResources().getString(R.string.radio_case2_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("TWO RADIO FAILURE")){
            ind_data =   getResources().getString(R.string.radio_case3_ind);
            pro_data =  getResources().getString(R.string.radio_case3_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("HF RADIO FAILURE")){
            ind_data =   getResources().getString(R.string.radio_case4_ind);
            pro_data =  getResources().getString(R.string.radio_case4_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("RCP FAILURE")){
            ind_data =   getResources().getString(R.string.radio_case5_ind);
            pro_data =  getResources().getString(R.string.radio_case5_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("NO DATA EXCHANGE VIA MUX BUS BETWEEN BKS-29E AND MC")){
            ind_data =   getResources().getString(R.string.radio_case6_ind);
            pro_data =  getResources().getString(R.string.radio_case6_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("FAILURE OF SDC OF DIGITAL INTEGRATED COMMUNICATION MODULE")){
            ind_data =   getResources().getString(R.string.radio_case7_ind);
            pro_data =  getResources().getString(R.string.radio_case7_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("FAILURE OF INTERNAL COMMUNICATION SYSTEM")){
            ind_data =   getResources().getString(R.string.radio_case8_ind);
            pro_data =  getResources().getString(R.string.radio_case8_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("VWS FAILURE")){
            ind_data =   getResources().getString(R.string.radio_case9_ind);
            pro_data =  getResources().getString(R.string.radio_case9_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("IFF INTERROGATOR FAIL")){
            ind_data =   getResources().getString(R.string.radio_case10_ind);
            pro_data =  getResources().getString(R.string.radio_case10_pro);}
        else if(title1.equalsIgnoreCase("RADIO")&&title2.equalsIgnoreCase("IFF TRANSPONDER FAIL")){
            ind_data =   getResources().getString(R.string.radio_case11_ind);
            pro_data =  getResources().getString(R.string.radio_case11_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("AIR DATA SYSTEM FAILURE")){
            ind_data =   getResources().getString(R.string.nav_case1_ind);
            pro_data =  getResources().getString(R.string.nav_case1_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("INS1 FAILURE")){
            ind_data =   getResources().getString(R.string.nav_case2_ind);
            pro_data =  getResources().getString(R.string.nav_case2_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("INS2 FAILURE")){
            ind_data =   getResources().getString(R.string.nav_case3_ind);
            pro_data =  getResources().getString(R.string.nav_case3_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("BOTH INS FAILURE")){
            ind_data =   getResources().getString(R.string.nav_case4_ind);
            pro_data =  getResources().getString(R.string.nav_case4_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("DEGRADATION OF INS ACCURACY")){
            ind_data =   getResources().getString(R.string.nav_case5_ind);
            pro_data =  getResources().getString(R.string.nav_case5_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("CYCLING OF INS ALGORITHMS")){
            ind_data =   getResources().getString(R.string.nav_case6_ind);
            pro_data =  getResources().getString(R.string.nav_case6_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("VIM-95 FAILURE AT LANDING")){
            ind_data =   getResources().getString(R.string.nav_case7_ind);
            pro_data =  getResources().getString(R.string.nav_case7_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("PITOT-STATIC TUBE FAILURE")){
            ind_data =   getResources().getString(R.string.nav_case8_ind);
            pro_data =  getResources().getString(R.string.nav_case8_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("MFD FAILURE")&&title3.equalsIgnoreCase("MFD FAILURE")){
            ind_data =   getResources().getString(R.string.nav_case9_ind);
            pro_data =  getResources().getString(R.string.nav_case9_1_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("MFD FAILURE")&&title3.equalsIgnoreCase("WITH ONE SERVICEABLE ENGINE")){
            ind_data =   getResources().getString(R.string.nav_case9_ind);
            pro_data =  getResources().getString(R.string.nav_case9_2_pro);}
        else if(title1.equalsIgnoreCase("NAV")&&title2.equalsIgnoreCase("MFD FAILURE")&&title3.equalsIgnoreCase("AT THREE MFD FAILURE")){
            ind_data =   getResources().getString(R.string.nav_case9_ind);
            pro_data =  getResources().getString(R.string.nav_case9_3_pro);}



        Button indications_bt = view.findViewById(R.id.indications_bt);
        indications_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new indications(title1,title2,title3,ind_data,pro_data) );
            }
        });

        Button proceduers_bt = view.findViewById(R.id.proceduers_bt);
        proceduers_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFragment(new proceduers(title1,title2,title3,pro_data,ind_data) );
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