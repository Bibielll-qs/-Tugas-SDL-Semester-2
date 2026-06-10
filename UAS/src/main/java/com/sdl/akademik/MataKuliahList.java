package com.sdl.akademik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MataKuliahList {
    private ArrayList<MataKuliah> data = new ArrayList();

     /**
      * constructor default
      */
    public MataKuliahList() {
    }
    
    /**
     * method masukkan data matkul
     * @param mataKuliah 
     */
    public void add(MataKuliah mataKuliah){
         data.add(mataKuliah);
    }
    /**
     * fungsi menghitung jumlah data ukuran pada list
     * @return 
     */
    public int getSize(){
        return data.size();
    }
    /**
     * fungsi ambil data list MataKuliah
     * @return 
     */
    public ArrayList<MataKuliah> getData() { 
        return data; 
    }
    
    public MataKuliah search(String kodeMK){
        for (MataKuliah mk : data) {
            if (mk.getKodeMK().equals(kodeMK)) return mk;
        }
        return null;
    }
    public void sorting() {
        Collections.sort(data, Comparator.comparing(MataKuliah::getMataKuliah));
    }
   
}
