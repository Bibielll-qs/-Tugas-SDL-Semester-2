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
public class MyItemListTest {
    
    public MyItemListTest() {
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
        
        MyItemList listTest = new MyItemList();
        listTest.setData(testList);
        MyItem[] dataTest = listTest.getData();
        assertEquals("A = 4",dataTest[0]);
    }
    @Test
    public void test2(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem[] testList = new MyItem[3];
        testList[2]= test;
        testList[1]= test1;
        testList[0]= test2;
        
        MyItemList listTest = new MyItemTest();
        listTest.setData(testList);
        assertEquals(0,listTest.searching("C"));
        assertEquals(-1,listTest.searching("D"));
    }
    
    @Test
    public void test3(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem[] testList = new MyItem[3];
        testList[2]= test;
        testList[1]= test1;
        testList[0]= test2;
        
        MyItemList listTest = new MyItemList();
        listTest.setData(testList);
        listTest.sorting();
        assertEquals(2,listTest.searching("C"));
        assertEquals(0,listTest.searching("A"));
    }
    
    @Test
    public void test4(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem test3 = new MyItem("C",1);
        
        MyItemList listTest = new MyItemList(4);
        listTest.append(test,0);
        listTest.append(test1,1);
        listTest.append(test2,2);
        listTest.append(test3,3);
        
        MyItem[] dataTest = listTest.getData();
        assertEquals(1,dataTest[3].getNumbers());
        assertEquals("C",dataTest[3].getData());
    }
    
}
