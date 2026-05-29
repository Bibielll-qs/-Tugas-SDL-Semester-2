/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.Klinik;

/**
 *
 * @author LENOVO
 */
public class ListPasien {
    private PasienNode first;
    private PasienNode last;

    public PasienNode getFirst() {
        return first;
    }

    public void setFirst(PasienNode first) {
        this.first = first;
    }

    public PasienNode getLast() {
        return last;
    }

    public void setLast(PasienNode last) {
        this.last = last;
    }
    
    public void add(PasienNode node){
        if (isEmpty()) {
            first = node;
            last = node;
        }
        else{
           last.setNext(node);
           last = node;
        }
    }
    public PasienNode delete(){
         //isi senarai baru satu
        if (!isEmpty()) { //jika list tidak kosong
            //isi senarai baru 1
            if (first == last) { //jika first sama dengan last
                PasienNode node = first; //node menjadi first
                first = null; //saat first bernilai null
                last = null; //saat last bernilai null
                return node;
            }
            else{ //selain di atas
                //isi senarai lebih 1
                PasienNode node = first;
                first = first.getNext(); // Geser pointer first ke pasien di belakangnya
                node.setNext(null);      // Putus hubungan node yang keluar dari antrean
                return node;
            }
        }
        else{ //selain di atas
            //senarai kosong
            return null;
        }
    }
    public boolean isEmpty(){
       if ((this.first == null) && (this.last == null))
            return true;
        else 
            return false;
    }
        public PasienNode cariPasien(String kode){
            PasienNode cari = first;
            while(cari != null){
                if (cari.getData().equals(kode)) {
                    return cari;
                }
                cari = cari.getNext();
            }
              return null;
        }
}
