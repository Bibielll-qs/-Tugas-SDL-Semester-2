package com.test.sort; //package com.test.sort

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.MyLarik; //mengimport isi dari class MyLarik

public class SortTest4 { //deklarasi class SortTest4
    
    public SortTest4() { //metode constructor default SortTest4
    }
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    @Test  //metode untuk mengetes program pada file 
    public void testSort(){  //metode testSort()
        double[] data = {5,4,1,10,21,15,13}; //deklarasiarray data & mengisi elemen-nya tipe double
        MyLarik test = new MyLarik(data); //membuat objek test dengan parameter data pada class myLarik 
        test.bubbleSort(data, 1); //memanggil metode sorting bubbleSort pada objek test
    } //akhir dari metode testSort()
} //akhir dari class SortTest4
