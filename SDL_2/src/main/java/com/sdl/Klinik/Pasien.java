/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.Klinik;

/**
 *
 * @author LENOVO
 */
public class Pasien {
    private String kodePasien;
    private String nama;
    private int usia;

    public Pasien(String kodePasien, String nama, int usia) {
        this.kodePasien = kodePasien;
        this.nama = nama;
        this.usia = usia;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    
}
