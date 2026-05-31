package com.sdl.ujian; //menyimpan file ke package com.sdl.ujian

public class AntrianTugas { //deklarasi class AntrianTugas
    private TugasNode first; //atribut private first bertipe TugasNode
    private TugasNode last; //atrbibut private last bertipe TugasNode
    private int noAntrian; //atribut private noAntrian bertipe integer
    /**
     * method constructor default
     */
    public AntrianTugas() {
        this.first = null;
        this.last = null;
        this.noAntrian = 0;
    }
    /**
     * method constructor berparameter
     * @param first
     * @param last
     * @param noAntrian 
     */
    public AntrianTugas(TugasNode first, TugasNode last, int noAntrian) {
        this.first = null;
        this.last = null;
        this.noAntrian = 0;
    }
    /**
     * method getter first
     * @return 
     */
    public TugasNode getFirst() {
        return first;
    }
    /**
     * method setter
     * @param first 
     */
    public void setFirst(TugasNode first) {
        this.first = first;
    }
    /**
     * method getter last
     * @return 
     */
    public TugasNode getLast() {
        return last;
    }
    /**
     * method setter
     * @param last 
     */
    public void setLast(TugasNode last) {
        this.last = last;
    }
    /**
     * method getter noAntrian
     * @return 
     */
    public int getNoAntrian() {
        return noAntrian;
    }
    /**
     * method setter
     * @param noAntrian 
     */
    public void setNoAntrian(int noAntrian) {
        this.noAntrian = noAntrian;
    }
    /**
     * fungsi membuat antrian baru, otomatis menambah noAntrian
     */
    public void buatAntrianBaru(){
        noAntrian++;
        Tugas tugas = new Tugas(noAntrian);
        TugasNode node = new TugasNode(tugas);

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }
    /**
     * fungsi memasukkan data tugas di akhir
     * @param tugas 
     */
    public void addLast(Tugas tugas){
        TugasNode node = new TugasNode(tugas);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node); 
            last = node;
        }
    }
    /**
     * fungsi menghapus data tugas 
     * @return 
     */
    public TugasNode delete(){
         //isi senarai baru satu
        if (!isEmpty()) {
            //isi senarai baru 1
            if (first == last) {
                TugasNode node = first;
                first = null;
                last = null;
                return node;
            }
            else{
                //isi senarai lebih 1
                TugasNode node = first;
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
     * fungsi cek isi antrian kosong
     * @return 
     */
    public boolean isEmpty(){
        if ((this.first == null) && (this.last == null))
            return true;
        else 
            return false;
    }
    /**
     * fungsi 
     * @param noAntrian
     * @param namaTugas
     * @param status 
     */
    public void updateStatusTugas(int noAntrian, String namaTugas, int status) {
       TugasNode current = first;
        while (current != null) {
            if (current.getData().getNoAntrian() == noAntrian) {
                current.getData().setKodePetugas(namaTugas); 
                current.getData().setStatus(status);
                return;
            }
            current = current.getNext();
        }
    }
    
    public AntrianTugas cariAntrian() {
        AntrianTugas hasil = new AntrianTugas();
        TugasNode current = first;
        while (current != null) {
            if (current.getData().getStatus() == 0) {
                Tugas t = new Tugas(current.getData().getNoAntrian());
                t.setKodePetugas(current.getData().getKodePetugas());
                t.setStatus(current.getData().getStatus());
                TugasNode newNode = new TugasNode(t);
                if (hasil.first == null) {
                    hasil.first = newNode;
                    hasil.last = newNode;
                } else {
                    hasil.last.setNext(newNode);
                    hasil.last = newNode;
                }
                hasil.noAntrian++;
            }
            current = current.getNext();
        }
        return hasil;
    }
    
} //akhir dari class AntrianTugas
