package com.sdl.latihan;


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
    public int getDataSize(){
        return data.length;
    }
    
    /**
     * Fungsi untuk mencari posisi item. Luaran fungsi adalah indeks item. Jika tidak ada, luarannya -1.
     * @param item
     * @return 
     */
    public int itemSearch(String item){
        for (int i = 0; i < data.length; i++) {
            if (data[i].getItem().equals(item)) {
                return i;
            }
        }
        return -1;
    }
    
    public MyItem[] getChangeData(MyItem[] item, int indeks_a, int indeks_b){
        MyItem temp = item[indeks_a];
        item[indeks_a] = item[indeks_b];
        item[indeks_b] = temp;
        return item;
    }
    
    public void cetakData(MyItem d) {
        for (int i = 0; i < data.length; i++) {
            d = data[i];
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
        for (int i = 0; i < data.length - 1; i++) {
            
            for (int j = 0; j < data.length  - i - 1; j++) {
                if(type == 0){
                    if (data[j].getItem().compareTo(data[j+1].getItem()) > 0) {
                        MyItem temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                    }
                }
                else if (type == 1) {
                    if (data[j].getNumbers() > data[j+1].getNumbers()) {
                        getChangeData(data, j, j+1);
                    }
                }
            }
        }
        
    }
    
    /**
     * Fungsi untuk menghitung jumlahan dari atribut numbers pada item yang sama
     * @return 
     */
    public MyItemLarik getItemSum(){
      MyItemLarik array = new MyItemLarik(data.length);
      int indeks = 0;
        for (int i = 0; i < data.length; i++) {
            String merekMie = data[i].getItem();
            int banyakMie = data[i].getNumbers();
            boolean tidakAda = false;
            for (int j = 0; j < indeks; j++) {
                if (array.getData()[j].getItem().equals(merekMie)) {
                    array.getData()[j].setNumbers(array.getData()[j].getNumbers()+ banyakMie);
                    tidakAda  = true;
                    break;
                }
                
            }
            if (!tidakAda ) {
                array.getData()[indeks] = new MyItem(merekMie,banyakMie);
                indeks++;
            }
        }
        MyItemLarik arraybaru = new MyItemLarik(indeks);
        for (int i = 0; i < indeks; i++) {
            arraybaru.getData()[i] = array.getData()[i];
        }
        return arraybaru;
    }
    
    /**
     * fungsi untuk menghitung jumlahan dari atribut numbers pada item yang sama (berparameter)
     * @param item
     * @return 
     */
    public MyItemLarik getItemSum2(MyItem[] item) {
        MyItemLarik array = new MyItemLarik(data.length);
         int indeks = 0;
        for (int i = 0; i < data.length; i++) {
            String merekMie = data[i].getItem();
            int banyakMie = data[i].getNumbers();
            boolean tidakAda = false;
            for (int j = 0; j < indeks; j++) {
                if (array.getData()[j].getItem().equals(merekMie)) {
                    array.getData()[j].setNumbers(array.getData()[j].getNumbers()+ banyakMie);
                    tidakAda  = true;
                    break;
                }
                
            }
            if (!tidakAda ) {
                array.getData()[indeks] = new MyItem(merekMie,banyakMie);
                indeks++;
            }
        }
        MyItemLarik arraybaru = new MyItemLarik(indeks);
        for (int i = 0; i < indeks; i++) {
            arraybaru.getData()[i] = array.getData()[i];
        }
        return arraybaru;
    }
}
