package com.solvd;

public class Furniture extends Infrastructure{
    public static String getCount() {
        return "Number of furniture "+ count;
    }

    public static void setCount(int count) {
        Furniture.count = count;
    }

    private static int count;
    String furniture;

    public Furniture(){
        count++;
    }

    @Override
    public String broken() {
        return null;
    }
}
