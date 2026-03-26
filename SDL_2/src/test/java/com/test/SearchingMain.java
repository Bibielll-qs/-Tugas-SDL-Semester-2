package com.test; //menyimpan file ke package com.test
import com.sdl.*; //mengimport isi dari semua kelas com.sdl

import java.util.Scanner; //memanggil kelas fungsi scanner
import java.util.Arrays; //memanggil fungsi arrays untuk mengurutkan array
public class SearchingMain { //deklarasi kelas SearchingMain
    public static void main(String[] args) { //meteode menjalankan program
        Scanner input = new Scanner(System.in); //membuat objek scanner bernama input
        double [] data = {25, 30, 35, 1, 2, 50}; //deklarasi & mengisi array data
        Arrays.sort(data); //mengurutkan data dalam array dari angka yang paling kecil
        System.out.print("Masukkan data yang dicari: "); //meminta user memasukkan data angka yang dicari indeksnya
        double angka = input.nextDouble(); //baca & simpan data angka
        
        MyLarik objek = new MyLarik(data); //membuat objek bernama objek pada class MyLarik
        
        //sequentialSearch
        double a = objek.sequentialSearch(angka); //deklarasi variabel a berisi metode sequentialSearch(angka) pada objek 
        System.out.println("Data Sequential Search"); //mencetak tulisan
        if(a != -1){ //persyaratan jika nilai a tidak sama dengan -1
            System.out.println("Data ditemukan di indeks ke- " +a); //eksekusi mencetak hasil nilai a jika benar
        } //akhir dari persyaratan
        else{ //persyaratan selain dari atas 
            System.out.println("Data angka tidak ditemukan"); //eksekusi tulisan jika persyaratan dari atas salah
        } //akhir dari persyaratan
        System.out.println(); //mencetak jeda antar baris
        
        //binarySearch
        double b = objek.binarySearch(angka); //deklarasi variabel b berisi metode binarySearch(angka) pada objek 
         System.out.println("Data Binary Search"); //mencetak tulisan
        if(b != -1){ //persyaratan jika nilai b tidak sama dengan -1
            System.out.println("Data ditemukan di indeks ke- " +b); //eksekusi mencetak hasil nilai b jika benar
        } //akhir dari persyaratan
        else{ //persyaratan selain dari atas 
            System.out.println("Data angka tidak ditemukan"); //eksekusi tulisan jika persyaratan dari atas salah
        }
        System.out.println(); //mencetak jeda antar baris
        
        //interpolationSearch
        double c = objek.interpolationSearch(angka); //deklarasi variabel c berisi metode interpolationSearch(angka) pada objek 
         System.out.println("Data Interpolation Search");
        if(c != -1){ //persyaratan jika nilai c tidak sama dengan -1
            System.out.println("Data  ditemukan di indeks ke- " +c); //eksekusi mencetak hasil nilai b jika benar
        } //akhir dari persyaratn
        else{ //persyaratan selain dari atas 
            System.out.println("Data angka tidak ditemukan"); //eksekusi tulisan jika persyaratan dari atas salah
        } //akhir dari persyaratan
        System.out.println(); //mencetak jeda antar baris
    } //akhir dari metode program
    
} //akhir dari class SearchingMain
