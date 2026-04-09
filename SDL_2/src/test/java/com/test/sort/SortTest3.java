package com.test.sort; //package com.test.sort

import com.sdl.MyLarik; //mengimpport isi dari class MyLarik
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 

public class SortTest3 { //deklarasi class SortTest3
    
    public SortTest3() { //metode constructor default SortTest3
    }
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test  //metode untuk mengetes program pada file 
    public void testSort(){ //metode testSort
        double[] data = {5,4,1,10,21,15,13}; //deklarasi array data & mengisi elemen-nya tipe double
        int maxIndeks = MyLarik.getMaxData(data,0,2); 
        //maxIndeks berisi metode getMaxData untuk mencari nilai maksimum pada rentan indeks 0 sampai indeks 2
        assertEquals(0,maxIndeks); //mengecek apakah indeks 0 adalah nilai maksimum pada rentan indeks 0 sampai indeks 2
    } //akhir dari metode testSort
} //akhir dari class SortTest3
