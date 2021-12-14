package com.solvd;

import org.apache.log4j.Logger;


public class Students extends Person {
    private String Name;
    private String LastName;
    private String DNI;
    private Enum Year;
    private Enum subjects;

    private static Logger Logjava = Logger.getLogger(Students.class);

    public Students(String Name, String LastName, String DNI, Enum Year, Enum subjects) {


        this.Name = Name;
        this.LastName = LastName;
        this.DNI = DNI;
        this.Year = Year;
        this.subjects = subjects;
        Logjava.debug("Student " + Name + " " + LastName + " " + DNI + " " + Year + " " + subjects);
    }

    public Object getName() {

        return Name + " " + LastName;
    }


    @Override
    public Object yes() {

        return null;
    }

    @Override
    public Object no() {
        return null;
    }


    ///Should not be object(it should be String)
    public String ill() {
        return "Student " + Name + " " + LastName + " is ill";
    }


    @Override
    public Number getValue() {
        return null;
    }

    @Override
    public void setValue(Number number) {

    }
}

