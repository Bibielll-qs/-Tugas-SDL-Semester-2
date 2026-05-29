/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.Klinik;

/**
 *
 * @author LENOVO
 */
public class StackRiwayat {
    private Pemeriksaan top;
    private int size;

    public StackRiwayat(Pemeriksaan top, int size) {
        this.top = null;
        this.size = 0;
    }

    
    public void push(Pemeriksaan p){
        if (p != null) {
            p.setNext(top);
            top = p;
            size++;
        }
    }
    
    public Pemeriksaan pop(){
       // cek stack kosong
        if (isEmpty()){
            return null;
        } else {
            //stack tidak kosong
            Pemeriksaan result = top;
            top = top.getNext();
            this.size --;
            return result;
        }
    }
    
    public Pemeriksaan peek(){
        return top;
    }
    
    public boolean isEmpty(){
        return this.top == null;
    }
    
}