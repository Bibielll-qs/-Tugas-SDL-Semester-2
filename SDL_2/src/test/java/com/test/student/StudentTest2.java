package com.test.student; //menyimpan file ke package com.test.student

import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test 
import com.sdl.Student; //mengimport isi dari class Student

public class StudentTest2 { //deklarasi class StudentTest2
    
    public StudentTest2() { //metode constructor default StudentTest2()
    }
    
    @BeforeEach //anotasi dalam JUnit 5, menandai sebuah metode dijalankan sebelum setiap metode pengujian 
    public void setUp() {
    }
    
    @Test  //metode untuk mengetes program pada file 
    public void testStudent(){ //metode testStudent()
        Student test = new Student("007","James Bond"); //membuat objek class test & mengisi data parameternya
        System.out.println("Data = "+test); //
    } //akhir dari metode testStudent()
} //akhir dari class StudentTest2
