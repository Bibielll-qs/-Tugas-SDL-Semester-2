package com.sdl.latihan; //menyimpan file ke package com.sdl.latihan

/**
 *
 * @author user
 */
public class MyItem { //deklarasi class MyItem
    private String item; // data item bertipe string. dapat diisi misalnya nama negara, nama prodi, nama sekolah, dll
    private int numbers; // data numbers bertipe int, dapat diisi data jumlah item seperti jumlah penduduk negara, jumlah mahasiswa prodi, dll

    /**
     * Konstruktor
     */
    public MyItem() {
    }

    /**
     * Konstruktor dengan parameter data item dan numbers
     * @param item
     * @param numbers 
     */
    public MyItem(String item, int numbers) {
        this.item = item;
        this.numbers = numbers;
    }

    /**
     * method getter
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * method setter
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * method getter
     * @return the numbers
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * method setter
     * @param numbers the numbers to set
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     * method String data
     * @return 
     */
    @Override
    public String toString() {
        return  item + " = " + numbers;
    }
    
}
