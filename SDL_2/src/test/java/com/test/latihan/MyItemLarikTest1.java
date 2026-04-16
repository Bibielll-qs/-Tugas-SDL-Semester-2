package com.test.latihan; //menyimpan file ke package com.test.latihan

import com.sdl.latihan.MyItem; //mengimport isi dari class MyItem
import com.sdl.latihan.MyItemLarik; //mengimport isi dari class MyItemLarik
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 


public class MyItemLarikTest1 { //deklarasi class MyItemLarikTest1 
    
    public MyItemLarikTest1() { //metode constructor default MyItemLarikTest1()
    }
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test //metode untuk mengetes program pada file 
    public void test1(){
        // ini pengujian fungsi append
        // buat larik
        MyItemLarik test = new MyItemLarik(5);
        // buat obyek item
        MyItem item1 = new MyItem("Indomie",150);
        MyItem item2 = new MyItem("Mie Sedap",60);
        MyItem item3 = new MyItem("Indomie",200);
        MyItem item4 = new MyItem("Mie Sedap",120);
        MyItem item5 = new MyItem("Sarimi",20);
        // tambah item
        test.append(item1, 0);
        test.append(item2, 1);
        test.append(item3, 2);
        test.append(item4, 3);
        test.append(item5, 4);
        // buat data jumlahan pada item yang sama
        MyItemLarik testSum = test.getItemSum();
        testSum.itemSort(1);
        assertEquals("Sarimi",testSum.getData()[0].getItem()); //mengecek apakah ada "Sarimi" di indeks 0 setelah diurutkan berdasarkan angka
        assertEquals("Indomie",testSum.getData()[2].getItem()); //mengecek apakah ada "Indomie" di indeks 2 setelah diurutkan berdasarkan angka
        assertEquals(350,testSum.getData()[2].getNumbers()); //mengecek apakah ada angka 350 di indeks 2 setelah diurutkan berdasarkan angka
    } //akhir dari metode test1
} //akhir dari class MyItemLarikTest1
