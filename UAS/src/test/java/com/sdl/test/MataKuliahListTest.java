/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.test;

import com.sdl.akademik.MataKuliah;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class MataKuliahListTest {
    
    public MataKuliahListTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1() {
        MataKuliah makul1 = new MataKuliah("101","Dasar Algoritma dan Pemrograman",3);
        MataKuliah makul2 = new MataKuliah("102","Dasar Struktur Data",3);
        MataKuliah makul3 = new MataKuliah("103","Dasar Komputer dan Sistem Operasi",3);
        MataKuliah makul4 = new MataKuliah("201","Jaringan Komputer",3);
        
        MataKuliahList test = new MataKuliahList();
        test.add(makul1);
        
        int size = test.getSize();
        assertEquals(1,size);
    }

    @Test
    public void test2() {
        MataKuliah makul1 = new MataKuliah("101","Dasar Algoritma dan Pemrograman",3);
        MataKuliah makul2 = new MataKuliah("102","Dasar Struktur Data",3);
        MataKuliah makul3 = new MataKuliah("103","Dasar Komputer dan Sistem Operasi",3);
        MataKuliah makul4 = new MataKuliah("201","Jaringan Komputer",3);
        
        MataKuliahList test = new MataKuliahList();
        test.add(makul1);
        test.add(makul2);
        test.add(makul3);
        test.add(makul4);
        
        MataKuliah hasil = test.search("201");
        String namaMK = hasil.getMataKuliah();
        assertEquals("Jaringan Komputer",namaMK);
    }

    @Test
    public void test3() {
        MataKuliah makul1 = new MataKuliah("101","Dasar Algoritma dan Pemrograman",3);
        MataKuliah makul2 = new MataKuliah("102","Dasar Struktur Data",3);
        MataKuliah makul3 = new MataKuliah("103","Dasar Komputer dan Sistem Operasi",3);
        MataKuliah makul4 = new MataKuliah("201","Jaringan Komputer",3);
        
        MataKuliahList test = new MataKuliahList();
        test.add(makul4);
        test.add(makul3);
        test.add(makul2);
        test.add(makul1);
        
        ArrayList<MataKuliah> listKuliah = test.getData();
        MataKuliah makul = listKuliah.get(0);
        String namaMK = makul.getMataKuliah();
        assertEquals("Jaringan Komputer",namaMK);
        
        test.sorting();
        listKuliah = test.getData();
        makul = listKuliah.get(0);
        namaMK = makul.getMataKuliah();
        assertEquals("Dasar Algoritma dan Pemrograman",namaMK);
        
    }

}
