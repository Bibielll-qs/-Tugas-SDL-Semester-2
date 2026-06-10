package com.sdl.akademik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MataKuliahList {
    private ArrayList<MataKuliah> data = new ArrayList();

    public MataKuliahList() {
    }
    
    
    public void add(MataKuliah mataKuliah){
         data.add(mataKuliah);
    }
    
    public int getSize(){
        return data.size();
    }
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
