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
public class TugasNode {
    private Tugas data;
    private TugasNode next;

    public TugasNode(Tugas data) {
        this.data = data;
        this.next = null;
    }
    
    public TugasNode(Tugas data, TugasNode next) {
        this.data = data;
        this.next = next;
    }
    
    public void setStatus(int status) {
        this.data.setStatus(status);
    }
     public int getStatus() {
        return this.data.getStatus();
    }
     
    public Tugas getData() {
        return data;
    }

    public void setData(Tugas data) {
        this.data = data;
    }

    public TugasNode getNext() {
        return next;
    }

    public void setNext(TugasNode next) {
        this.next = next;
    }
    
    
}
