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
public class Tugas {
    private int noAntrian;
    private String kodePetugas;
    private int status;

    public Tugas() {
        this.noAntrian = 0;
        this.kodePetugas = "";
        this.status = 0;
    }

    public Tugas(int noAntrian) {
        this.noAntrian = noAntrian;
        this.kodePetugas = "";
        this.status = 0;
    }
    
    public Tugas(int noAntrian, String kodePetugas, int status) {
        this.noAntrian = noAntrian;
        this.kodePetugas = kodePetugas;
        this.status = status;
    }

    public int getNoAntrian() {
        return noAntrian;
    }

    public void setNoAntrian(int noAntrian) {
        this.noAntrian = noAntrian;
    }

    public String getKodePetugas() {
        return kodePetugas;
    }

    public void setKodePetugas(String kodePetugas) {
        this.kodePetugas = kodePetugas;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
