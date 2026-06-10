package com.sdl.akademik;


public class KelasNode {
    private Kelas data;
    private KelasNode next;

    public KelasNode(Kelas data) {
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
