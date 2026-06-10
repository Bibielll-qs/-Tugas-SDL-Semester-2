package com.sdl.akademik;

public class MataKuliah {
    private String kodeMK;
    private String mataKuliah;
    private int sks;
    
    public MataKuliah(String kodeMK, String mataKuliah, int sks) {
        this.kodeMK     = kodeMK;
        this.mataKuliah = mataKuliah;
        this.sks        = sks;
    }

    public MataKuliah(String kodeMK, String mataKuliah) {
        this(kodeMK, mataKuliah, 0);
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

