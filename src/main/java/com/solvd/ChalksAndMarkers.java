package com.solvd;

public class ChalksAndMarkers extends DidacticMaterials {

    public ChalksAndMarkers(int Mnumber,int Cnumber){
        this.Cnumber = Cnumber;
        this.Mnumber = Mnumber;

    }

    public int getCnumber() {
        return Cnumber;
    }

    public int setCnumber(int Cnumber) {
        return this.Cnumber = Cnumber;

    }

    private int Cnumber;

    public int getMnumber() {
        return Mnumber;
    }

    public void setMnumber(String Mnumber) {
        Mnumber = Mnumber;
    }

    private int Mnumber;
}
