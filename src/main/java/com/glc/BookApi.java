package com.glc;

import java.util.ArrayList;
import java.util.List;

public class BookApi {
    public static class Book {
        String title;
        String author;
        int length;
        int year;

        public Book(String name,String auth,int leng,int ye){
            title = name;   
            author = auth;
            length = leng;
            year = ye; 
        }
    }

    public static class ReadingList{
        List<Book> books = new ArrayList<>();

        public int numberRead(){
            return books.size();
        }
    }
}
