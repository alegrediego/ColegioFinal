package com.solvd;

public class DidacticMaterials extends Infrastructure{


    public static String getDmcount() {
        return "Number of Didactic Materials: "+dmcount;
    }

    public static void setDmcount(int dmcount) {
        DidacticMaterials.dmcount = dmcount;
    }

    private static int dmcount;

    public DidacticMaterials(){
        dmcount++;


    }
    @Override
    public String broken() {
        return null;
    }
}
