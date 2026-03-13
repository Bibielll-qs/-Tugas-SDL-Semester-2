package com.test; //menyimpan file ke pckage com.test

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; 
//mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.*; ///mengimport isi semua kelas com.sdl

public class Rekursif2Test { //deklarasi kelas Rekursif2Test
    
    public Rekursif2Test() { //constructor Rekursif2Test()
    } //akhir constructor Rekursif2Test()
    
    @Test //metode untuk mengetes program pada file 
    public void test1(){ //membuat metode test1
        //test fungsi paijo
        int hasil = Rekursif.paijo(3); //deklarasi & simpan data metode paijo() ke hasil
        System.out.println("hasil ="+hasil); //mencetak hasil
        assertEquals(21,Rekursif.paijo(3)); //mengecek hasil perhitungan metode paijo() deret 3 adalah 21
    } //akhir dari metode test1
    
    @Test //metode untuk mengetes program pada file 
    public void test2(){ //membuat metode test2()
        // test fungsi upAndDown
        Rekursif.upAndDown(3); //mencetak hasil pperhitungan pada metode upAndDown() yakni 3
    } //akhir dari metode test2()
    
} //akhir dari kelas Rekursif2Test
