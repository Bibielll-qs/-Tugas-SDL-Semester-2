/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test;
import com.sdl.*;
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.util.Arrays;
public class SearchingMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] data = {25, 30, 35, 1, 2, 50};
        Arrays.sort(data);
        System.out.print("Masukkan data yang dicari: ");
        double angka = input.nextDouble();
        
        MyLarik objek = new MyLarik(data);
        //sequentialSearch
        double a = objek.sequentialSearch(angka);
        System.out.println("Data Sequential Search");
        if(a != -1){
            System.out.println("Data ditemukan di indeks ke- " +a);
        }
        else{
            System.out.println("Data angka tidak ditemukan");
        }
        System.out.println();
        
        //binarySearch
        double b = objek.binarySearch(angka);
         System.out.println("Data Binary Search");
        if(b != -1){
            System.out.println("Data ditemukan di indeks ke- " +b);
        }
        else{
            System.out.println("Data angka tidak ditemukan");
        }
        System.out.println();
        
        //interpolationSearch
        double c = objek.interpolationSearch(angka);
         System.out.println("Data Interpolation Search");
        if(c != -1){
            System.out.println("Data  ditemukan di indeks ke- " +c);
        }
        else{
            System.out.println("Data angka tidak ditemukan");
        }
        System.out.println();
    }
}
