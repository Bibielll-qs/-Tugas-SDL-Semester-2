package com.test.latihan; //menyimpan file ke package com.test.latihan

import com.sdl.latihan.MyItem; //mengimport isi dari class MyItem
import com.sdl.latihan.MyItemLarik; //mengimport isi dari class MyItemLarik


public class MyItemLarikTestMain { //deklarasi class MyItemLarikTestMain
    public static void main(String[] args) { //metode menjalankan program
        //membuat objek class MyItemLarik berparameter
        MyItemLarik test = new MyItemLarik(5);
        //membuat objek item
        MyItem item1 = new MyItem("Bila", 126);
        MyItem item2 = new MyItem("Theo", 140);
        MyItem item3 = new MyItem("Geby", 143);
        MyItem item4 = new MyItem("Noah", 113);
        MyItem item5 = new MyItem("Icha", 120);
        //memasukkan item
        test.append(item1, 0);
        test.append(item2, 1);
        test.append(item3, 2);
        test.append(item4, 3);
        test.append(item5, 4);
        //ambil data
        MyItemLarik result = test.getItemSum2(test.getData());
        
        System.out.println("Sorting String");
        //sortir data String A-Z
        result.itemSort(0);
        //perulangan mencetak data sortir
        for (int i = 0; i < result.getDataSize(); i++) {
            System.out.println(result.getData()[i].getItem()+ " = " +result.getData()[i].getNumbers());
        } //akhir dari perulangan
        
        System.out.println();
        
        System.out.println("Sorting Integer");
        //sortir data integer
        result.itemSort(1);
        //perulangan mencetak data sortir
        for (int i = 0; i < result.getDataSize(); i++) {
            System.out.println(result.getData()[i].getItem()+ " = " +result.getData()[i].getNumbers());
        } //akhir perulangan
    } //akhir metode program
} //akhir dari class MyItemLarikTestMain
