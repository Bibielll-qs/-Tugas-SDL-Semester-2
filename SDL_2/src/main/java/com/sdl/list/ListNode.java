package com.sdl.list; //menyimpan file ke package  com.sdl.list

import com.sdl.latihan.MyItem; //mengimport isi dari class MyItem

/**
 *
 * @author user
 */
public class ListNode { //deklarasi class ListNode
    private MyItem data; //atribut data bertipe class MyItem untuk item dan numbers
    private ListNode next; //atribut  next bertipe class ListNode

    /**
     * Konstruktor default
     */
    public ListNode() { 
    }

    /**
     * Konstruktor
     * @param data
     * @param next 
     */
    public ListNode(MyItem data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Konstruktor
     * @param item
     * @param numbers 
     */
    public ListNode(String item, int numbers){
        this.data = new MyItem();
        this.data.setItem(item);
        this.data.setNumbers(numbers);
        this.next=null;
    }
    /**
     * method getter
     * @return the data
     */
    public MyItem getData() {
        return data;
    }

    /**
     * method setter
     * @param data the data to set
     */
    public void setData(MyItem data) {
        this.data = data;
    }

    /**
     * method getter
     * @return the next
     */
    public ListNode getNext() {
        return next;
    }

    /**
     * method setter
     * @param next the next to set
     */
    public void setNext(ListNode next) {
        this.next = next;
    }
    
} //akhir dari class ListNode
