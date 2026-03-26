package com.sdl; //menyimpan file ke package com.sdl
/**
 * Kelas ini merupakan kelas untuk memodelkan rangkaian data string.
 * @author Bila
 */
public class MyStringLarik { //deklarasi class  MyStringLarik
    // size/panjang larik dengan tipe data int
    private int size; // ukuran larik
    // larik penyimpan data bertipe String
    private String[] data; // larik penyimpan data

    public MyStringLarik() { //membuat metode constructor default MyStringLarik()
    } //akhir dari  metode constructor default MyStringLarik()

    /**
     * Konstruktor; dengan tugas meng-instance-kan larik data
     * @param size 
     */
    public MyStringLarik(int size) {
        this.size = size;
        this.data = new String[size];
    }
    
    public MyStringLarik(String[] data){
        this.data = data;
        this.size = data.length;
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
    public String[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String[] data) {
        this.data = data;
    }
    
     /**
     * Fungsi untuk mengisi suatu nilai di larik data
     * @param indeks
     * @param value 
     */
    public void append(int indeks,String value){
        this.data[indeks]= value;
    }
    
    /**
     * Fungsi untuk mengambil nilai dari larik data sesuai posisi masukan indeks.
     * @param indeks
     * @return 
     */
    public String getValue(int indeks){
        if (indeks < this.getSize())
            return this.data[indeks];
        else
            return "out of range";
    }

    /**
     * Fungsi untuk memeriksa apakah string value ada di larik data
     * @param value
     * @return 
     */
    public boolean isExist(String value){
        for (int i = 0; i < data.length; i++) {
            String string = data[i];
            if (string.equals(value))
                return true;
        }
        return false;
    }
    
    /**
     * Fungsi untuk menghitung jumlah string value yang ada di larik data
     * @param value
     * @return 
     */
    public int getNumbers(String value){
        int sum = 0;
        if(isExist(value)){
            for (int i = 0; i < data.length; i++) {
                String string = data[i];
                if (string.equals(value))
                    sum = sum+1;
            }
        }
        return sum;       
    }

    public int sequentialSearch(String x) {
         for (int i = 0; i < data.length; i++) {
            String d = data[i];
            if (d.equals(x))
                return i;
        }
        return -1;
    } //akhir dari metode sequentialSearch(String x)

    public boolean isStringExist(String x) { //membuat metode isStringExist(String x)
        if(this.sequentialSearch(x)==-1) //persyaratan jika nilai parameter sama dengan -1
            return false; //mengembalikan nilai false
        else //persyaratan selain di atas
            return true; //mengembalikan nilai true
    } //akhir dari metode isStringExist(String x)
    
    public int binarySearch(String x) { //membuat metode binarySearch(double x) dengan parameter
        int indeksAwal = 0; //deklarasi & inisialisasi awal variabel indeksAwal, batas kiri
        int indeksAkhir = data.length - 1; //deklarasi & simpan rumus perhitungan ke variabel indeksAkhir, batas kanan
        while(indeksAwal <= indeksAkhir){ //kondisi perulangan untuk nilai yang dicari masih ada, indeksAwal kurang dari sama dengan indeksAkhir
            int nilaiTengah = (indeksAwal + indeksAkhir)/2; //deklarasi & simpan rumus perhitungan indeks tengah pada variabel nilaiTengah
            int sama = data[nilaiTengah].compareTo(x); //deklarasi & membandingkan dua string yakni array data dan x tersebut pada variabel sama 
            if(sama == 0){ //persyaratan jika nilai sama, sama dengan nilai x
                return nilaiTengah; //mengembalikan nilaitengah
            }
            else if(sama > 0){ //persyaratan jika nilai sama lebih dari 0
                indeksAkhir = nilaiTengah - 1; //eksekusi nilai indeksAkhir adalah perhitungan tersebut
            }
            else{ //persyaratan selain di atas
                indeksAwal = nilaiTengah + 1;  //eksekusi nilia indeksAwal adalah perhitungan tersebut
            }
        }
        return -1; //mengembalikan -1
    } //akhir dari metode binarySearch(String x)
    
} //akhir dari class MyStringLarik
