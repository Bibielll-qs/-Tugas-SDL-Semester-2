package com.test; //menyimpan file ke package com.test

import com.sdl.MyStringLarik; //mengimport isi dari class MyStringLarik;
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test

public class Searching3Test { //deklarasi class Searching3Test 
    
    public Searching3Test() { //membuat metode constructor default Searching3Test()
    } //akhir dari metode  constructor default Searching3Test()
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() { //membuat metode setUp()
    } //akhir dari metode setUp()
    
    @Test //metode untuk mengetes program pada file 
    public void testIsExist(){ //membuat metode testIsExist()
        String[] data ={"adi","puspa","budi","dina","susi"}; //membuat isi array data bertipe string 
        MyStringLarik test = new MyStringLarik(data); //membuat objek test pada class MyStringlarik
        assertEquals(Boolean.TRUE,test.isStringExist("adi")); //mengecek apakah benar ada "adi" dalam array data
        assertEquals(Boolean.FALSE,test.isStringExist("joni")); //mengecek apakah salah ada "joni" dalam array data
    } //akhir dari metode testIsExist()
    
} //akhir dari class Searching3Test
