package com.solvd;

import com.solvd.Interface.Broken;

public class Desk extends Furniture implements Broken {

    public String getDesknumber() {
        return desknumber;
    }

    public void setDesknumber(String desknumber) {
        this.desknumber = desknumber;
    }

    private String desknumber;

    public Desk(){

    }

    public Desk(String number){
        this.desknumber = number;

    }


    @Override
    public String broken() {
        return  desknumber +" is broken";
    }
}
