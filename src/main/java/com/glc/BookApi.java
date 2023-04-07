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

        public void setDate(String date){
            dateRead = date;
        }

        public void setRating(int ratingInput){
            rating = ratingInput;
        }

        public int getRating(){
            return rating;
        }

        

    }

    public static class ReadingList{
        List<Book> books = new ArrayList<>();

        public int numberRead(){
            return books.size();
        }

        public void addBook(Book book,String dateRead, int rating){
            books.add(book);
            book.setDate(dateRead);
            book.setRating(rating);
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

        public List<Book> getBooksByRating(int rating){
            List<Book> ratedBooks = new ArrayList<>();
            for(Book book: books){
                if(book.getRating() == rating){
                    ratedBooks.add(book);
                }
            }
            return ratedBooks;
        }
    }

   
}
