/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.MyLarik;
/**
 *
 * @author LENOVO
 */
public class SortTest6 {
     public SortTest6() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testSort(){
        double[] data = {5,4,1,10,21,15,13};
        MyLarik test = new MyLarik(data);
        test.selectionSort(data, data.length);
    }
}
