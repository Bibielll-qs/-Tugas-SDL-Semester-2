/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.akademik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author puspa
 */
public class MataKuliahList {
    private ArrayList<MataKuliah> data = new ArrayList();

    public MataKuliahList() {
    }
    
    
    public void add(MataKuliah mataKuliah){
         data.add(mataKuliah);
    }
    
     public void sorting() {
        Collections.sort(data, Comparator.comparing(MataKuliah::getMataKuliah));
    }
    public int getSize(){
        return data.size();
    }
    public MataKuliah search(String kodeMK){
        for (MataKuliah mk : data) {
            if (mk.getKodeMK().equals(kodeMK)) return mk;
        }
        return null;
    }
    
    public ArrayList<MataKuliah> getData() {
        return data;
    }
    
    /**public void sorting() {
        Collections.sort(data, Comparator.comparing(MataKuliah::getMataKuliah));
    }
    * **/
   
}
