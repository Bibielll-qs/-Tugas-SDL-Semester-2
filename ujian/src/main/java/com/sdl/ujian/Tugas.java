package com.sdl.ujian; //menyimpan file ke package com.sdl.ujian

public class Tugas { //deklarasi class Tugas
    //buat atribut class Tugas
    private int noAntrian;
    private String kodePetugas;
    private int status;
    /**
     * constructor default
     */
    public Tugas() {
        this.noAntrian = 0;
        this.kodePetugas = "";
        this.status = 0;
    }
    /**
     * method constructor berparameter noAntrian
     * @param noAntrian 
     */
    public Tugas(int noAntrian) {
        this.noAntrian = noAntrian;
        this.kodePetugas = "";
        this.status = 0;
    }
    /**
     * method constructor berparameter
     * @param noAntrian
     * @param kodePetugas
     * @param status 
     */
    public Tugas(int noAntrian, String kodePetugas, int status) {
        this.noAntrian = noAntrian;
        this.kodePetugas = kodePetugas;
        this.status = status;
    }
    /**
     * method getter noAntrian
     * @return 
     */
    public int getNoAntrian() {
        return noAntrian;
    }
    /**
     * method setter
     * @param noAntrian 
     */
    public void setNoAntrian(int noAntrian) {
        this.noAntrian = noAntrian;
    }
    /**
     * method getter kodePetugas
     * @return 
     */
    public String getKodePetugas() {
        return kodePetugas;
    }
    /**
     * method setter
     * @param kodePetugas 
     */
    public void setKodePetugas(String kodePetugas) {
        this.kodePetugas = kodePetugas;
    }
    /**
     * method getter status
     * @return 
     */
    public int getStatus() {
        return status;
    }
    /**
     * method setter
     * @param status 
     */
    public void setStatus(int status) {
        this.status = status;
    }
    
} //akhir dari class Tugas