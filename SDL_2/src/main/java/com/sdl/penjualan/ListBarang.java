package com.sdl.penjualan; //menyimpan file ke package com.sdl.penjualan

/**
 *
 * @author LENOVO
 */
public class ListBarang { //deklarasi class ListBarang
    //buat atribut
    private BarangNode first; //atribut first bertipe BarangNode
    private BarangNode last; //atribut last bertipe BarangNode
    /**
     * method getter
     * @return 
     */
    public BarangNode getFirst() {
        return first;
    }
    /**
     * method setter
     * @param first 
     */
    public void setFirst(BarangNode first) {
        this.first = first;
    }
    /**
     * method getter
     * @return 
     */
    public BarangNode getLast() {
        return last;
    }
    /**
     * method setter
     * @param last 
     */
    public void setLast(BarangNode last) {
        this.last = last;
    }
    /**
     * fungsi memasukkan/menambah node ke dalam list di awal
     * @param node 
     */
    public void add(BarangNode node){
        if (isEmpty()) {
            first = node;
            last = node;
        }
        else{
            node.setNext(first);
            first = node;
        }
    }
    /**
     * fungsi menghapus node dalam list awal
     * @return 
     */
    public BarangNode delete(){
         //isi senarai baru satu
        if (!isEmpty()) { //jika list tidak kosong
            //isi senarai baru 1
            if (first == last) { //jika first sama dengan last
                BarangNode node = first; //node menjadi first
                first = null; //saat first bernilai null
                last = null; //saat last bernilai null
                return node;
            }
            else{ //selain di atas
                //isi senarai lebih 1
                BarangNode node = first;
                first = first.getNext();
                
                return node;
            }
        }
        else{ //selain di atas
            //senarai kosong
            return null;
        }
    }
    /**
     * fungsi cek list kosong
     * @return 
     */
    public boolean isEmpty(){
         if ((this.first == null) && (this.last == null))
            return true;
        else 
            return false;
    }
} //akhir dari class ListBarang