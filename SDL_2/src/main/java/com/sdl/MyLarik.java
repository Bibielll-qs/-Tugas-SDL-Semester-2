/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl;

import java.util.Arrays;

/**
 * Kelas ini merupakan kelas untuk memodelkan rangkaian data numerik.
 * @author puspa
 */
public class MyLarik {
    // size/panjang larik dengan tipe data int
    private int size; // ukuran larik
    // larik penyimpan data bertipe double
    private double data[]; // larik penyimpan data

    /**
     * Konstruktor
     */
    public MyLarik() {
    }

    /**
     * Konstruktor; dengan tugas meng-instance-kan larik data
     * @param size 
     */
    public MyLarik(int size) {
        this.size = size;
        this.data = new double[size];
    }

    /**
     * Konstruktor dengan parameter data yang sudah dibuat
     * @param data 
     */
    public MyLarik(double[] data) {
        this.data = data;
        this.size= this.data.length;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the data
     */
    public double[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(double[] data) {
        this.data = data;
    }
    
    /**
     * Fungsi untuk mengisi suatu nilai di larik data
     * @param indeks
     * @param value 
     */
    public void append(int indeks,double value){
            this.data[indeks]=value;
    }
    
    /**
     * Fungsi untuk mengambil nilai dari larik data sesuai posisi masukan indeks.
     * @param indeks
     * @return 
     */
    public double getValue(int indeks){
        if (indeks > size)
            return -1;
        else
            return this.data[indeks];
    }
    
    /**
     * Fungsi menghitung rerata larik data. Asumsi semua data sudah terisi
     * @return 
     */
    public double getAverage(){
        double sum =0;
        for (int i = 0; i < data.length; i++) {
            double d = data[i];
            sum = sum+d;
        }
       return sum/data.length;
    }
 
     /**
     * Fungsi menghitung varians larik data. Asumsi semua data sudah terisi.
     * @return 
     */
    public double getVarians(){
        double rerata = this.getAverage();
        double varians = 0;
        for (int i = 0; i < data.length; i++) {
            double d = data[i];
            varians = varians + Math.pow((d-rerata), 2);
        }
        return varians/size;
    }
    
    /**
     * Fungsi menghitung total jumlah data dengan pendekatan looping
     * @param indeks
     * @return 
     */
    public double getLoopSum(int indeks){
        double sum = 0;
        for (int i = 0; i < indeks; i++) {
            double d = data[i];
            sum = sum+d;
        }
        return sum;
    }
    
    /**
     * Fungsi untuk menghitung total jumlah data dengan pendekatan rekursif
     * @param indeks
     * @return 
     */
    public double getRekursifSum(int indeks){
        if (indeks ==0)
            return data[indeks];
        else
            return data[indeks]+getRekursifSum(indeks-1);
    }

    /**
     * Fungsi cetak data
     */
    public void cetakData() {
        for (int i = 0; i < data.length; i++) {
            double d = data[i];
            System.out.println(d);
        }
    }

    /**
     * Fungsi cari sequential
     * @param x
     * @return 
     */
    public int sequentialSearch(double x) { //membuat metode sequentialSearch(double x) dengan parameter
        for (int i = 0; i < data.length; i++) { //perulangan untuk data.length
            double d = data[i]; //deklrasi variabel d untuk menyimpan isi data ke dalam indeks array data 
            if (x == d) //persyaratan jika nilai x sama dengan nilai d
                return i; //akan mengembalikan nilai i
        } //akhir dari perulangan
        return -1; //mengembalikan nilai -1
    } //qkhir dari metode sequentialSearch(double x)

    public int interpolationSearch(double x) { //membuat metode interpolationSearch(double x) dengan parameter
       int low = 0; //deklarasi & inisialisasi nilai awal variabel low, batas kiri
       int high = data.length -1; //deklarasi & simpan rumus perhitungan ke variabel high, batas kanan
       while(low <= high && x >= data[low] && x <= data[high]){ //kondisi perulangan untuk nilai yang dicari masih ada
           int mid = (int) (low + (int)((x - data[low]) * (high - low))/(data[high] - data[low])); //deklarasi & simpan rumus perhitungan perkiraan posisi berdasarkan nilai mid
           if(data[mid] == x){ //persyaratan jika array data berisi data mid sama dengan nilai x
               return mid; //mengembalikan nilai mid
           } //akhir dari persyaratan
           else if(data[mid] > x){ //persyaratan jika arrat data berisi mid lebih besar dari nilai x
               high = mid - 1; //eksekusi nilai high adalah perhitungan tersebut
           } 
           else{ //persyaratn selain dari atas 
               low = mid + 1; //eksekusi nilai low adalah perhitungan tersebut
           }
       } //akhir perulangan
       return -1; //mengembalikan nilai -1
    } //akhir dari metode interpolationSearch(double x)

    public int binarySearch(double x) { //membuat metode binarySearch(double x) dengan parameter
        int indeksAwal = 0; //deklarasi & inisialisasi awal variabel indeksAwal, batas kiri
        int indeksAkhir = data.length - 1;  //deklarasi & simpan rumus perhitungan ke variabel indeksAkhir, batas kanan
        while(indeksAwal <= indeksAkhir){ //kondisi perulangan untuk nilai yang dicari masih ada
            int nilaiTengah = (indeksAwal + indeksAkhir)/2; //deklarasi & simpan rumus perhitungan indeks tengah pada variabel nilaiTengah
            if(data[nilaiTengah] == x){ //persyaratan jika array data berisi nilaiTengah sama dengan nilai x
                return nilaiTengah; //mengembalikan hasil perhitungan nilaiTengah
            }
            else if(data[nilaiTengah] > x){ //persyaratan jika array data berisi nilaiTengah lebih dari nilai x 
                indeksAkhir = nilaiTengah - 1; //eksekusi nilai indeksAkhir adalah perhitungan tersebut
            }
            else{ //persyaratan selain dari atas
                indeksAwal = nilaiTengah + 1; //eksekusi nilia indeksAwal adalah perhitungan tersebut
            }
        } //akhir dari perulangan
        return -1; //mengembalikan nilai -1
    } //akhir dari metode binarySearch(double x)
    
} //akhir dari class MyLarik
