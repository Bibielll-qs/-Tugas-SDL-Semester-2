/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.Klinik;

/**
 *
 * @author LENOVO
 */
public class PasienNode {
    private Pasien data;
    private PasienNode next;

    public PasienNode(Pasien data, PasienNode next) {
        this.data = data;
        this.next = next;
    }

    public Pasien getData() {
        return data;
    }

    public void setData(Pasien data) {
        this.data = data;
    }

    public PasienNode getNext() {
        return next;
    }

    public void setNext(PasienNode next) {
        this.next = next;
    }
    
    
}
