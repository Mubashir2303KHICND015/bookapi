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

        public String getTitle(){
            return title;
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

        public void removeBook(String title){
            for(Book book : books){
                if(book.getTitle().equals(title)){
                    books.remove(book);
                    break;
                }
            }
        }

        public List<Book> getBook(){
            return books;
        }
    }
}
