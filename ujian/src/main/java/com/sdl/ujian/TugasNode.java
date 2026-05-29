package com.sdl.ujian; //menyimpan file ke package com.sdl.ujian

public class TugasNode { //deklarasi class TugasNode
    private Tugas data; //atribut private data bertipe Tugas
    private TugasNode next; //atribut private next bertipe TugasNode
    /**
     * method constructor berparameter data
     * @param data 
     */
    public TugasNode(Tugas data) {
        this.data = data;
        this.next = null;
    }
    /**
     * method constructor berparameter 
     * @param data
     * @param next 
     */
    public TugasNode(Tugas data, TugasNode next) {
        this.data = data;
        this.next = next;
    }
    /**
     * method setter
     * @param status 
     */
    public void setStatus(int status) {
        this.data.setStatus(status);
    }
    /**
     * method getter status
     * @return 
     */
     public int getStatus() {
        return this.data.getStatus();
    }
     /**
      * method getter data
      * @return 
      */
    public Tugas getData() {
        return data;
    }
    /***
     * method setter
     * @param data 
     */
    public void setData(Tugas data) {
        this.data = data;
    }
    /**
     * method getter next
     * @return 
     */
    public TugasNode getNext() {
        return next;
    }
    /**
     * method setter
     * @param next 
     */
    public void setNext(TugasNode next) {
        this.next = next;
    }
    
} //akhir dari class TugasNode
