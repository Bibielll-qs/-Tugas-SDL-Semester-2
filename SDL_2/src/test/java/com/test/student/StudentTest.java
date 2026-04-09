package com.test.student; //package com.test.student

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.*; //mengimport semua isi dari package com.sdl
import java.util.Arrays; //memanggil fungsi arrays untuk mengurutkan array

public class StudentTest { //deklarasi class StudentTest
    
    public StudentTest() { //metode conatructor default StudentTest
    }
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test  //metode untuk mengetes program pada file 
    public void testStudent(){ //metode testStudent
        //membuat objek pada class Student & mengisi data dalam parameternya bertipe string 
        Student test1 = new Student("10","Adi");
        Student test2 = new Student("11","David");
        Student test3 = new Student("12","Charlie");
        Student test4 = new Student("13","Farid");
        Student test5 = new Student("14","Indah");
        
        MyStudentLarik larik = new MyStudentLarik(5); //membuat objek larik pada class MyStudentlarik berukuran 5
        larik.append(0, test1); //memasukkan data test1 pada indeks 0
        larik.append(1, test2); //memasukkan data test2 pada indeks 1
        larik.append(2, test3); //memasukkan data test3 pada indeks 2
        larik.append(3, test4); //memasukkan data test4 pada indeks 3
        larik.append(4, test5); //memasukkan data test4 pada indeks 4
        
        
        int result = larik.search("Farid");
        assertEquals(3,result); //mengecek apakah result pada indeks 3 adalah "Farid"
        
        larik.nameSort(); //memanggil metode sorting nameSort untuk mengurutkan nama berdasarkan bubble sort
        larik.printData(); //memnaggil metode untuk mencetak data yang dihasilkan dari mengurutkan
        assertEquals("David",larik.getValue(2).getName()); //mengecek apakah ada nama "David" pada data ke 2
    } //akhir dari metode testStudent
} //akhir dari class StudentTest
