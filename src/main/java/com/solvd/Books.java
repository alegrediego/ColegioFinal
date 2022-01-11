package com.solvd;

public class Books extends DidacticMaterials{
    private static int count;
    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }
    public String bookname;

    String books;

    public static String getCount() {
        return "Number of books in the library: "+count;

    }

    public static void setCount(int count) {
        Books.count = count;
    }


    public Books(String bookname){
        count++;

    }

}
