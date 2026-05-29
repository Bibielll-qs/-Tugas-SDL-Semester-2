/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.test;

import com.sdl.ujian.AntrianTugas;
import com.sdl.ujian.Tugas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class AntrianTugasTest {
    
    public AntrianTugasTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void test1(){
        AntrianTugas antrian = new AntrianTugas();
        antrian.buatAntrianBaru();
        int noAntrian = antrian.getNoAntrianTerakhir();
        assertEquals(1,noAntrian);
    }
    
    @Test
    public void test2(){
        AntrianTugas antrian = new AntrianTugas();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrianTerakhir();
        assertEquals(3,noAntrian);
    }
    
    @Test
    public void test3(){
        AntrianTugas antrian = new AntrianTugas();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrianTerakhir();
        assertEquals(3,noAntrian);
        
        antrian.updateStatusTugas(1,"T1",1);
        TugasNode node = antrian.getFirst();
        Tugas tugas = node.getData();
        int status = tugas.getStatus();
        assertEquals(1,status);
    }
    
    @Test
    public void test4(){
        AntrianTugas antrian = new AntrianTugas();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrianTerakhir();
        assertEquals(3,noAntrian);
        
        antrian.updateStatusTugas(1,"T1",2);
        TugasNode node = antrian.getFirst();
        Tugas tugas = node.getData();
        int status = tugas.getStatus();
        assertEquals(2,status);
    }
    
    @Test
    public void test5(){
        AntrianTugas antrian = new AntrianTugas();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrianTerakhir();
        assertEquals(3,noAntrian);
        
        antrian.updateStatusTugas(1,"T1",2);
        TugasNode node = antrian.getFirst();
        Tugas tugas = node.getData();
        int status = node.getStatus();
        assertEquals(2,status);
        
        AntrianTugas antrian1 = antrian.cariAntrian();
        TugasNode node1 = antrian1.getFirst();
        Tugas tugas1 = node1.getData();
        int status = tugas1.getStatus();
        int noAntrian = tugas1.getNoAntrian();
        assertEquals(0,status);
        assertEquals(2,noAntrian);
    }
    
    @Test
    public void test6(){
        AntrianTugas antrian = new AntrianTugas();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrianTerakhir();
        assertEquals(3,noAntrian);
        
        antrian.updateStatusTugas(1,"T1",2);
        TugasNode node = antrian.getFirst();
        Tugas tugas = node.getData();
        int status = node.getStatus();
        assertEquals(2,status);
        
        AntrianTugas antrian1 = antrian.cariAntrian();
        TugasNode node1 = antrian1.getLast();
        Tugas tugas1 = node1.getData();
        int status = tugas1.getStatus();
        int noAntrian = tugas1.getNoAntrian();
        assertEquals(0,status);
        assertEquals(3,noAntrian);
    }
}
