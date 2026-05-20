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
    /**
     * 
     * @param node 
     */
    public void add(BarangNode node){
        if (isEmpty()) {
            first = node;
            last = node;
        }
        else{
            node.setNext(first);
            first = node;
        }
    }
    /**
     * 
     * @return 
     */
    public BarangNode delete(){
         //isi senarai baru satu
        if (!isEmpty()) {
            //isi senarai baru 1
            if (first == last) {
                BarangNode node = first;
                first = null;
                last = null;
                return node;
            }
            else{
                //isi senarai lebih 1
                BarangNode node = first;
                first = first.getNext();
                
                return node;
            }
        }
        else{
            //senarai kosong
            return null;
        }
    }
    /**
     * 
     * @return 
     */
    public boolean isEmpty(){
         if ((this.first == null) && (this.last == null))
            return true;
        else 
            return false;
    }
}
