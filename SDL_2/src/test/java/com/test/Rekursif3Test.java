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
    public void test2(){ //membuat metode test2()
        int[] data = new int[5]; //deklarasi array data dengan ukuran 5
        //mengisi data array
        data[0]=1; 
        data[1]=2; 
        data[2]=3;
        data[3]=4;
        data[4]=5;
        
        int hasil = Rekursif.arraySum(data,4); //deklarasi & simpan metode arraySm() data ke 4 pada hasil
        System.out.println("Hasil = "+hasil); //mencetak hasil
        assertEquals(10,Rekursif.arraySum(data, 4)); //mengecek hasil perhitungan array data yang ke 4 adalah 10
        
        int hasil1 = Rekursif.arraySum(data,4); //deklarasi & simpan metode arraySm() data ke 4 pada hasil1
        System.out.println("Hasil = "+hasil1); //mencetak hasil
        assertEquals(6,Rekursif.arraySum(data, 3)); //mengecek hasil perhitungan array data yang ke 3 adalah 6
    } //akhir dari metode test2()
    
    @Test //metode untuk mengetes program pada file 
    public void test3(){ //membuat metode test3()
        int[] data = new int[5]; //deklarasi array data dengan ukuran 5
        //memasukkan indeks array data pada metode deretHitung dengan parameter awal, selisih, & indeks_suku
        data[0]=Rekursif.deretHitung(1, 3, 1);
        data[1]=Rekursif.deretHitung(1, 3, 2);
        data[2]=Rekursif.deretHitung(1, 3, 3);
        data[3]=Rekursif.deretHitung(1, 3, 4);
        data[4]=Rekursif.deretHitung(1, 3, 5);
        
        System.out.println("Hasil = "+data); //mencetak hasil
        int[] hasil = {1,4,7,10,13}; //deklarasi & simpan data array hasil
        
        assertArrayEquals(hasil,data); //mengecek apakah array hasil & array data memiliki isi yang sama
    } //akhir dari metode test3()
} //akhir dari kelas Rekursif3Test 
