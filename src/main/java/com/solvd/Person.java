package com.solvd;

public abstract class Person implements Attendance, Disease, Presenteeism{

    private Level Level;

    public Level getLevel(){
        return Level;
    }

    private Year Year;

    public Year getYear() { return Year;}

    private Subjects subjects;

    public Subjects getSubjects() {return subjects;}
}
