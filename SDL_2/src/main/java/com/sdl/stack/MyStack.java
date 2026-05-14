package com.sdl.stack; //menyimpan file ke package com.sdl.stack

public class MyStack { //deklarasi class MyStack
    private MyNode last; // obyek last berkelas MyNode
    private int size; // atribut menghitung jumlah/isi stack
    /**
     * Konstruktor default
     */
    public MyStack() { //method constructor default  MyStack()
    } //
    
    /**
     * Fungsi memeriksa stack kosong atau tidak
     * @return 
     */
    public boolean isEmpty(){
        return last == null; // mengembalikan hasil last dalam stack null/kosong
        //return true;
    }
    /**
     * Fungsi push ke stack. setiap push, node last menjadi paling awal
     * @param node 
     */
    public void push(MyNode node){
        // cek stack kosong
        if (isEmpty()){
            last=node;
            //this.size=1;
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
    public MyNode pop(){
        // cek stack kosong
        if (last==null){
            return null;
        } else {
            //stack tidak kosong
            MyNode result = this.last;
            this.last = result.getNext();
            result.setNext(null);
            this.size --;
            return result;
        }
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
     * Fungsi untuk menghitung total atribut numbers
     * @return 
     */
    public int getTotalNumbers(){
        int total = 0;
         MyNode result = this.last;
        //iterasi pada stack
        while(result != null){
            total += result.getNumbers();
            result = result.getNext();
        }
     
        return total;
    }
    
    /**
     * Fungsi untuk menggabungkan atribut data semua node tanpa pop
     * @param args 
     */
    public String getTotalString(){
        if (isEmpty()) {
            return null;
        }
        String total = "";
        MyNode result = this.last;
        
        while(result != null){
            total += result.getItem();
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
        MyStack stack = new MyStack();
        MyNode node1 = new MyNode(null,"A",4);
        MyNode node2 = new MyNode(null,"B",3);
        MyNode node3 = new MyNode(null,"C",2);
        MyNode node4 = new MyNode(null,"D",1);
        
        // test stack isi satu node
        stack.push(node1);
        MyNode node5 = stack.pop();
        System.out.println(node5);
        MyNode node6 = stack.pop();
        System.out.println(node6);
        
        // test stack diisi banyak node
        stack.push(node1); // push stack
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);
        node5 = stack.pop(); // pop stack
        System.out.println(node5);
        int result = stack.getTotalNumbers();
        System.out.println("Total = "+result);
        String totalData = stack.getTotalString();
        System.out.println("Data string = "+totalData);
    }
} //akhir dari class MyStack



/**
 * public int getTotalNumbers(){
    int total = 0;

    MyNode result = this.last;
 *  while(result != null){
 *      total += result.getNumbers();
 *      result = result.getNext();
 *      }
 * return total;
 * }
 * 
 * public int getTotalNumbers(){
        int total = 0;
         MyNode result = this.last;
        //iterasi pada stack
        for (int i = 0; i < this.getSize(); i++) {
            total += result.getNumbers();
            result = result.getNext();
        }
        
        return total;
    }
 */