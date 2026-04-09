package com.test.sort; //package com.test.sort

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.MyLarik; //mengimport isi dari class MyLarik

public class SortTest5 { //deklarasi class Sorttest5
    
    public SortTest5() { //metode constructor default SortTest5
    }
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test  //metode untuk mengetes program pada file 
    public void testSort(){ //metode testSort()
        double[] data = {5,4,1,10,21,15,13}; //deklarasi array data & mengisi elemen-nya tipe double
        MyLarik test = new MyLarik(data); //membuat objek test dengan parameter data pada class MyLarik
        test.insertionSort(data, data.length); //memanggil metode sorting insertionSort pada objek test
    } //akhir dari metode testSort()
} //akhir dari class SortTest5
