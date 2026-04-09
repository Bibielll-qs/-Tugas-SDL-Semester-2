package com.test.sort; //package com.test.sort

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.*; //mengimport semua isi dari package com.sdl

public class SortTest { //deklarasi class SortTest
    
    public SortTest() { //metode constructor default SortTest
    } //akhir dari metode constructor default SortTest
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test  //metode untuk mengetes program pada file 
    public void testSort1(){ //metode testSort1()
        double[] data = {5,4,1,10,21,15,13}; //deklarasi array data & mengisi elemen-nya bertipe double 
        double[] data1 = MyLarik.getChangeData(data,0,2); 
        //array data1 berisi metode getChangeData untuk menukar posisi data indeks 0 dan indeks 2
        assertEquals(1.0,data1[0]); //mengecek apakah ada angka 1.0 pada indeks 0 dalam array data1 
    } //akhir dari metode testSort1()
    
} //akhir dari class SortTest


