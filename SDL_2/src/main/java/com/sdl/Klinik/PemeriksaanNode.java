/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.Klinik;

/**
 *
 * @author LENOVO
 */
public class PemeriksaanNode {
 private Pemeriksaan data;
 private PemeriksaanNode next;

    public PemeriksaanNode(Pemeriksaan data, PemeriksaanNode next) {
        this.data = data;
        this.next = next;
    }
 
 
}
