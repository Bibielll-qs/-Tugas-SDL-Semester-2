package com.sdl.stack; //menyimpan file ke package com.sdl.stack

public class MyGenericNode<T> { //deklarasi class generic MyGenericNode<T>
    //membuat atribut class generic MyGenericNode<T>
    private T data; //mmebuat atribut data bertipe T (Type), bisa diisi tipe data apa saja
    private MyGenericNode<T> next; //membuat atribut next bertipe generic pada class MyGenericNode<T>

    /**
     * Konstruktor default
     */
    public MyGenericNode() {
    }

    /**
     * Konstruktor
     * @param data
     * @param next 
     */
    public MyGenericNode(T data, MyGenericNode<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * method getter
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * method setter
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * method getter
     * @return the next
     */
    public MyGenericNode<T> getNext() {
        return next;
    }

    /**
     * method setter
     * @param next the next to set
     */
    public void setNext(MyGenericNode<T> next) {
        this.next = next;
    }
} //akhir dari class MyGenericNode
