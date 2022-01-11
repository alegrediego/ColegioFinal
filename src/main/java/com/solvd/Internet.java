package com.solvd;

import com.solvd.Interface.Payments;

public class Internet extends ServiceExpenses implements Payments {
    public String month;{

    }

    public Internet(String month){
    this.month = month;

    }


    @Override
    public Object P1() {
        return month +" Payed";
    }

    @Override
    public Object N1() {
        return month +" not Payed";
    }
}
