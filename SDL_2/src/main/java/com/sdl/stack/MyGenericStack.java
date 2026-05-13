/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.stack; //menyimpan file ke package com.sdl.stack

import com.sdl.latihan.MyItem; //mengimport isi dari package com.sdl.latihan.MyItem

/**
 *
 * @author puspa
 */
public class MyGenericStack<T> {
    private MyGenericNode<T> last;
    private int size;

    /**
     * Konstruktor
     */
    public MyGenericStack() {
    }

    /**
     * Konstruktor
     * @param last
     * @param size 
     */
    public MyGenericStack(MyGenericNode<T> last, int size) {
        this.last = last;
        this.size = size;
    }

    /**
     * @return the last
     */
    public MyGenericNode<T> getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(MyGenericNode<T> last) {
        this.last = last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Fungsi memeriksa stack kosong atau tidak
     * @return 
     */
    public boolean isEmpty(){
        if (this.last==null)
            return true;
        else
            return false;
    }
    
        /**
     * Fungsi push ke stack. setiap push, node last menjadi paling awal
     * @param node 
     */
    public void push(MyGenericNode<T> node){
        // cek stack kosong
        if (isEmpty()){
            last=node;
        } else{
            //stack tidak kosong
            node.setNext(this.last);
            this.last = node;
        }
        this.size ++;
    }
    
    
    /**
     * Fungsi pop, ambil node dari stack.
     * @return 
     */
    public MyGenericNode<T> pop(){
        // cek stack kosong
        if (last==null){
            return null;
        } else {
            //stack tidak kosong
            MyGenericNode result = this.last;
            this.last = result.getNext();
            result.setNext(null);
            this.size --;
            return result;
        }
    }
    public int getTotalNumbers(){
        int total = 0;
        if (isEmpty()) {
            return 0;
        }
        else{
        MyGenericNode<T> result = this.last;
        //iterasi pada stack
        while(result != null){
            MyItem temp = (MyItem)result.getData();
            total += temp.getNumbers();
            result = result.getNext();
        }
        return total;
        }
    }
    public String getTotalString(){
        String total = "";
        MyGenericNode<T> result = this.last;
        //iterasi pada stack
        while(result != null){
            MyItem temp = (MyItem)result.getData();
            total += temp.getItem();
            result = result.getNext();
        }
     
        return total;
    }
    public static void main(String[] args) {
        // buat item
        MyItem item1 = new MyItem("A",4);
        // buat node
        MyGenericNode<MyItem> node1 = new MyGenericNode<MyItem>(item1,null);
        // test node
        String result = node1.getData().toString();
        System.out.println(result);
        
        //push ke stack generic
        MyItem item2 = new MyItem("B",3);
        MyItem item3 = new MyItem("C",2);
        MyItem item4 = new MyItem("D",1);
        MyGenericNode<MyItem> node2 = new MyGenericNode<MyItem>(item2,null);
        MyGenericNode<MyItem> node3 = new MyGenericNode<MyItem>(item3,null);
        MyGenericNode<MyItem> node4 = new MyGenericNode<MyItem>(item4,null);
        
        MyGenericStack<MyItem> stack = new MyGenericStack<>();
        System.out.println("isEmpty = "+stack.isEmpty());
        
        stack.push(node1);
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);
        System.out.println("isEmpty = "+stack.isEmpty());
        System.out.println(stack.getSize());
        MyGenericNode<MyItem> node10 = stack.pop();
        System.out.println(node10.getData().toString());
        System.out.println("Jumlah total stack = "+stack.getTotalNumbers());
        System.out.println("Jumlah total string = "+stack.getTotalString());
    }
}
