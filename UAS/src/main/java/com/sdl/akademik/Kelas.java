package com.sdl.akademik;

public class Kelas {
    private String kodeKelas;
    private String kodeMK;
    private String namaDosen;

    public Kelas(String kodeMK, String kodeKelas, String namaDosen) {
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
