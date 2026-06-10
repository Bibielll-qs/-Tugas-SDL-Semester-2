/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.akademik;

/**
 *
 * @author puspa
 */
public class KelasNode {
    private Kelas data;
    private KelasNode next;

    public KelasNode(Kelas data, KelasNode next) {
        this.data = data;
        this.next = null;
    }

    public Kelas getData() {
        return data;
    }

    public void setData(Kelas data) {
        this.data = data;
    }

    public KelasNode getNext() {
        return next;
    }

    public void setNext(KelasNode next) {
        this.next = next;
    }
    
    
}
