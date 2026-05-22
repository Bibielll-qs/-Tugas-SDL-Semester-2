package com.sdl.penjualan; //menyimpan file ke package com.sdl.penjualan

/**
 *
 * @author LENOVO
 */
public class Transaksi { //deklarasi class Transaksi
    //buat atribut
    private String kode;
    private int jumlah;
    /**
     * method constructor
     * @param kode
     * @param jumlah 
     */
    public Transaksi(String kode, int jumlah) {
        this.kode = kode;
        this.jumlah = jumlah;
    }
    /**
     * method getter
     * @return 
     */
    public String getKode() {
        return kode;
    }
    /**
     * method setter
     * @param kode 
     */
    public void setKode(String kode) {
        this.kode = kode;
    }
    /**
     * method getter
     * @return 
     */
    public int getJumlah() {
        return jumlah;
    }
    /**
     * method setter
     * @param jumlah 
     */
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
} //akhir dari class Transaksi
