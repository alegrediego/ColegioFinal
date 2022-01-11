package com.solvd.Persons;

import com.solvd.Person;
import org.apache.log4j.Logger;

final public class Assistant extends Person {
    private final String FirstName;
    private final String LastName;
    public final String DNI;
    public Enum Level;

    private static final Logger log = Logger.getLogger(Assistant.class);

        public Assistant (String FirstName, String LastName, String DNI, double salary){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DNI = DNI;
        this.salary= salary;
        log.debug("Assistant "+FirstName+" "+LastName+" "+DNI+" "+salary);
    }

        public Assistant (String FirstName, String LastName, String DNI, Enum Level, double salary){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DNI = DNI;
        this.Level = Level;
        this.salary = salary;
        log.debug("Assistant "+FirstName+" "+LastName+" "+DNI+" "+Level+" The salary is: "+salary*1.1);
}

    public String getName(){
            return FirstName +" "+ LastName;
    }

    @Override
    public String yes() {return "Assistant "+FirstName+" "+ LastName+" is present";}

    @Override
    public String no() {return "Assistant "+FirstName+" "+ LastName+" is not present";}


    @Override
    public String ill() {
        return "Assistant "+FirstName+" "+LastName+" is ill";
    }

    @Override
    public Number getValue() {
        return null;
    }

    double salary;
    @Override
    public double setValue(Number number) {
       return this.salary = salary*1.1;
    }
}
