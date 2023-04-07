package com.glc;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;
import java.util.List;

import org.junit.Test;

import com.glc.BookApi.Book;
import com.glc.BookApi.ReadingList;

public class BookApiTest {

    @Test
    public void emptyListTest (){
        //Setup
        ReadingList list = new ReadingList();
        //Execute
        int result = list.numberRead();
        //Assert
        assertEquals(0, result);
    }

    @Test
    public void additionTest (){
        //Setup
        ReadingList list = new ReadingList();
        Book book = new Book("Martian","Davidoff",362,2004);
        list.addBook(book, "Sep 1", 5);
        //Execute
        int result = list.numberRead();
        //Assert
        assertEquals(1, result);
    }

    @Test
    public void multipleAdditionTest (){
        //Setup
        ReadingList list = new ReadingList();
        Book book = new Book("Martian","Davidoff",362,2004);
        Book book2 = new Book("Rich dad","markeloff",365,2024);
        list.addBook(book, "Sep 1", 5);
        list.addBook(book2, "Sep 5", 1);
        //Execute
        int result = list.numberRead();
        //Assert
        assertEquals(2, result);
    }

    @Test
    public void removeBookTest (){
        //Setup
        ReadingList list = new ReadingList();
        ReadingList list2 = new ReadingList();
        Book book = new Book("Martian","Davidoff",362,2004);
        Book book2 = new Book("Atomic Habbits","windi",305,2001);
        list.addBook(book, "Sep 1", 5);
        list.addBook(book2, "Sep 5", 4);
        list.removeBook("Martian");
        list2.addBook(book2, "Sep 5", 4);
        
        //Execute
        List<Book> result = list.getBook();
        //Assert
        assertEquals(list2.getBook(), result);
    }

    @Test
    public void Test5(){
        //Setup
        ReadingList list = new ReadingList();
        ReadingList list2 = new ReadingList();
        Book book = new Book("Abcd", "UBS", 10, 2023);
        list.addBook(book, "Sep 1", 1);
        list2.addBook(book, "Sep 1", 1);
        //Execute
        List<Book> result = list.getBook();
        //Assert
        assertEquals(list2.getBook(), result);
    }
}
