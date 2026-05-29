/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.Klinik;

/**
 *
 * @author LENOVO
 */
public class QueueAntrian {
   private ListPasien antrian;

    public QueueAntrian() {
    this.antrian = new ListPasien();
    }
   
    public QueueAntrian(ListPasien antrian) {
        this.antrian = antrian;
    }
   /**
     * Fungsi menambah antrian
     * @param node 
     */
    public void enqueue(PasienNode node){
        antrian.add(node);
    }
    
    /**
     * Fungsi untuk mengeluarkan antrian
     * @return 
     */
    public PasienNode dequeue(){
        return antrian.delete();
    }
    
    /**
     * Fungsi untuk memeriksa antrian kosong
     * @return 
     */
    public boolean isEmpty(){
         return antrian.isEmpty();
    }
    
   
}
