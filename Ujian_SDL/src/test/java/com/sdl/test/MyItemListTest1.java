/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sdl.test;

import com.sdl.ujian.MyItem;
import com.sdl.ujian.MyItemList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class MyItemListTest1 {
    
    public MyItemListTest1() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem test3 = new MyItem("C",1);
        
        MyItemList listTest = new MyItemList(4);
        listTest.append(test,0);
        listTest.append(test1,1);
        listTest.append(test2,2);
        listTest.append(test3,3);
        
        assertEquals(4,listTest.getSize());
        assertEquals(3,listTest.getDistinctDataSize());
        
        MyItemList listTest1 = new MyItemList(3);
        listTest1.append(test1,0);
        listTest1.append(test2,1);
        listTest1.append(test3,2);
        
        assertEquals(3,listTest1.getSize());
        assertEquals(2,listTest1.getDistinctDataSize());   
    }
    
    @Test
    public void test2(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem test3 = new MyItem("C",1);
        
        MyItemList listTest = new MyItemList(4);
        listTest.append(test,0);
        listTest.append(test1,1);
        listTest.append(test2,2);
        listTest.append(test3,3);
        
        assertEquals(3,listTest.getSumOfNumbersOfData("C"));
        
        MyItemList listTest1 = new MyItemList(3);
        listTest1.append(test1,0);
        listTest1.append(test2,1);
        listTest1.append(test3,2);
        
        assertEquals(3,listTest1.getSumOfNumbersOfData("C"));
    }
    
    @Test
    public void test3(){
        MyItem test = new MyItem("A",4);
        MyItem test1 = new MyItem("B",3);
        MyItem test2 = new MyItem("C",2);
        MyItem test3 = new MyItem("C",1);
        
        MyItemList listTest = new MyItemList(4);
        listTest.append(test,0);
        listTest.append(test1,1);
        listTest.append(test2,2);
        listTest.append(test3,3);
        
        MyItemMap mapTest = listTest.getSumOfNumbersOfDistinctData();
        mapTest.sorting();
        MyItem[] dataTest = mapTest.getData();
        assertEquals(3,dataTest[2].getNumbers());
        assertEquals("C",dataTest[2].getData());
        
        MyItemList listTest1 = new MyItemList(3);
        listTest1.append(test1,0);
        listTest1.append(test2,1);
        listTest1.append(test3,2);
        
        MyItemMap mapTest1 = listTest1.getSumOfNumbersOfDistinctData();
        mapTest1.sorting();
        MyItem[] dataTest = mapTest1.getData();
        assertEquals(3,dataTest[1].getNumbers());
        assertEquals("C",dataTest[1].getData());
        assertEquals(2,mapTest1.getSize());
        
        
    }
}
