package com.glc;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;
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
        //Execute
        int result = list.numberRead();
        //Assert
        assertEquals(1, result);
    }
}
