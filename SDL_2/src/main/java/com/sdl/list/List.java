package com.sdl.list; //menyimpan file ke package com.sdl.list

/**
 *
 * @author puspa
 */
public class List{ //deklarasi class List
    //membuat atribut class List
    private ListNode first; //atribut firt bertipe ListNode
    private ListNode last; //atribut last bertipe ListNode
    private String name; //atribut name bertipe String

    /**
     * Konstruktor
     */
    public List() {
        this.first=null;
        this.last = null;
    }
   

    /**
     * method getter
     * @return the first
     */
    public ListNode getFirst() {
        return first;
    }

    /**
     * method setter
     * @param first the first to set
     */
    public void setFirst(ListNode first) {
        this.first = first;
    }

    /**
     * method getter
     * @return the last
     */
    public ListNode getLast() {
        return last;
    }

    /**
     * method setter
     * @param last the last to set
     */
    public void setLast(ListNode last) {
        this.last = last;
    }

    /**
     * method getter
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * method setter
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Fungsi cek list kosong
     * @return 
     */
    public boolean isEmpty(){
        if ((this.first == null) && (this.last == null))
            return true;
        else 
            return false;
    }
    
    /**
     * Fungsi tambah item di awal
     * @param item 
     */
    public void addFirst(ListNode node){
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
     * Fungsi tambah item di akhir
     * @param item 
     */
    public void addLast(ListNode node){
        if (isEmpty()) {
            first = node;
            last = node;
        }
        else{
            last.setNext(node);
            last = node;
        }
    }
    
    /**
     * Fungsi hapus awal
     * @return 
     */
    public ListNode deleteFirst(){
        //isi senarai baru satu
        if (!isEmpty()) {
            //isi senarai baru 1
            if (first == last) {
                ListNode node = first;
                first = null;
                last = null;
                return node;
            }
            else{
                //isi senarai lebih 1
                ListNode node = first;
                first = first.getNext();
                
                return node;
            }
        }
        else{
            //senarai kosong
            return null;
        }
    }
    
    /**
     * Fungsi hapus akhir
     * @return 
     */
    public ListNode deleteLast(){
        if (!isEmpty()) {
            //isi senarai baru 1
            if (last == first) {
                ListNode node = last;
                last = null;
                first = null;
                return node;
            }
            else{
                ListNode temp = first;
                while(temp.getNext() != last){
                    temp = temp.getNext();
                }
                ListNode node = last;
                temp.setNext(null);
                last = temp;
                return node;
            }
        }
        
            return null;
    }
    
    
    /**
     * Fungsi hitung ukuran list
     * @return 
     */
    public int getSize(){
        ListNode temp = first;
        int size = 0;
        while(temp !=null){
            size++;
            temp = temp.getNext();
        }
        return size;
    }
    
    /**
     * Fungsi untuk menghitung seluruh atribut numbers dari node
     * @return 
     */
    public int getSumOfTotalNumbers(){
        ListNode temp = first;
        int sum = 0;
        while(temp != null){
            sum = sum + temp.getData().getNumbers();
            temp = temp.getNext();
        }
        return sum;
    }
    
    /**
     * Fungsi untuk mengubah semua node ke string dari node first sampai last.
     * @return 
     */
    public String toString(){
        ListNode temp = first;
        String result = "";
        while(temp != null){
           result = result + temp.getData().toString();
            temp = temp.getNext();
        }
        return result;
    }
} //akhir dari class List
