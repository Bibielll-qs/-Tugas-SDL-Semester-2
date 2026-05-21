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
    public void test1(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue();
        assertEquals(true,queue.isEmpty());
        queue.enqueue(node1);
        assertEquals(false,queue.isEmpty());
        assertEquals(1,queue.getSize());
    }
    
    @Test //metode untuk mengetes program pada file
    public void test2(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue();
        assertEquals(true,queue.isEmpty());
        queue.enqueue(node1);
        assertEquals(false,queue.isEmpty());
        assertEquals(1,queue.getSize());
        
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize());
        
    }

    @Test //metode untuk mengetes program pada file
    public void test3(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue();
        assertEquals(true,queue.isEmpty());
        queue.enqueue(node1);
        assertEquals(false,queue.isEmpty());
        assertEquals(1,queue.getSize());
        
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize());
        
        ListNode node10 = queue.dequeue();
        assertEquals("A = 4",node10.getData().toString());
    }

    @Test //metode untuk mengetes program pada file
    public void test4(){
        ListNode node1 = new ListNode("A",4);
        ListNode node2 = new ListNode("B",3);
        ListNode node3 = new ListNode("C",2);
        ListNode node4 = new ListNode("D",1);
        
        Queue queue = new Queue();
        assertEquals(true,queue.isEmpty());
        queue.enqueue(node1);
        assertEquals(false,queue.isEmpty());
        assertEquals(1,queue.getSize());
        
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        assertEquals(4,queue.getSize());
        
        ListNode node10 = queue.dequeue();
        assertEquals("A = 4",node10.getData().toString());
        
        assertEquals(6,queue.getSumOfTotalNumbers());
    }

} //akhir dari class QueueTest
