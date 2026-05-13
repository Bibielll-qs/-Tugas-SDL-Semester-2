package com.stack.test; //menyimpan file ke package test

import com.sdl.stack.MyNode; //mengimport isi dari class MyNode
import com.sdl.stack.MyStack; //mengimport isi dari class MyStack
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test

public class MyStackTest { //deklarasi class MyStackTest 
    
    public MyStackTest() { //method constructor default MyStackTest()
    } //akhir dari method constructor default
    
    @BeforeEach //anotasi dalam JUnit5, menandai sebuah metode dijalankan sebelum setiap metode pengujian
    public void setUp() {
    }
    
    @Test //metode untuk mengetes program pada file
    public void test(){ //method test()
        MyStack stack = new MyStack(); //membuat objek stack pada class MyStack
        //membuat objek pada class MyNode & mengisi nilai argumentnya
        MyNode node1 = new MyNode(null,"A",4); 
        MyNode node2 = new MyNode(null,"B",3);
        MyNode node3 = new MyNode(null,"C",2);
        MyNode node4 = new MyNode(null,"D",1);
        
        assertEquals(true,stack.isEmpty()); ///mengecek apakah data objek stack kosong, true jika kosong
        assertEquals(0,stack.getSize()); //mengecek apakah data objek stack berisi 0 data/tidak ada data
    } //akhir method test
    
    @Test //metode untuk mengetes program pada file
    public void test1(){ //method test1()
        MyStack stack = new MyStack(); //membuat objek stack pada class MyStack
        //membuat objek pada class MyNode & mengisi nilai argumentnya
        MyNode node1 = new MyNode(null,"A",4);
        MyNode node2 = new MyNode(null,"B",3);
        MyNode node3 = new MyNode(null,"C",2);
        MyNode node4 = new MyNode(null,"D",1);
        
        // test stack isi satu node
        stack.push(node1); //memasukkan(push) data node1 pada stack
        MyNode node5 = stack.pop(); //membuat objek node5 untuk mengambil/mengeluarkan data pada stack
        assertEquals("A = 4",node5.toString()); //mengecek apakah data objek stack pada method toString() "A = 4"
        MyNode node6 = stack.pop(); //membuat objek node6 untuk mengambil data pada stack 
        assertEquals(null,node6); //mengecek apakah data objek stack node6 yang diambil/dikeluarkan bernilai null
        
        // test stack diisi banyak node
        assertEquals(true,stack.isEmpty()); //mengecek apakah data objek stack kosong, true jika kosong
        assertEquals(0,stack.getSize()); //mengecek apakah data objek stack berisi 0 data/tidak ada data 
        stack.push(node1); // push stack
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);
        assertEquals(4,stack.getSize()); //mengecek apakah data objek stack isinya 4
        assertEquals(false,stack.isEmpty()); //mengecek apakah data objek stack ada isi datanya, false jika tidak kosong
        node5 = stack.pop(); // pop stack
        assertEquals("D = 1",node5.toString()); //mengecek apakah data objek stack node5 pada method toString() "D = 1"
        
    } //akhir metode test1
} //akhir dari class MyStackTest
