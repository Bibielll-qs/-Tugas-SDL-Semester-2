package com.sdl.stack; //menyimpan file ke package com.sdl.stack

import com.sdl.latihan.MyItem; //mengimport isi dari package com.sdl.latihan.MyItem

public class MyGenericStack<T> { //deklarasi class generic MyGenericStack
    private MyGenericNode<T> last; //atribut last pada class generic MyGenericNode
    private int size; // atribut menghitung jumlah/isi stack

    /**
     * Konstruktor default
     */
    public MyGenericStack() {
    }

    /**
     * Konstruktor
     * @param last
     * @param size 
     */
    public MyGenericStack(MyGenericNode<T> last, int size) {
        this.last = last;
        this.size = size;
    }

    /**
     * method getter
     * @return the last
     */
    public MyGenericNode<T> getLast() {
        return last;
    }

    /**
     * method setter
     * @param last the last to set
     */
    public void setLast(MyGenericNode<T> last) {
        this.last = last;
    }

    /**
     * method getter
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * method setter
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Fungsi memeriksa stack kosong atau tidak
     * jika stack kosong, maka true
     * jika stack tidak kosong, maka false
     * @return 
     */
    public boolean isEmpty(){
        if (this.last==null)
            return true;
        else
            return false;
    }
    
        /**
     * Fungsi push ke stack. setiap push, node last menjadi paling awal
     * @param node 
     */
    public void push(MyGenericNode<T> node){
        // cek stack kosong
        if (isEmpty()){
            last=node;
        } else{
            //stack tidak kosong
            node.setNext(this.last);
            this.last = node;
        }
        this.size ++;
    }
    
    
    /**
     * Fungsi pop, ambil node dari stack.
     * @return 
     */
    public MyGenericNode<T> pop(){
        // cek stack kosong
        if (last==null){
            return null;
        } else {
            //stack tidak kosong
            MyGenericNode result = this.last; //node paling atas disimpan di result
            this.last = result.getNext(); //data node paling atas disimpan
            result.setNext(null); //data node paling atas pada result dihilangkan
            this.size --; //maka ukuran stack berkurang
            return result; //mengembalikan hasil result setelah pop
        }
    }
    /**
     * Fungsi untuk menghitung total atribut numbers
     * @return 
     */
    public int getTotalNumbers(){
        int total = 0;
        if (isEmpty()) {
            return 0;
        }
        else{
        MyGenericNode<T> result = this.last;
        //iterasi pada stack
        while(result != null){
            MyItem temp = (MyItem)result.getData();
            total += temp.getNumbers();
            result = result.getNext();
        }
        return total;
        }
    }
    
     /**
     * Fungsi untuk menggabungkan atribut data semua node tanpa pop
     * @param args 
     */
    public String getTotalString(){
        String total = "";
        MyGenericNode<T> result = this.last;
        //iterasi pada stack
        while(result != null){
            MyItem temp = (MyItem)result.getData();
            total += temp.getItem();
            result = result.getNext();
        }
     
        return total;
    }
    
     /**
     * method menjalankan program, mencetak data stack
     * menggunakan method push untuk memasukkan data node pada stack
     * menggunakan method pop untuk mengeluarkan data node pada stack
     * @param args 
     */
    public static void main(String[] args) {
        // buat item
        MyItem item1 = new MyItem("A",4);
        // buat node
        MyGenericNode<MyItem> node1 = new MyGenericNode<MyItem>(item1,null); //mmebuat node1 berisi item1
        // test node
        String result = node1.getData().toString();
        System.out.println(result);
        
        //push ke stack generic
        MyItem item2 = new MyItem("B",3);
        MyItem item3 = new MyItem("C",2);
        MyItem item4 = new MyItem("D",1);
        MyGenericNode<MyItem> node2 = new MyGenericNode<MyItem>(item2,null);
        MyGenericNode<MyItem> node3 = new MyGenericNode<MyItem>(item3,null);
        MyGenericNode<MyItem> node4 = new MyGenericNode<MyItem>(item4,null);
        
        MyGenericStack<MyItem> stack = new MyGenericStack<>(); //membuat stack generic pad MyItem
        System.out.println("isEmpty = "+stack.isEmpty());
        
        stack.push(node1);
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);
        System.out.println("isEmpty = "+stack.isEmpty());
        System.out.println(stack.getSize());
        MyGenericNode<MyItem> node10 = stack.pop();
        System.out.println(node10.getData().toString());
        System.out.println("Jumlah total stack = "+stack.getTotalNumbers());
        System.out.println("Jumlah total string = "+stack.getTotalString());
    }
} //akhir dari class MyGenericStack
