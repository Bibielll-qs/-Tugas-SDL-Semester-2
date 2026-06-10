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
public class Kelas {
    private String kodeKelas;
    private String kodeMK;
    private String namaDosen;

    public Kelas(String kodeKelas, String kodeMK, String namaDosen) {
        this.kodeKelas = kodeKelas;
        this.kodeMK = kodeMK;
        this.namaDosen = namaDosen;
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    
}
