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


public class Rekursif3Test { //deklarasi kelas Rekursif3Test
    
    public Rekursif3Test() { //membuat constructor Rekursif3Test()
    } //akhir dari constructor Rekursif3Test()
    
    @Test //metode untuk mengetes program pada file 
    public void test1(){ //membuat metode test()
        int hasil = Rekursif.fibonaci(1, 2, 4); 
        //memanggil metode fibonacci dengan parameter dari kelas Rekursif, untuk menghitung deret fibonacci
        System.out.println("Hasil = "+hasil); //mencetak hasil
        assertEquals(5,Rekursif.fibonaci(1, 2, 4)); 
        //mengecek apakah hasil perhitungan metode fibonaci() adalah 5
    } //akhir dari metode test1
    
    @Test //metode untuk mengetes program pada file 
    public void test2(){ //membuat metode test()
        int[] data = new int[5]; //
        //mengisi data array
        data[0]=1; 
        data[1]=2; 
        data[2]=3;
        data[3]=4;
        data[4]=5;
        
        int hasil = Rekursif.arraySum(data,4); //
        System.out.println("Hasil = "+hasil);
        assertEquals(10,Rekursif.arraySum(data, 4)); //
        
        int hasil1 = Rekursif.arraySum(data,4);
        System.out.println("Hasil = "+hasil1);
        assertEquals(6,Rekursif.arraySum(data, 3));
    }
    
    @Test //metode untuk mengetes program pada file 
    public void test3(){ //membuat metode test3()
        int[] data = new int[5]; //
        //
        data[0]=Rekursif.deretHitung(1, 3, 1);
        data[1]=Rekursif.deretHitung(1, 3, 2);
        data[2]=Rekursif.deretHitung(1, 3, 3);
        data[3]=Rekursif.deretHitung(1, 3, 4);
        data[4]=Rekursif.deretHitung(1, 3, 5);
        
        System.out.println("Hasil = "+data); //
        int[] hasil = {1,4,7,10,13}; //
        
        assertArrayEquals(hasil,data); //
    } //akhir dari metode test3()
} //akhir dari kelas Rekursif3Test 
