/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdl.penjualan;

/**
 *
 * @author LENOVO
 */
public class ListTransaksi {
    private TransaksiNode first;
    private TransaksiNode last;
    private ListBarang listBarang;

    public ListTransaksi() {
        this.listBarang = new ListBarang();
    }

    
    public TransaksiNode getFirst() {
        return first;
    }

    public void setFirst(TransaksiNode first) {
        this.first = first;
    }

    public TransaksiNode getLast() {
        return last;
    }

    public void setLast(TransaksiNode last) {
        this.last = last;
    }

    public ListBarang getListBarang() {
        return listBarang;
    }

    public void setListBarang(ListBarang listBarang) {
        this.listBarang = listBarang;
    }
    
    public void add(TransaksiNode node){
         if (isEmpty()) {
            first = node;
            last = node;
        }
        else{
            node.setNext(first);
            first = node;
        }
    }
    public TransaksiNode delete(){
         //isi senarai baru satu
        if (!isEmpty()) {
            //isi senarai baru 1
            if (first == last) {
                TransaksiNode node = first;
                first = null;
                last = null;
                return node;
            }
            else{
                //isi senarai lebih 1
                TransaksiNode node = first;
                first = first.getNext();
                
                return node;
            }
        }
        else{
            //senarai kosong
            return null;
        }
    }
    public boolean isEmpty(){
        if ((this.first == null) && (this.last == null))
            return true;
        else 
            return false;
    }
    
    public double getTotalTransaksi(){
        double total = 0;
        TransaksiNode barangTransaksi = first;
        while(barangTransaksi != null){
            BarangNode barang = listBarang.getFirst();
            while(barang != null){
                if(barang.getData().getKode().equals(barangTransaksi.getData().getKode())){
                    total += barang.getData().getHargaSatuan() * barangTransaksi.getData().getJumlah();
                break;
                }
                barang = barang.getNext();
            }
            barangTransaksi = barangTransaksi.getNext();
        }
        
        return total;
    }
    
    public ListTransaksi getSumOfNumbersOfDistinctData() {
        ListTransaksi hasil = new ListTransaksi();
        hasil.setListBarang(listBarang);
        TransaksiNode bantu = first;
        
        while(bantu != null) {
            String kode = bantu.getData().getKode();
            int jumlah = bantu.getData().getJumlah();
            TransaksiNode cari = hasil.getFirst();
            boolean ketemu = false;
            
            while(cari != null) {
                if (cari.getData().getKode().equals(kode)) {
                    cari.getData().setJumlah(cari.getData().getJumlah() + jumlah);
                    ketemu = true;
                    break;
                }
                cari = cari.getNext();
            }
            if (!ketemu) {
                Transaksi TransaksiBaru = new Transaksi(kode, jumlah);
                TransaksiNode NodeBaru = new TransaksiNode(TransaksiBaru, null);
                hasil.add(NodeBaru);
            }
            bantu = bantu.getNext();
        }
        return hasil;
    }
  
}
