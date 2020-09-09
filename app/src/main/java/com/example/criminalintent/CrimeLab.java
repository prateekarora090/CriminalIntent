package com.example.criminalintent;

import android.content.Context;

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab();
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        //Doing nothing here for now...
    }
}
