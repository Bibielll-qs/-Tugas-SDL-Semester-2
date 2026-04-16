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
        MyItem[] dataTest = mapTest.getData();
        assertEquals("A = 4",dataTest[0]);
    }
    
    public void test2(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem[] testList = new MyItem[3];
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
        MyItem[] testList = new MyItem[3];
        testList[2]= test;
        testList[1]= test1;
        testList[0]= test2;
        
        MyItemMap mapTest = new MyItemMap();
        mapTest.setData(testList);
        mapTest.sorting();
        assertEquals(2,mapTest.searching("C"));
        assertEquals(0,mapTest.searching("A"));
    }
    
    public void test4(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem test3 = new MyItem("C",1);
        
        MyItemList mapTest = new MyItemList();
        MyItem[] dataTest = new MyItem[3];
        mapTest.setData(dataTest);
        mapTest.append(test,0);
        mapTest.append(test1,1);
        mapTest.append(test2,2);
        mapTest.append(test3,2);
        MyItem[] dataTest = mapTest.getData();
        assertEquals(2,dataTest[2].getNumbers());
        assertEquals("C",dataTest[2].getData());
    }
}
