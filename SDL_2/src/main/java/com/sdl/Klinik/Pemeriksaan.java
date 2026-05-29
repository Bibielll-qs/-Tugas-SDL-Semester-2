/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.Klinik;

/**
 *
 * @author LENOVO
 */
public class Pemeriksaan {
    private String kodePasien;
    private String diagnosa;
    private int biaya;
    private Pemeriksaan next;

    public Pemeriksaan(String kodePasien, String diagnosa, int biaya) {
        this.kodePasien = kodePasien;
        this.diagnosa = diagnosa;
        this.biaya = biaya;
        this.next = null;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public Pemeriksaan getNext() {
        return next;
    }

    public void setNext(Pemeriksaan next) {
        this.next = next;
    }
    
}
