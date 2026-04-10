/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.latihan;

/**
 *
 * @author user
 */
public class MyItemLarik {
    // larik penyimpan data bertipe Student
    private MyItem[] data;

    /**
     * Konstruktor
     */
    public MyItemLarik() {
    }

    /**
     * Konstruktor
     * @param data 
     */
    public MyItemLarik(MyItem[] data) {
        this.data = data;
    }
    
    /**
     * Konstruktor
     * @param size 
     */
    public MyItemLarik(int size) {
        this.data = new MyItem[size];
    }

    /**
     * @return the data
     */
    public MyItem[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(MyItem[] data) {
        this.data = data;
    }
    
    /**
     * Fungsi untuk menambah item ke atribut data sesuai indeks yang ada di parameter
     * @param item 
     * @param indeks
     */
    public void append(MyItem item, int indeks){
        this.data[indeks] = item;
    }
    
    /**
     * Fungsi untuk menghitung ukuran Array/Larik
     * @return 
     */
    public MyItem[] getDataSize(){
        return data;
    }
    
    /**
     * Fungsi untuk mencari posisi item. Luaran fungsi adalah indeks item. Jika tidak ada, luarannya -1.
     * @param item
     * @return 
     */
    public int itemSearch(String item){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    
    public void getChangeData(MyItem[] data, int indeks_a, int indeks_b){
        String temp = data[indeks_a];
        data[indeks_a] = data[indeks_b];
        data[indeks_b] = temp;
        return data;
    }
    
    public void cetakData(MyItem[] ) {
        for (int i = 0; i < data.length; i++) {
            String d = data[i];
            System.out.println(d);
        }
    }
    /**
     * Fungsi sorting berdasarkan masukan tipe.
     * tipe = 0, sorting berdasar String item secara ascending (kecil ke besar)
     * tipe = 1, sorting berdasar int numerik; secara ascending (kecil ke besar)
     * @param type 
     */
    public void itemSort(int type){
        for (int i = 0; i < type-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < type; j++) {
                if (data[j]< data[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                getChangeData(data, i, minIndex);
            }
            System.out.println("iterasi ke"+(i+1)+": ");
            cetakData();
        }
    }
}
