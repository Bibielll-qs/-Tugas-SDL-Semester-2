package com.test; //menyimpan file ke pckage com.test

import com.sdl.MyLarik; //mengimport isi kelas com.sdl.MyLarik
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; 
//mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 


public class RekursifMyLarikTest { //deklarasi kelas RekursifMyLarikTest
    
    public RekursifMyLarikTest() { //membuat metode constructor RekursifMyLarikTest()
    } //akhir dari metode constructor RekursifMyLarikTest()
    
    @Test //metode untuk mengetes program pada file 
    public void test1(){ //mwmbuat metode test1()
        MyLarik test = new MyLarik(5); 
        //membuat objek test pada kelas MyLarik dengan metode constructor & parameter
        
        //memasukkan nilai ke dalam indeks 
        test.append(0,1);
        test.append(1,2);
        test.append(2,3);
        test.append(3,4);
        test.append(4,5);
        assertEquals(15,test.getLoopSum(4)); 
        //mengecek apakah hasil penjumlahan deret fibonaci adalah 15 pada metode getRekursifSum(4) pada indeks 4
    } //akhir dari metode test1()
    
    @Test //metode untuk mengetes program pada file 
    public void test2(){ //membuat metode test2()
        MyLarik test = new MyLarik(5); 
        //membuat objek test pada kelas MyLarik dengan metode constructor & parameter
        
        //memasukkan nilai ke dalam indeks 
        test.append(0,1);
        test.append(1,2);
        test.append(2,3);
        test.append(3,4);
        test.append(4,5);
        assertEquals(15,test.getRekursifSum(4)); 
        //mengecek apakah hasil penjumlahan deret fibonaci adalah 15 pada metode getRekursifSum(4) pada indeks 4
    } //akhir dari metode test2()
} //akhir dari kelas RekursifMyLarikTest
