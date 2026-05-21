package com.list.test; //menyimpan file ke package com.list.test

import com.sdl.list.*; //mengimport isi dari package com.sdl.list
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test
/**
 *
 * @author user
 */
public class ListTest { //deklarasi class Listtest
    
    /**
     * constructor default
     */
    public ListTest() {
    }
    
    @BeforeEach //anotasi dalam JUnit5, menandai sebuah metode dijalankan sebelum setiap metode pengujian
    public void setUp() {
    }
    
    @Test //metode untuk mengetes program pada file
    public void test1(){ //method test1
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(0,list.getSize()); //mengecek apakah ukuran list berukuran 0
    }
    
    @Test //metode untuk mengetes program pada file
    public void test2(){ //method test2
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(0,list.getSize()); //mengecek apakah ukuran list berukuran 0
        list.addFirst(node1); //memasukkan node1 ke urutan pertama pada list
        assertEquals(1,list.getSize()); //mengecek list berukuran 1
        assertEquals(false,list.isEmpty()); //mengecek apakah data objek list ada isi datanya, false jika tidak kosong
    }

    @Test //metode untuk mengetes program pada file
    public void test3(){ //method test3
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(0,list.getSize()); //mengecek apakah ukuran list berukuran 0
        list.addFirst(node1); //memasukkan node1 ke urutan pertama pada list
        assertEquals(1,list.getSize()); //mengecek list berukuran 1
        assertEquals("A = 4",list.toString()); //mengecek "A =4" ada pada list pada pemanggilan method toString()
    }

    @Test //metode untuk mengetes program pada file
    public void test4(){ //method test4
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(0,list.getSize()); //mengecek apakah ukuran list berukuran 0
        list.addFirst(node1); //memasukkan node1 ke urutan pertama pada list
        assertEquals(1,list.getSize()); //mengecek list berukuran 1
        assertEquals("A = 4",list.toString()); //mengecek "A =4" ada pada list pada pemanggilan method toString()
        
        list.addLast(node4); //memasukkan node4 ke urutan terakhir pada list
        assertEquals(2,list.getSize()); //mengecek apakah list berukuran 2     
    }

    @Test //metode untuk mengetes program pada file
    public void test5(){ //method test5
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(0,list.getSize()); //mengecek apakah ukuran list berukuran 0
        list.addFirst(node1); //memasukkan node1 ke urutan pertama pada list
        assertEquals(1,list.getSize()); //mengecek list berukuran 1
        assertEquals("A = 4",list.toString()); //mengecek "A =4" ada pada list pada pemanggilan method toString()
        
        list.addLast(node4); //memasukkan node4 ke urutan terakhir pada list
        assertEquals(2,list.getSize()); //mengecek apakah list berukuran 2     
        
        ListNode node10 = list.getFirst(); //membuat objek node10, menyimpan data node pertama
        assertEquals("A = 4",node10.getData().toString()); //mengecek apakah "a = 4" pada data node10 pada pemanggilan method toString()
    }

    @Test //metode untuk mengetes program pada file
    public void test6(){ //method test6
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(0,list.getSize()); //mengecek apakah ukuran list berukuran 0
        list.addFirst(node1); //memasukkan node1 ke urutan pertama pada list
        assertEquals(1,list.getSize()); //mengecek list berukuran 1
        assertEquals("A = 4",list.toString()); //mengecek "A =4" ada pada list pada pemanggilan method toString()
        
        list.addLast(node4); //memasukkan node4 ke urutan terakhir pada list
        assertEquals(2,list.getSize()); //mengecek apakah list berukuran 2     
        
        ListNode node40 = list.deleteLast(); //buat objek node40, menghapus list urutan terakhir dimasukkan
        assertEquals("D = 1",node40.getData().toString()); //mengecek apakah "D = 1" pada data node40 pada pemanggilan method toString()
        assertEquals(1,list.getSize()); //mengecek apakah list berukuran 1 sekarang
    }

    @Test //metode untuk mengetes program pada file
    public void test7(){ //method test7
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(0,list.getSize()); //mengecek apakah ukuran list berukuran 0
        list.addFirst(node1); //memasukkan node1 ke urutan pertama pada list
        assertEquals(1,list.getSize()); //mengecek list berukuran 1
        assertEquals("A = 4",list.toString()); //mengecek "A =4" ada pada list pada pemanggilan method toString()
        
        list.addLast(node4); //memasukkan node4 ke urutan terakhir pada list
        assertEquals(2,list.getSize()); //mengecek apakah list berukuran 2 
        
        ListNode node40 = list.deleteLast(); //buat objek node40, menghapus list urutan terakhir dimasukkan
        assertEquals("D = 1",node40.getData().toString()); //mengecek apakah ada "D = 1" pada data node40 pada pemanggilan method toString()
        assertEquals(1,list.getSize()); //mengecek apakah list berukuran 1 sekarang
        
        ListNode node10 = list.deleteFirst(); //buat objek node10, menghapus list urutan pertama dimasukkan
        assertEquals("A = 4",node10.getData().toString()); //mengecek apakah ada "A = 4" pada data node10  pada pemanggilan method toString()
        assertEquals(true,list.isEmpty()); //mengecek apakah data objek list tidak ada isinya, true jika benar kosong
    }
    
    @Test //metode untuk mengetes program pada file
    public void test8(){ //method test8
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(true,list.isEmpty()); //mengecek apakah data objek list tidak ada isinya, true jika benar kosong
        
        //memasukkan data node ke list
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);

        assertEquals(false,list.isEmpty()); //mengecek apakah data objek list ada isi datanya, false jika tidak kosong
        assertEquals(4,list.getSize()); //mengecek apakah list berukuran 4
        
        ListNode first = list.deleteFirst(); //buat objek first, menghapus list urutan pertama dimasukkan
        assertEquals("D = 1",first.getData().toString()); //mengecek "D = 1" ada pada data first pada pemanggilan method toString()
    }
    
    @Test //metode untuk mengetes program pada file
    public void test9(){ //method test9
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(true,list.isEmpty()); //mengecek apakah data objek list tidak ada isinya, true jika benar kosong
        
        //memasukkan data node ke list
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);

        assertEquals(false,list.isEmpty()); //mengecek apakah data objek list ada isi datanya, false jika tidak kosong
        assertEquals(4,list.getSize()); //mengecek apakah list berukuran 4
        
        ListNode last = list.deleteLast(); //buat objek last, menghapus list urutan terakhir diambil
        assertEquals("A = 4",last.getData().toString()); //mengecek apakah "A = 4" ada pada data list pada pemanggil data toString()
    }

    @Test //metode untuk mengetes program pada file
    public void test10(){ //method test10
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        List list = new List(); //buat objek list
        assertEquals(true,list.isEmpty()); //mengecek apakah data objek list tidak ada isinya, true jika benar kosong
        
        //memasukkan data node ke list
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);

        assertEquals(10,list.getSumOfTotalNumbers()); //mengecek apakah nilai 10 ada pada list pada pemanggilan method getSumOfTotalNumbers()    
    }
    
} //akhir dari class ListTest
