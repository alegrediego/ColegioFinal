package com.solvd.Persons;

import com.solvd.Person;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

final public class Teachers<T> extends Person {
        private final String FirstName;
        private final String LastName;
        public final String DNI;
        public Enum Level;
        public Enum subjects;


        private static Logger log = Logger.getLogger(Teachers.class);

        public Teachers(String FirstName, String LastName, String DNI){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DNI = DNI;
        log.debug("Teacher "+FirstName+" "+LastName+" "+DNI);
    }

         public Teachers (String FirstName, String LastName, String DNI, Enum Level, Enum subjects){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.DNI = DNI;
            this.Level= Level;
            this.subjects = subjects;
            String sp = StringUtils.SPACE ;
            log.debug("Teacher"+sp+FirstName+sp+LastName+sp+DNI+sp+Level+sp+subjects);
    };

    public Object getName(){

        return FirstName+" "+LastName;
    }
    @Override
    public String yes() {
            return "Teacher "+FirstName+" "+ LastName+" is present";

    }

    @Override
    public String no() {
        return "Teacher "+FirstName+" "+ LastName+" is not present";
    }



    @Override
    public String ill() {
        return "Teacher "+FirstName+" "+LastName+" is ill";
    }

    double salary = 1000;

    @Override
    public Number getValue() {
        return null;
    }

    public double setValue(Number number) {


        return 0;
    }


}

