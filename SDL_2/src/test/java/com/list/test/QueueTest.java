package com.list.test; //menyimpan file ke package com.list.test

import com.sdl.list.ListNode; //mengimport isi dari package com.sdl.list.ListNode
import com.sdl.queue.Queue; //mengimport isi dari package com.sdl.queue.Queue
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test

/**
 *
 * @author user
 */
public class QueueTest { //deklarasi class QueueTest
    
    /**
     * constructor default
     */
    public QueueTest() {
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
        
        Queue queue = new Queue(); //buat objek queue
        assertEquals(true,queue.isEmpty()); //mengecek apakah data objek queue tidak ada isinya, true jika benar kosong
        queue.enqueue(node1); //menambahkan data node1 ke queue
        assertEquals(false,queue.isEmpty()); //mengecek apakah data objek queue ada isi datanya, false jika tidak kosong
        assertEquals(1,queue.getSize()); //mengecek apakah queue berukuran 1
    }
    
    @Test //metode untuk mengetes program pada file
    public void test2(){ //method test2
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue(); //buat objek queue
        assertEquals(true,queue.isEmpty()); //mengecek apakah data objek queue tidak ada isinya, true jika benar kosong
        queue.enqueue(node1); //menambahkan data node1 ke queue
        assertEquals(false,queue.isEmpty()); //mengecek apakah data objek queue ada isi datanya, false jika tidak kosong
        assertEquals(1,queue.getSize()); //mengecek apakah queue berukuran 1
        
        //menambahkan node ke queue
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize()); //mengecek apakah queue berukuran 4
        
    }

    @Test //metode untuk mengetes program pada file
    public void test3(){ //method test3
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue(); //buat objek queue
        assertEquals(true,queue.isEmpty()); //mengecek apakah data objek queue tidak ada isinya, true jika benar kosong
        queue.enqueue(node1); //menambahkan data node1 ke queue
        assertEquals(false,queue.isEmpty()); //mengecek apakah data objek queue ada isi datanya, false jika tidak kosong
        assertEquals(1,queue.getSize()); //mengecek apakah queue berukuran 1
        
        //menambahkan dat node ke queue
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize());  //mengecek apakah queue berukuran 4
        
        ListNode node10 = queue.dequeue(); //buat objek node10, mengeluarkan queue yang pertama ditambahkan
        assertEquals("A = 4",node10.getData().toString()); //mengecek apakah "a = 4" ada pada data node10 pada pemanggilan method toString()
    }

    @Test //metode untuk mengetes program pada file
    public void test4(){ //method test4
        //buat node
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue(); //buat objek queue
        assertEquals(true,queue.isEmpty()); //mengecek apakah data objek queue tidak ada isinya, true jika benar kosong
        queue.enqueue(node1); //menambahkan data node1 ke queue
        assertEquals(false,queue.isEmpty()); //mengecek apakah data objek queue ada isi datanya, false jika tidak kosong
        assertEquals(1,queue.getSize()); //mengecek apakah queue berukuran 1
        
        //menambahkan data node ke queue
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize()); //mengecek apakah queue berukuran 4
        
        ListNode node10 = queue.dequeue(); //buat objek node10, mengeluarkan queue yang pertama ditambahkan
        assertEquals("A = 4",node10.getData().toString()); //mengecek apakah "a = 4" ada pada data node10 pada pemanggilan method toString()
        
        assertEquals(6,queue.getSumOfTotalNumbers()); //mengecek apakah nilai 6 ada pada queue pada pemanggilan method getSumOfTotalNumber()
    }

} //akhir dari class QueueTest
