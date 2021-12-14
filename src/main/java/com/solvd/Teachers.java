package com.solvd;

import org.apache.log4j.Logger;

final public class Teachers<T> extends Person {
        private final String FirstName;
        private final String LastName;
        private final String DNI;
        private Enum Level;


        private static Logger Logjava = Logger.getLogger(Teachers.class);

        public Teachers(String FirstName, String LastName, String DNI){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DNI = DNI;
        Logjava.debug("Teacher "+FirstName+" "+LastName+" "+DNI);
    }

         public Teachers (String FirstName, String LastName, String DNI, Enum Level){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.DNI = DNI;
            this.Level= Level;
            Logjava.debug("Teacher "+FirstName+" "+LastName+" "+DNI+" "+Level);
    };

    public Object getName(){

        return FirstName+" "+LastName;
    }
    @Override
    public Object yes() {
            return "Teacher "+FirstName+" "+ LastName+" is present";

    }

    @Override
    public Object no() {
        return "Teacher "+FirstName+" "+ LastName+" is not present";
    }



    @Override
    public Object ill() {
        return "Teacher "+FirstName+" "+LastName+" is ill";
    }

    double salary = 1000;
    public void setValue(Number number) {


    }

    @Override
    public Number getValue() {
        return salary ;
    }
}

