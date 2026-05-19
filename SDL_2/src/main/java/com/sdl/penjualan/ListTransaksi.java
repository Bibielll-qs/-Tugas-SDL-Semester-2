/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.penjualan;

/**
 *
 * @author LENOVO
 */
public class ListTransaksi {
    private TransaksiNode first;
    private TransaksiNode last;
    private ListBarang listBarang;

    public TransaksiNode getFirst() {
        return first;
    }

    public void setFirst(TransaksiNode first) {
        this.first = first;
    }

    public TransaksiNode getLast() {
        return last;
    }

    public void setLast(TransaksiNode last) {
        this.last = last;
    }

    public ListBarang getListBarang() {
        return listBarang;
    }

    public void setListBarang(ListBarang listBarang) {
        this.listBarang = listBarang;
    }
    
    public void add(TransaksiNode node){
        
    }
    public TransaksiNode delete(){
        return null;
    }
    public boolean isEmpty(){
        return false;
    }
    public double getTotalTransaksi(){
        return 0;
    }
}
