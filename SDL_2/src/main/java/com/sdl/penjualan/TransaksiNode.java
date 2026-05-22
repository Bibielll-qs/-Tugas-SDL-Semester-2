package com.sdl.penjualan; //menyimpan file ke package com.sdl.penjualan

/**
 *
 * @author LENOVO
 */
public class TransaksiNode { //deklarasi class TransaksiNode
    //buat atribut
    private Transaksi data; //atribut data bertipe Transaksi
    private TransaksiNode next; //atribut next bertipe TransaksiNode
    /**
     * method constructor
     * @param data
     * @param next 
     */
    public TransaksiNode(Transaksi data, TransaksiNode next) {
        this.data = data;
        this.next = next;
    }
    /**
     * method getter
     * @return 
     */
    public Transaksi getData() {
        return data;
    }
    /**
     * method setter
     * @param data 
     */
    public void setData(Transaksi data) {
        this.data = data;
    }
    /**
     * method getter
     * @return 
     */
    public TransaksiNode getNext() {
        return next;
    }
    /**
     * method setter
     * @param next 
     */
    public void setNext(TransaksiNode next) {
        this.next = next;
    }   
} //akhir dari class TransaksiNode
