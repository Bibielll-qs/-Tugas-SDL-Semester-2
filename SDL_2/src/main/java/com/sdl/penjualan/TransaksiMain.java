package com.sdl.penjualan;

/**
 *
 * @author LENOVO
 */
public class TransaksiMain {
    public static void main(String[] args) {
        ListTransaksi listTransaksi = new ListTransaksi();
        
        Barang brg1 = new Barang("1", "Aqua 500 ml", 3000);
        BarangNode br1 = new BarangNode(brg1, null);
        listTransaksi.getListBarang().add(br1);
        
        Barang brg2 = new Barang("2", "Teh pucuk 550 ml", 5000);
        BarangNode br2 = new BarangNode(brg2, null);
        listTransaksi.getListBarang().add(br2);
        
        Barang brg3 = new Barang("1", "Aqua 500 ml", 3000);
        BarangNode br3 = new BarangNode(brg3, null);
        listTransaksi.getListBarang().add(br3);
        
        Barang brg4 = new Barang("2", "Teh pucuk 550 ml", 5000);
        BarangNode br4 = new BarangNode(brg4, null);
        listTransaksi.getListBarang().add(br4);
        
        Transaksi tb1 = new Transaksi("1", 10);
        TransaksiNode t1 = new TransaksiNode(tb1, null);
        listTransaksi.add(t1);
        
        Transaksi tb2 = new Transaksi("2", 5);
        TransaksiNode t2 = new TransaksiNode(tb2, null);
        listTransaksi.add(t2);
        
        Transaksi tb3 = new Transaksi("1", 20);
        TransaksiNode t3 = new TransaksiNode(tb3, null);
        listTransaksi.add(t3);
        
        Transaksi tb4 = new Transaksi("2", 15);
        TransaksiNode t4 = new TransaksiNode(tb4, null);
        listTransaksi.add(t4);
        
     ListTransaksi hasil = listTransaksi.getSumOfNumbersOfDistinctData();
     
     //cetak tabel transaksi barang
        System.out.println("============== Tabel Transaksi Barang ==============");
        System.out.printf("%-12s %-20s %-18s %-10s %s%n",
            "Kode Barang", "Nama Barang", "Harga Satuan", "Jumlah", "Subtotal");
        System.out.println("-----------------------------------------------------------------------");
        
        TransaksiNode transaksi = hasil.getFirst();//ambul node pertama dalam list yang sudah di update
        while (transaksi != null) {//loop utama transaksi
            BarangNode barang = listTransaksi.getListBarang().getFirst();//cari dari node pertama barang
            while (barang != null) {//inner loop (cari semua node barang)
                if (barang.getData().getKode().equals(transaksi.getData().getKode())) {//cek apakah kode barang = kode transaksi
                    int subtotal = barang.getData().getHargaSatuan() * transaksi.getData().getJumlah();//hitung subtotal
                    System.out.printf("%-12s %-20s %-18d %-10d %d%n",//cetak data transaksi
                        transaksi.getData().getKode(),
                        barang.getData().getNama(),
                        barang.getData().getHargaSatuan(),
                        transaksi.getData().getJumlah(),
                        subtotal);
                    break;//keluar dr loop
                }//tutup kruung kurawal if
                barang = barang.getNext();//kalau tdk cocok, pindah node selanjutnya
            }//tutup kurung kurawal inner loop
            transaksi = transaksi.getNext();//setelah satu transaksi selesai, pindah selanjutnya
        }//tutup kurung kurawal outer loop
        
        //cetak total transaksi
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Total Transaksi: " + listTransaksi.getTotalTransaksi());
        System.out.println();
    }
}
