/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.penjualan;

/**
 *
 * @author LENOVO
 */
public class BarangNode {
    private Barang data;
    private BarangNode next;

    public BarangNode(Barang data, BarangNode next) {
        this.data = data;
        this.next = next;
    }
    

    public Barang getData() {
        return data;
    }

    public void setData(Barang data) {
        this.data = data;
    }

    public BarangNode getNext() {
        return next;
    }

    public void setNext(BarangNode next) {
        this.next = next;
    }
    
    
}
