/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.penjualan;

/**
 *
 * @author LENOVO
 */
public class ListBarang {
    private BarangNode first;
    private BarangNode last;

    public BarangNode getFirst() {
        return first;
    }

    public void setFirst(BarangNode first) {
        this.first = first;
    }

    public BarangNode getLast() {
        return last;
    }

    public void setLast(BarangNode last) {
        this.last = last;
    }
    
    public void add(BarangNode node){
        
    }
    public BarangNode delete(){
        return null;
    }
    public boolean isEmpty(){
        return false;
    }
}
