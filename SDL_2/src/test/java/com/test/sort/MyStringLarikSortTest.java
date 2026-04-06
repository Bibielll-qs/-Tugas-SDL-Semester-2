/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.MyStringLarik;
import com.sdl.*;
/**
 *
 * @author LENOVO
 */
public class MyStringLarikSortTest {
    public MyStringLarikSortTest(){
        
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testSort(){
        String[] data = {"Bila", "Icha", "Noah", "Geby", "Theo"};
        MyStringLarik test = new MyStringLarik(data);
        test.bubbleSort(data, 1);
        test.selectionSort(data, data.length);
        test.insertionSort(data, data.length);
    }
}
