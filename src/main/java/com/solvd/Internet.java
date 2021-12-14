package com.solvd;

public class Internet extends ServiceExpenses implements Payments {

    //Too empty

    public Internet(){

    }

    @Override
    public Object Payed() {
        return "Internet Payed";
    }

    @Override
    public Object NotPayed() {
        return "Internet not Payed";
    }
}
