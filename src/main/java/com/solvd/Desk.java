package com.solvd;

public class Desk extends Furniture implements Broken{
    private String desk1,desk2,desk3,desk4;
    public Desk(){

    }

    //getters and setters?

    public Desk(String number){
        this.desk1 = number;
        this.desk2 = number;
        this.desk3 = number;
        this.desk4 = number;
    }


    @Override
    public Object broken() {
        return  desk2 +" is broken";
    }
}
