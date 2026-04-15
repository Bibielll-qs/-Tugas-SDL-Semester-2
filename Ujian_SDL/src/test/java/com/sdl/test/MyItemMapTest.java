/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.test;

import com.sdl.ujian.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class MyItemMapTest {
    
    public MyItemMapTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem[] testList = new MyItem[2];
        testList[0]= test;
        testList[1]= test1;
        
        MyItemMap mapTest = new MyItemMap();
        mapTest.setData(testList);
        assertEquals("A = 4",mapTest.getData()[0]);
    }
    
    public void test2(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem[] testList = new MyItem[2];
        testList[2]= test;
        testList[1]= test1;
        testList[0]= test2;
        
        MyItemMap mapTest = new MyItemMap();
        mapTest.setData(testList);
        assertEquals(0,mapTest.searching("C"));
        assertEquals(-1,mapTest.searching("D"));
    }
    public void test3(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem[] testList = new MyItem[2];
        testList[2]= test;
        testList[1]= test1;
        testList[0]= test2;
        
        MyItemMap mapTest = new MyItemMap();
        mapTest.setData(testList);
        mapTest.sorting();
        assertEquals(2,mapTest.searching("C"));
        assertEquals(0,mapTest.searching("A"));
    }
}
