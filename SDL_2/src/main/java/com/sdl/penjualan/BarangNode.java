package com.sdl.penjualan; //menyimpan file ke package com.sdl.penjualan
/**
 *
 * @author LENOVO
 */
public class BarangNode { //deklarasi class BarangNode
    //buat atribut
    private Barang data; //atribut data bertipe Barang
    private BarangNode next; //atribut next bertipe BarangNode
    /**
     * method constructor
     * @param data
     * @param next 
     */
    public BarangNode(Barang data, BarangNode next) {
        this.data = data;
        this.next = next;
    }
    /**
     * method getter
     * @return 
     */
    public Barang getData() {
        return data;
    }
    /**
     * method setter
     * @param data 
     */
    public void setData(Barang data) {
        this.data = data;
    }
    /**
     * method getter
     * @return 
     */
    public BarangNode getNext() {
        return next;
    }
    /**
     * method setter
     * @param next 
     */
    public void setNext(BarangNode next) {
        this.next = next;
    }
} //akhir dari class BarangNode