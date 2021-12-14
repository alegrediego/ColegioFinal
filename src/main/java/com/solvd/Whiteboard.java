package com.solvd;

public class Whiteboard extends Furniture implements Broken{
    //private modifier
    //setters and getters
    String whiteboard1,whiteboard2,whiteboard3,whiteboard4;

    public Whiteboard(){

    }

    public Whiteboard(String number){
        this.whiteboard1 = number;
        this.whiteboard2 = number;
        this.whiteboard3 = number;
        this.whiteboard4 = number;
    }


    @Override
    public Object broken() {
        return whiteboard1 +" is broken";
    }
}
