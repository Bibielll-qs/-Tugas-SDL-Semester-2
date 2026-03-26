package com.test; //menyimpan file ke package com.test

import org.junit.jupiter.api.BeforeEach;  //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test
import com.sdl.*; //mengimport semua isi dari class com.sdl
import java.util.Arrays; //memanggil fungsi arrays untuk mengurutkan array

public class SearchingTest { //deklarasi class SearchingTest
    
    public SearchingTest() { //membuat metode constructor default SearchingTest()
    } //akhir dari metode constructor default SearchingTest()
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() { //membuat metode setUp()
    } //akhir dari metode setUp()
    
    @Test //metode untuk mengetes program pada file 
    public void testCetakArray(){ //membuat metode testCetakArray()
        double[] data = {5,4,1,10,21,15,13}; //membuat isi data array data bertipe double
        MyLarik test = new MyLarik(data); //membuat objek test pada class Mylarik
        test.cetakData(); //memanggil metode cetakData() pada objek test
        
        double[] data1 = {55,4,1,100,2,15,13}; //membuat isi data array data1 bertipe double
        MyLarik test1 = new MyLarik(data1); //membuat objek test1 pada class Mylarik
        test1.cetakData(); //memnaggil metode cetakData() pada objek test1
    } //akhir dari metode testCetakArray()
    
    @Test //metode untuk mengetes program pada file 
    public void testSequential(){ //membuat metode testSequential()
        double[] data = {5,4,1,10,21,15,13}; //membuat isi data array data bertipe double
        MyLarik test = new MyLarik(data); //membuat objek test pada class Mylarik
        assertEquals(0,test.sequentialSearch(5)); //mengecek apakah ada angka 5 pada indeks 0
        assertEquals(-1,test.sequentialSearch(100)); //mengecek apakah ada angka 100 di indeks -1/tidak ada dalam array
        
        double[] data1 = {55,4,1,100,2,15,13}; //membuat isi data array data1 bertipe double
        MyLarik test1 = new MyLarik(data1); //membuat objek test1 pada class Mylarik
        assertEquals(1,test.sequentialSearch(4)); //mengecek apakah ada angka 4 pada indeks 0
        assertEquals(-1,test.sequentialSearch(20)); //mengecek apakah ada angka 20 di indeks -1/tidak ada dalam array
    } //akhir dari metode testSequential()
    
    @Test //metode untuk mengetes program pada file 
    public void testBinary(){ //membuat metode testBinary()
        double[] data = {5,4,1,10,21,15,13}; //membuat isi data array data bertipe double
        Arrays.sort(data); //mengurutkan data dalam array 
        MyLarik test = new MyLarik(data); //membuat objek test pada class Mylarik
        assertEquals(0,test.binarySearch(1)); //mengecek apakah ada angka 1 pada indeks 0
        assertEquals(-1,test.binarySearch(100)); //mengecek apakah ada angka 100 di indeks -1/tidak ada dalam array
        
        double[] data1 = {55,4,1,100,2,15,13}; //membuat isi data array data1 bertipe double
        Arrays.sort(data1); //mengurutkan data dalam array
        MyLarik test1 = new MyLarik(data1); //membuat objek test1 pada class Mylarik
        assertEquals(0,test.binarySearch(1)); //mengecek apakah ada angka 1 pada indeks 0, dengan binary search
        assertEquals(-1,test.binarySearch(20)); //mengecek apakah ada angka 20 di indeks -1/tidak ada dalam array, dengan binary search
    } //akhir dari metode testBinary()
    
    @Test //metode untuk mengetes program pada file 
    public void testInterpolation(){ //membuat metode testInterpolation()
        double[] data = {5,4,1,10,21,15,13}; //membuat isi data array data bertipe double
        Arrays.sort(data); //mengurutkan data dalam array 
        MyLarik test = new MyLarik(data); //membuat objek test1 pada class Mylarik
        assertEquals(0,test.interpolationSearch(1)); //mengecek apakah ada angka 1 pada indeks 0
        assertEquals(-1,test.interpolationSearch(100)); //mengecek apakah ada angka 100 di indeks -1/tidak ada dalam array
        
        double[] data1 = {55,4,1,100,2,15,13}; //membuat isi data array data1 bertipe double
        Arrays.sort(data1); //mengurutkan data dalam array 
        MyLarik test1 = new MyLarik(data1); //membuat objek test1 pada class Mylarik
        assertEquals(0,test.interpolationSearch(1)); //mengecek apakah ada angka 1 pada indeks 0
        assertEquals(-1,test.interpolationSearch(20)); //mengecek apakah ada angka 20 di indeks -1/tidak ada dalam array
    } //akhir dari metode testInterpolation()
} //akhir dari class SearchingTest 
