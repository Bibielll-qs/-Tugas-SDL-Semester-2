/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.ujian;

/**
 *
 * @author puspa
 */
public class AntrianTugas {
    private TugasNode first;
    private TugasNode last;
    private int noAntrian;

    public AntrianTugas() {
        this.first = null;
        this.last = null;
        this.noAntrian = 0;
    }
    
    
    public AntrianTugas(TugasNode first, TugasNode last, int noAntrian) {
        this.first = null;
        this.last = null;
        this.noAntrian = 0;
    }

    public TugasNode getFirst() {
        return first;
    }

    public void setFirst(TugasNode first) {
        this.first = first;
    }

    public TugasNode getLast() {
        return last;
    }

    public void setLast(TugasNode last) {
        this.last = last;
    }

    public int getNoAntrian() {
        return noAntrian;
    }

    public void setNoAntrian(int noAntrian) {
        this.noAntrian = noAntrian;
    }
    
    public void buatAntrianBaru(){
        noAntrian++;
        Tugas tugas = new Tugas(noAntrian);
        TugasNode node = new TugasNode(tugas);

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }
    
    public void addLast(Tugas tugas){
        TugasNode node = new TugasNode(tugas);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node); 
            last = node;
        }
    }
    
    public TugasNode delete(){
         //isi senarai baru satu
        if (!isEmpty()) {
            //isi senarai baru 1
            if (first == last) {
                TugasNode node = first;
                first = null;
                last = null;
                return node;
            }
            else{
                //isi senarai lebih 1
                TugasNode node = first;
                first = first.getNext();
                
                return node;
            }
        }
        else{
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
    
    public void updateStatusTugas(int noAntrian, String namaTugas, int status) {
       TugasNode current = first;
        while (current != null) {
            if (current.getData().getNoAntrian() == noAntrian) {
                current.getData().setKodePetugas(namaTugas); 
                current.getData().setStatus(status);
                return;
            }
            current = current.getNext();
        }
    }
    
    public AntrianTugas cariAntrian() {
        AntrianTugas hasil = new AntrianTugas();
        TugasNode current = first;
        while (current != null) {
            if (current.getData().getStatus() == 0) {
                Tugas t = new Tugas(current.getData().getNoAntrian());
                t.setKodePetugas(current.getData().getKodePetugas());
                t.setStatus(current.getData().getStatus());
                TugasNode newNode = new TugasNode(t);
                if (hasil.first == null) {
                    hasil.first = newNode;
                    hasil.last = newNode;
                } else {
                    hasil.last.setNext(newNode);
                    hasil.last = newNode;
                }
                hasil.noAntrian++;
            }
            current = current.getNext();
        }
        return hasil;
    }
}
