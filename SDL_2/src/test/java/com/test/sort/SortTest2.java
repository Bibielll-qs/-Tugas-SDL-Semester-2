package com.test.sort; //package com.test.sort

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.*; //mengimport semua isi dari package com.sdl

public class SortTest2 { //deklarasi class SortTest2
    
    public SortTest2() { //metode constructor default SortTest2
    }
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test  //metode untuk mengetes program pada file 
    public void testSort(){  //metode testSort
        double[] data = {5,4,1,10,21,15,13}; //deklarasi array data & mengisi elemen-nya bertipe double
        int maxIndeks = MyLarik.getMaxData(data); //variabel maxIndeks berisi metode getMaxData untuk mencari indeks data maksimal
        assertEquals(4,maxIndeks); //mengecek apakah indeks 4 pada hasil maxIndeks adalah data maksimal
    } //akhir dari metode testSort
} //akhir dari class SortTest2
