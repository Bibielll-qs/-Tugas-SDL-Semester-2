package com.stack.test; //menyimpan file ke package com.stack.test

import com.sdl.latihan.MyItem; //mengimport isi dari package com.sdl.latihan.MyItem
import com.sdl.stack.MyGenericNode; //mengimport isi dari class MyGenericNode
import com.sdl.stack.MyGenericStack; //mengimport isi dari class MyGenericStack
import com.sdl.stack.MyNode; //mengimport isi dari class MyNode
import com.sdl.stack.MyStack; //mengimport isi adri class MyStack
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test

/**
 *
 * @author puspa
 */
public class MyGenericStackTest {
    
    public MyGenericStackTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void nodeTest(){
        // buat item
        MyItem item1 = new MyItem("A",4);
        // buat node
        MyGenericNode<MyItem> node1 = new MyGenericNode<MyItem>(item1,null);
        // test node
        //String result = node1.getData().toString();
        assertEquals("A = 4",node1.getData().toString());
    }
    
//    @Test
//    public void test(){
//        // buat item
//        MyItem item1 = new MyItem("A",4);
//        MyItem item2 = new MyItem("B",3);
//        MyItem item3 = new MyItem("C",2);
//        MyItem item4 = new MyItem("D",1);
//        // buat node
//        MyGenericNode<MyItem> node1 = new MyGenericNode<MyItem>(item1,null);
//        MyGenericNode<MyItem> node2 = new MyGenericNode<MyItem>(item2,null);
//        MyGenericNode<MyItem> node3 = new MyGenericNode<MyItem>(item3,null);
//        MyGenericNode<MyItem> node4 = new MyGenericNode<MyItem>(item4,null);
//        
//        // buat stack
//        MyGenericStack<MyGenericNode<MyItem>> stack = new MyGenericStack<MyGenericNode<MyItem>>();
//        assertEquals(true,stack.isEmpty());
//        assertEquals(0,stack.getSize());
//    }
//    @Test
//    public void test1(){
//        // buat item
//        MyItem item1 = new MyItem("A",4);
//        MyItem item2 = new MyItem("B",3);
//        MyItem item3 = new MyItem("C",2);
//        MyItem item4 = new MyItem("D",1);
//        // buat node
//        MyGenericNode<MyItem> node1 = new MyGenericNode<MyItem>(item1,null);
//        MyGenericNode<MyItem> node2 = new MyGenericNode<MyItem>(item2,null);
//        MyGenericNode<MyItem> node3 = new MyGenericNode<MyItem>(item3,null);
//        MyGenericNode<MyItem> node4 = new MyGenericNode<MyItem>(item4,null);
//        
//        // buat stack
//        MyGenericStack<MyGenericNode<MyItem>> stack = new MyGenericStack<MyGenericNode<MyItem>>();
//        // tambah node
//        stack.push(node1);
//        assertEquals(false,stack.isEmpty());
//        assertEquals(1,stack.getSize());
//    }
//    
//    @Test
//    public void test2(){
//        // buat item
//        MyItem item1 = new MyItem("A",4);
//        MyItem item2 = new MyItem("B",3);
//        MyItem item3 = new MyItem("C",2);
//        MyItem item4 = new MyItem("D",1);
//        // buat node
//        MyGenericNode<MyItem> node1 = new MyGenericNode<MyItem>(item1,null);
//        MyGenericNode<MyItem> node2 = new MyGenericNode<MyItem>(item2,null);
//        MyGenericNode<MyItem> node3 = new MyGenericNode<MyItem>(item3,null);
//        MyGenericNode<MyItem> node4 = new MyGenericNode<MyItem>(item4,null);
//        
//        // buat stack
//        MyGenericStack<MyGenericNode<MyItem>> stack = new MyGenericStack<MyGenericNode<MyItem>>();
//        // tambah/push node
//        stack.push(node1);
//        assertEquals(false,stack.isEmpty());
//        assertEquals(1,stack.getSize());
//        // pop node
//        MyGenericNode<MyItem> node = stack.pop();
//        String nodeString = node.getData().toString();
//        assertEquals("A = 4",nodeString);        
//    }
} //akhir dari class MyGenericStackTest
