package com.test; //menyimpan file ke package com.test

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test
import com.sdl.*; //mengimport semua isi dari class com.sdl
import java.util.Arrays; //memanggil fungsi arrays untuk mengurutkan array

public class Searching2Test { //deklarasi class Searching2Test
    
    public Searching2Test() { //membuat metode constructor default Searching2Test()
    } //akhir dari metode constructor default Searching2Test()
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian
    public void setUp() { //membuat metode setUp()
    } //akhir dari metode setUp()
    
    @Test //metode untuk mengetes program pada file 
    public void testSequential(){ //membuat metode testSequential()
        String[] data ={"adi","puspa","budi","dina","susi"}; //membuat isi data array data bertipe string
        MyStringLarik test = new MyStringLarik(data); //membuat objek test pada metode MyStringLarik
        assertEquals(0,test.sequentialSearch("adi")); //mengecek apakah "adi" ada di indeks 0 
        assertEquals(-1,test.sequentialSearch("joni")); //mengecek apakah "joni" di indeks -1/tidak ada dalam array
    } //akhir dari metode testSequential()
    
    @Test //metode untuk mengetes program pada file 
    public void testBinary(){ //membuat metode testBinary()
        String[] data ={"adi","puspa","budi","dina","susi"}; //membuat isi data array data bertipe string
        Arrays.sort(data); //mengurutkan data dalam array secara alfabet
        MyStringLarik test = new MyStringLarik(data); //membuat objek test pada metode MyStringLarik
        assertEquals(0,test.binarySearch("adi")); //mengecek apakah "adi" ada di indeks 0 
        assertEquals(-1,test.binarySearch("joni")); //mengecek apakah "joni" di indeks -1/tidak ada dalam array
    } //akhir dari metode testBinary()
    
} //akhir dair class Searching2Test
