package com.solvd.Enum;

public class Subjects {

    public enum subjects{
        MATHS("Maths"),
        GEOGRAPHY("Geography"),
        MUSIC("Music"),
        ARTS("Arts"),
        HISTORY("History"),
        SCIENCE("Science");

        private String name;

        subjects(String name){
            this.name = name;

        }
    }
}
