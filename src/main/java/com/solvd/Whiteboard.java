package com.solvd;

import com.solvd.Interface.Broken;

public class Whiteboard extends Furniture implements Broken {
    public String getWhiteboardNumber() {
        return whiteboardNumber;
    }

    public void setWhiteboardNumber(String whiteboardNumber) {
        this.whiteboardNumber = whiteboardNumber;
    }

    public String whiteboardNumber;

    public Whiteboard(){

    }

    public Whiteboard(String number){
        this.whiteboardNumber = number;
    }


    @Override
    public String broken() {
        return whiteboardNumber+" is broken";
    }
}
