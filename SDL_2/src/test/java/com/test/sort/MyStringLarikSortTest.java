package com.test.sort; //menyimpan file ke package com.test.sort

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.MyStringLarik; //mengimport isi dari class MyStringLarik
import com.sdl.*; //mengimport semua isi dari package com.sdl
/**
 *
 * @author LENOVO
 */
public class MyStringLarikSortTest { //deklarasi class MyStringLarikSortTest 
    public MyStringLarikSortTest(){ //metode constructor default MyStringLarikSortTest    
    } //akhir dari metode constructor default MyStringLarikSortTest    
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test  //metode untuk mengetes program pada file 
    public void testSort(){ //metode testSort()
        String[] data = {"Icha", "Noah", "Theo", "Geby", "Bila"}; //deklarasi array data & mengisi elemen nya bertipe string
        MyStringLarik test = new MyStringLarik(data); //membuat objek test dengan parameter data pada class MyStringLarik
        System.out.println("---Bubble Sort---");
        String[] data1 = data.clone(); //untuk mengcopi array data
        test.bubbleSort(data1, data1.length); //memanggil metode sorting bubbleSort untuk mengurutkan data pada objek test  
        System.out.println();
        
        System.out.println("---Selection Sort---");
        String[] data2 = data.clone();
        test.selectionSort(data2, data2.length); //memanggil metode sorting selectionSort untuk mengurutkan data pada objek test  
        System.out.println();
        
        System.out.println("---Insertion Sort---");
        String[] data3 = data.clone();
        test.insertionSort(data3, data3.length); //memanggil metode sorting insertionSort untuk mengurutkan data pada objek test  
    } //akhir metode testSort()
} //akhir dari class MyStringLarikSortTest
