/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.penjualan;

/**
 *
 * @author LENOVO
 */
public class TransaksiNode {
    private Transaksi data;
    private TransaksiNode next;

    public TransaksiNode(Transaksi data, TransaksiNode next) {
        this.data = data;
        this.next = next;
    }

    public Transaksi getData() {
        return data;
    }

    public void setData(Transaksi data) {
        this.data = data;
    }

    public TransaksiNode getNext() {
        return next;
    }

    public void setNext(TransaksiNode next) {
        this.next = next;
    }   
}
