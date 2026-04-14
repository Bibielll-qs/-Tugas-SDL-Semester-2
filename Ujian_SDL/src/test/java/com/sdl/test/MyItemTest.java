package com.sdl.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class MyItemTest {
    
    public MyItemTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1(){
        MyItem test = new MyItem();
        test.setData("A");
        test.setNumbers(4);
        assertEquals("A",test.getData());
        assertEquals(10,test.getNumbers());
        
        MyItem test1 = new MyItem("B",3);
        assertEquals("B",test1.getData());
        assertEquals(3,test1.getNumbers());
        
    }
    
    @Test
    public void test2(){
        MyItem test = new MyItem();
        test.setData("A");
        test.setNumbers(4);
        assertEquals("A = 4",test);
        
        MyItem test1 = new MyItem("B",3);
        assertEquals("B = 3",test1);
    }
}
