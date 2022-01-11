package com.solvd;

import com.solvd.Enum.Level;
import com.solvd.Enum.Subjects;
import com.solvd.Enum.Year;
import com.solvd.Interface.Attendance;
import com.solvd.Interface.Disease;
import com.solvd.Interface.Presenteeism;

public abstract class Person implements Attendance, Disease, Presenteeism {

    private com.solvd.Enum.Level Level;

    public Level getLevel(){
        return Level;
    }

    private com.solvd.Enum.Year Year;

    public Year getYear() { return Year;}

    private Subjects subjects;

    public Subjects getSubjects() {return subjects;}

    @Override
    public String yes() {
        return null;
    }

    @Override
    public String no() {
        return null;
    }
}
