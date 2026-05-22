package com.sdl.penjualan; //menyimpan file ke package com.sdl.penjualan

/**
 *
 * @author LENOVO
 */
public class Barang { //deklarasi class Barang
    //buat atribut
    private String kode;
    private String nama;
    private int hargaSatuan;
    /**
     * method constructor
     * @param kode
     * @param nama
     * @param hargaSatuan 
     */
    public Barang(String kode, String nama, int hargaSatuan) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
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
    public String getNama() {
        return nama;
    }
    /**
     * method setter
     * @param nama 
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * method getter
     * @return 
     */
    public int getHargaSatuan() {
        return hargaSatuan;
    }
    /**
     * method setter
     * @param hargaSatuan 
     */
    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
} //akhir dari clas Barang
