package com.test; //menyimpan file ke pckage com.test

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; 
//mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*;
import com.sdl.*; //mengimport semua isi dari kelas com.sdl
 
public class RekursifTest { //deklarasi kelas RekursifTest
    
    public RekursifTest() { //metode constructor default RekursifTest()
    } //akhir dari metode constructor default RekursifTest()
    
    @Test //metode untuk mengetes program pada file 
    public void test1(){ //membuat metode test1()
        int hasil_faktorial = Rekursif.faktorial(2); 
        //deklarasi & menyimpan perhitungan dari memanggil metode faktorial() deret 2
        System.out.println("Hasil = "+hasil_faktorial); //mencetak hasil
        assertEquals(2,Rekursif.faktorial(2)); //mengecek hasil perhitungan metode faktorial() adalah 2 di deret 2
        assertEquals(6,Rekursif.faktorial(3)); //mengecek perhitungan metode faktorial() adalah 6 di deret 3
    } //akhir dari metode test1()
    
    @Test //metode untuk mengetes program pada file 
    public void test2(){ //membuat metode test2()
        int hasil_fibonaci = Rekursif.fibo(3); 
        //deklarasi & menyimpan perhitungan dari memanggil metode fibo deret 3
        System.out.println("Hasil = "+hasil_fibonaci); //mencetak hasil
        assertEquals(2,Rekursif.fibo(3)); //mengecek perhitungan metode faktorial() adalah 2 di deret 3
    } //akhir dari metode test2()
} //akhir dari kelas RekursifTest
