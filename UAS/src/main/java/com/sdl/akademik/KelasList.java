package com.sdl.akademik;

public class KelasList {
    private KelasNode first;
    private KelasNode last;
    private int size;

    public KelasList() {       
        this.first = null;
        this.last  = null;
        this.size  = 0;
    }

    public KelasNode getFirst() { 
        return first; 
    }
    public void setFirst(KelasNode first) { 
        this.first = first; 
    }
    public KelasNode getLast() { 
        return last; 
    }
    public void setLast(KelasNode last) { 
        this.last = last; 
    }
    public int getSize() { 
        return size; 
    }

    public void addFirst(Kelas data) {
        KelasNode newNode = new KelasNode(data);
        if (first == null) {
            first = newNode;
            last  = newNode;
        } 
        else {
            newNode.setNext(first);
            first = newNode;
        }
        size++;
    }
    
    public void addLast(Kelas data) {
        KelasNode newNode = new KelasNode(data);
            if (first == null) {
                first = newNode;
                last  = newNode;
            }
            else {
                last.setNext(newNode);
                last = newNode;
        }
        size++;
    }
    
    public KelasNode deleteLast() {
        if (first == null) {
            return null;
        }
        KelasNode hasil;
        if (first == last) {          
            hasil = first;
            first = null;
            last  = null;
        } else {
            KelasNode temp = first;
            while (temp.getNext() != last) {
                temp = temp.getNext();
            }
            hasil = last;
            temp.setNext(null);
            last = hasil;
        }
        size--;
        return hasil;
    }
    
    public KelasList getKelasList(MataKuliah matkul) {
        KelasList result = new KelasList();
        KelasNode temp = first;
        while (temp != null) {
            if (temp.getData().getKodeMK().equals(matkul.getKodeMK())) {
                result.addLast(temp.getData()); 
            }
            temp = temp.getNext();
        }
        return result;
    }


    public KelasList getKelasList(String dosen) {
        KelasList result = new KelasList();
        KelasNode temp = first;
        while (temp != null) {
            if (temp.getData().getNamaDosen().equals(dosen)) {
                result.addLast(temp.getData());  
            }
            temp = temp.getNext();
        }
        return result;
    }
}