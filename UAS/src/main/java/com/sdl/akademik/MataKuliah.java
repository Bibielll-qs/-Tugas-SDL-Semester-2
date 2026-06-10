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
public class MataKuliah {
    private String kodeMK;
    private String mataKuliah;
    private int sks;

    public MataKuliah(String kodeMK, String mataKuliah, int sks) {
        this.kodeMK = kodeMK;
        this.mataKuliah = mataKuliah;
        this.sks = sks;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
    
    
}

