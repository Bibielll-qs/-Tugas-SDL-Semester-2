package com.sdl.stack;


public class MyGenericNode<T> {
    private T data;
    private MyGenericNode<T> next;

    /**
     * Konstruktor
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
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public MyGenericNode<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(MyGenericNode<T> next) {
        this.next = next;
    }
}
