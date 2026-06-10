/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.test;

import com.sdl.akademik.KelasList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puspa
 */
public class KelasListTest {

    public KelasListTest() {
    }

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void test1() {
        KelasList list = new KelasList();
        Kelas kelas1 = new Kelas("101", "101A", "Pupaningtyas S. Adi");
        Kelas kelas2 = new Kelas("102", "102B", "Pupaningtyas S. Adi");
        Kelas kelas3 = new Kelas("101", "101B", "Agung H");
        Kelas kelas4 = new Kelas("103", "103A", "Agung H");
        Kelas kelas5 = new Kelas("102", "102A", "Ridowati Gunawan");
        Kelas kelas6 = new Kelas("103", "103B", "Ridowati Gunawan");

        list.addFirst(kelas1);
        list.addFirst(kelas2);

        KelasNode hasil = list.getFirst();
        assertEquals("102B", hasil.getData().getKodeKelas());

        KelasNode hasil1 = list.getLast();
        assertEquals("101A", hasil1.getData().getKodeKelas());
    }

    @Test
    public void test2() {
        KelasList list = new KelasList();
        Kelas kelas1 = new Kelas("101", "101A", "Pupaningtyas S. Adi");
        Kelas kelas2 = new Kelas("102", "102B", "Pupaningtyas S. Adi");
        Kelas kelas3 = new Kelas("101", "101B", "Agung H");
        Kelas kelas4 = new Kelas("103", "103A", "Agung H");
        Kelas kelas5 = new Kelas("102", "102A", "Ridowati Gunawan");
        Kelas kelas6 = new Kelas("103", "103B", "Ridowati Gunawan");

        list.addFirst(kelas1);
        list.addFirst(kelas2);

        KelasNode hasil = list.getFirst();
        assertEquals("102B", hasil.getData().getKodeKelas());

        KelasNode hasil1 = list.deleteLast();
        assertEquals("101A", hasil1.getData().getKodeKelas());
    }

    @Test
    public void test3() {
        KelasList list = new KelasList();
        Kelas kelas1 = new Kelas("101", "101A", "Pupaningtyas S. Adi");
        Kelas kelas2 = new Kelas("102", "102B", "Pupaningtyas S. Adi");
        Kelas kelas3 = new Kelas("101", "101B", "Agung H");
        Kelas kelas4 = new Kelas("103", "103A", "Agung H");
        Kelas kelas5 = new Kelas("102", "102A", "Ridowati Gunawan");
        Kelas kelas6 = new Kelas("103", "103B", "Ridowati Gunawan");

        list.addFirst(kelas1);
        list.addFirst(kelas2);
        list.addFirst(kelas3);
        list.addFirst(kelas4);
        list.addFirst(kelas5);
        list.addFirst(kelas6);

        MataKuliah makul = new MataKuliah("101", "Dasar Algoritma dan Pemrograman");
        KelasList hasil = list.getKelasList(makul);
        assertEquals(2, hasil.getSize());
    }

    @Test
    public void test4() {
        KelasList list = new KelasList();
        Kelas kelas1 = new Kelas("101", "101A", "Pupaningtyas S. Adi");
        Kelas kelas2 = new Kelas("102", "102B", "Pupaningtyas S. Adi");
        Kelas kelas3 = new Kelas("101", "101B", "Agung H");
        Kelas kelas4 = new Kelas("103", "103A", "Agung H");
        Kelas kelas5 = new Kelas("102", "102A", "Ridowati Gunawan");
        Kelas kelas6 = new Kelas("103", "103B", "Ridowati Gunawan");

        list.addFirst(kelas1);
        list.addFirst(kelas2);
        list.addFirst(kelas3);
        list.addFirst(kelas4);
        list.addFirst(kelas5);
        list.addFirst(kelas6);

        MataKuliah makul = new MataKuliah("101", "Dasar Algoritma dan Pemrograman");
        KelasList hasil = list.getKelasList(makul);
        assertEquals(2, hasil.getSize());
    }

    @Test
    public void test5() {
        KelasList list = new KelasList();
        Kelas kelas1 = new Kelas("101", "101A", "Pupaningtyas S. Adi");
        Kelas kelas2 = new Kelas("102", "102B", "Pupaningtyas S. Adi");
        Kelas kelas3 = new Kelas("101", "101B", "Agung H");
        Kelas kelas4 = new Kelas("103", "103A", "Agung H");
        Kelas kelas5 = new Kelas("102", "102A", "Ridowati Gunawan");
        Kelas kelas6 = new Kelas("103", "103B", "Ridowati Gunawan");

        list.addFirst(kelas1);
        list.addFirst(kelas2);
        list.addFirst(kelas3);
        list.addFirst(kelas4);
        list.addFirst(kelas5);
        list.addFirst(kelas6);

        MataKuliah makul = new MataKuliah("101", "Dasar Algoritma dan Pemrograman");
        KelasList hasil = list.getKelasList(makul);
        assertEquals(2, hasil.getSize());
        
        KelasNode node = hasil.getFirst();
        assertEquals("Agung H",node.getData().getDosen());
        KelasNode node1 = hasil.getLast();
        assertEquals("Pupaningtyas S. Adi",node.getData().getDosen());
        
    }

    @Test
    public void test6() {
        KelasList list = new KelasList();
        Kelas kelas1 = new Kelas("101", "101A", "Pupaningtyas S. Adi");
        Kelas kelas2 = new Kelas("102", "102B", "Pupaningtyas S. Adi");
        Kelas kelas3 = new Kelas("101", "101B", "Agung H");
        Kelas kelas4 = new Kelas("103", "103A", "Agung H");
        Kelas kelas5 = new Kelas("102", "102A", "Ridowati Gunawan");
        Kelas kelas6 = new Kelas("103", "103B", "Ridowati Gunawan");

        list.addFirst(kelas1);
        list.addFirst(kelas2);
        list.addFirst(kelas3);
        list.addFirst(kelas4);
        list.addFirst(kelas5);
        list.addFirst(kelas6);

        KelasList hasil = list.getKelasList("Ridowati Gunawan");
        assertEquals(2, hasil.getSize());
        
        KelasNode node = hasil.getFirst();
        assertEquals("103B",node.getData().getKodeKelas());
        KelasNode node1 = hasil.getLast();
        assertEquals("102A",node.getData().getKodeKelas());
        
    }
}
