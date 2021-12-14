package com.solvd;

import org.apache.log4j.Logger;

final public class Assistant extends Person{
    private final String FirstName;
    private final String LastName;
    private final String DNI;
    private  Enum Level;

    private static Logger Logjava = Logger.getLogger(Assistant.class);

        public Assistant (String FirstName, String LastName, String DNI){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DNI = DNI;
        Logjava.debug("Assistant "+FirstName+" "+LastName+" "+DNI);
    };

        public Assistant (String FirstName, String LastName, String DNI, Enum Level){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DNI = DNI;
        this.Level = Level;
        Logjava.debug("Assistant "+FirstName+" "+LastName+" "+DNI+" "+Level);
}

    public Object getName(){
            return FirstName +" "+ LastName;
    }

    @Override
    public Object yes() {return "Assistant "+FirstName+" "+ LastName+" is present";}

    @Override
    public Object no() {return "Assistant "+FirstName+" "+ LastName+" is not present";}


    @Override
    public Object ill() {
        return "Assistant "+FirstName+" "+LastName+" is ill";
    }

    @Override
    public Number getValue() {
        return null;
    }

    double salary = 1000;
    @Override
    public void setValue(Number number) {
        this.salary = salary*1.1;
        System.out.println(salary);
    }
}
