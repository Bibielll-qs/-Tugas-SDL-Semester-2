package com.test; //menyimpan file ke package com.test

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.*; //mengimport semua isi dari class com.sdl
import java.util.Arrays; //memanggil fungsi arrays untuk mengurutkan array


public class MyStringLarikSearchingTest { //deklarasi class MyStringLarikSearchingTest
    
    public MyStringLarikSearchingTest() { //metode constructor default MyStringLarikSearchingTest()
    } //akhir dari metode constructor default MyStringLarikSearchingTest()
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test //metode untuk mengetes program pada file 
    public void testSequential(){ //membuat metode testSequential()
        String[] data ={"adi","puspa","budi","dina","susi"}; //membuat isi data array data bertipe string 
        MyStringLarik test = new MyStringLarik(data); //membuat objek test pada class MyStringLarik berisi array data
        assertEquals(0,test.sequentialSearch("adi")); //mengecek apakah "adi" ada di indeks 0 dalam array data, dengan 
        assertEquals(-1,test.sequentialSearch("joni")); //mengecek apakah "joni" ada di indeks -1 dalam array data/tidak ada dalam array data
    } //akhir dari metode testSequential()
    
    @Test //metode untuk mengetes program pada file 
    public void testBinary(){ //membuat metode testBinary()
        String[] data ={"adi","puspa","budi","dina","susi"}; //membuat isi data array data bertipe string
        Arrays.sort(data); //mengurutkan array data secara alfabet
        MyStringLarik test = new MyStringLarik(data); //membuat objek test pada class MyStringLarik berisi array data
        assertEquals(0,test.binarySearch("adi")); //mengecek apakah "adi" ada di indeks 0 dalam array data, dengan binary search
        assertEquals(-1,test.binarySearch("joni")); 
        //mengecek apakah "joni" ada di indeks -1 dalam array data/tidak ada dalam array data, dengan binary search
    } //akhir dari metode testBinary()
    
} //akhir dari class MyStringLarikSearchingTest
