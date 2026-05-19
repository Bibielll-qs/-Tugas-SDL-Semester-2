package com.sdl.queue; //menyimpan file ke package com.sdl.queue

import com.sdl.list.List; //mengimport isi class List
import com.sdl.list.ListNode; //mengimport isi class ListNode

/**
 *
 * @author user
 */
public class Queue { //deklarasi class Queue
    private List antrian;

    /**
     * Konstruktor
     */
    public Queue() {
        this.antrian = new List();
    }

    /**
     * Konstruktor
     * @param antrian 
     */
    public Queue(List antrian) {
        this.antrian = antrian;
    }
    
    /**
     * Fungsi menambah antrian
     * @param node 
     */
    public void enqueue(ListNode node){
        antrian.addFirst(node);
    }
    
    /**
     * Fungsi untuk mengeluarkan antrian
     * @return 
     */
    public ListNode dequeue(){
        return antrian.deleteLast();
    }
    
    /**
     * Fungsi untuk memeriksa antrian kosong
     * @return 
     */
    public boolean isEmpty(){
         return antrian.isEmpty();
    }
    
    /**
     * Fungsi untuk menghitung jumlah node
     * @return 
     */
    public int getSize(){
       return antrian.getSize();
    }
    
    /**
     * Fungsi penghitung jumlah atribut numbers
     * @return 
     */
    public int getSumOfTotalNumbers(){
        return antrian.getSumOfTotalNumbers();
    }
}
