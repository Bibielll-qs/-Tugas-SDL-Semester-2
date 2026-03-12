/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test; //menyimpan file ke pckage com.test

import com.sdl.Rekursif; //mengimport isi dari kelas com.sdl.Rekursif
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; 
//mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 


public class Rekursif4Test { //deklarasi kelas Rekursif4Test
    
    public Rekursif4Test() { //membuat metode constructor Rekursif4Test()
    } //akhir metode constructor Rekursif4Test()
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() { //deklarasi metode setUp
    } //akhir dari metode setUp
    
    @Test //metode untuk mengetes program pada file 
    public void test1(){ //membuat metode test()
        int[] hasil = {1,4,7,10,13}; //
        int[] data = Rekursif.getDeretHitung(hasil, 1, 3, 4);
        assertArrayEquals(hasil,data); //
    } //akhir dari metode test1()
    
} //akhir dari kelas Rekursif4Test
