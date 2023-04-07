package com.glc;

import java.util.ArrayList;
import java.util.List;

public class BookApi {
    public static class Book {
        String title;
        String author;
        String dateRead;
        int length;
        int year;
        int rating;

        public Book(String name,String auth,int leng,int ye){
            title = name;   
            author = auth;
            length = leng;
            year = ye; 
        }

        public String getTitle(){
            return title;
        }

        public int getRating(){
            return rating;
        }

        public void setDateRead(String date){
            dateRead = date;
        }

        public void setRating(int num){
            rating = num;
        }
    }

    public static class ReadingList{
        List<Book> books = new ArrayList<>();

        public int numberRead(){
            return books.size();
        }

        public void addBook(Book book,String dateRead, int rating){
            books.add(book);
        }
    }
}
