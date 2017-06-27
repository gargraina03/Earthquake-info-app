package com.example.android.quakereport;

/**
 * Created by Raina on 26-06-2017.
 */

public class Earthquake {
    private String mManitude;
    private String mPlace;
    private Long mtimeinmillis;


    //constructor
    public Earthquake(String Magnitude, String Place, Long timeinmillis){

         mManitude = Magnitude;
         mPlace = Place;
         mtimeinmillis = timeinmillis ;
    }


    //getter methods
    public String getmManitude(){
        return mManitude;
    }

    public String getmPlace(){
        return mPlace;
    }

    public Long getmtimeinmillis() {
        return mtimeinmillis;
    }
};
