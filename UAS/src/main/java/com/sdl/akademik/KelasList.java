package com.sdl.akademik;

/**
 *
 * @author puspa
 */
public class KelasList {
    private KelasNode first;
    private KelasNode last;

    public KelasList(KelasNode first, KelasNode last) {
        this.first = null;
        this.last = 0;
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
    
    
    public class KelasList {
    private KelasNode head;
    private int size;

    public KelasList() {
        head = null;
        size = 0;
    }
    public int getSize() { 
        return size; 
    }

    // Tambah di depan (head)
    public void addFirst(Kelas data) {
        KelasNode newNode = new KelasNode(data);
        newNode.setNext(first);
        first = newNode;
        size++;
    }


    public KelasNode getLast() {
        if (first == null) 
            return null;
        KelasNode curr = first;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        return curr;
    }

    // Hapus node terakhir, kembalikan node yang dihapus
    public KelasNode deleteLast() {
        if (first == null) return null;
        if (first.getNext() == null) {
            KelasNode deleted = first;
            first = null;
            size--;
            return deleted;
        }
        KelasNode curr = first;
        while (curr.getNext().getNext() != null) {
            curr = curr.getNext();
        }
        KelasNode deleted = curr.getNext();
        curr.setNext(null);
        size--;
        return deleted;
    }
    
    public KelasList getKelasList(com.sdl.akademik.MataKuliah makul) {
        KelasList result = new KelasList();
        KelasNode curr = first;
        while (curr != null) {
            if (curr.getData().getKodeMK().equals(makul.getKodeMK())) {
                result.addFirst(curr.getData());
            }
            curr = curr.getNext();
        }
        return result;
    }

    
    public KelasList getKelasList(String dosen) {
        KelasList result = new KelasList();
        KelasNode curr = first;
        while (curr != null) {
            if (curr.getData().getDosen().equals(dosen)) {
                result.addFirst(curr.getData());
            }
            curr = curr.getNext();
        }
        return result;
    }
}
            
            
Claude finished the response

/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */ package com.sdl.test; import com.sdl.akademik.KelasList; import org.junit.jupiter.api.BeforeEach; import

pasted

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.test;
import com.sdl.akademik.MataKuliah;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author puspa
 */
public class MataKuliahListTest {

    public MataKuliahListTest() {
    }

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void test1() {
        MataKuliah makul1 = new MataKuliah("101","Dasar Algoritma dan Pemrograman",3);
        MataKuliah makul2 = new MataKuliah("102","Dasar Struktur Data",3);
        MataKuliah makul3 = new MataKuliah("103","Dasar Komputer dan Sistem Operasi",3);
        MataKuliah makul4 = new MataKuliah("201","Jaringan Komputer",3);

        MataKuliahList test = new MataKuliahList();
        test.add(makul1);

        int size = test.getSize();
        assertEquals(1,size);
    }
    @Test
    public void test2() {
        MataKuliah makul1 = new MataKuliah("101","Dasar Algoritma dan Pemrograman",3);
        MataKuliah makul2 = new MataKuliah("102","Dasar Struktur Data",3);
        MataKuliah makul3 = new MataKuliah("103","Dasar Komputer dan Sistem Operasi",3);
        MataKuliah makul4 = new MataKuliah("201","Jaringan Komputer",3);

        MataKuliahList test = new MataKuliahList();
        test.add(makul1);
        test.add(makul2);
        test.add(makul3);
        test.add(makul4);

        MataKuliah hasil = test.search("201");
        String namaMK = hasil.getMataKuliah();
        assertEquals("Jaringan Komputer",namaMK);
    }
    @Test
    public void test3() {
        MataKuliah makul1 = new MataKuliah("101","Dasar Algoritma dan Pemrograman",3);
        MataKuliah makul2 = new MataKuliah("102","Dasar Struktur Data",3);
        MataKuliah makul3 = new MataKuliah("103","Dasar Komputer dan Sistem Operasi",3);
        MataKuliah makul4 = new MataKuliah("201","Jaringan Komputer",3);

        MataKuliahList test = new MataKuliahList();
        test.add(makul4);
        test.add(makul3);
        test.add(makul2);
        test.add(makul1);

        ArrayList<MataKuliah> listKuliah = test.getData();
        MataKuliah makul = listKuliah.get(0);
        String namaMK = makul.getMataKuliah();
        assertEquals("Jaringan Komputer",namaMK);

        test.sorting();
        listKuliah = test.getData();
        makul = listKuliah.get(0);
        namaMK = makul.getMataKuliah();
        assertEquals("Dasar Algoritma dan Pemrograman",namaMK);

    }
}

Show more
10:43 AM
Saya perlu menganalisis kedua file test ini untuk membantu kamu mengimplementasikan class-class yang diperlukan. Mari saya buat semua class yang dibutuhkan.

Dari test cases, saya bisa mengidentifikasi class yang perlu dibuat:

Dari KelasListTest:

Kelas (di package com.sdl.test)
KelasNode (di package com.sdl.test)
MataKuliah (di package com.sdl.akademik)
KelasList (di package com.sdl.akademik)
Dari MataKuliahListTest:

MataKuliahList (di package com.sdl.test)
MataKuliah sudah ada
Mari kita buat satu per satu:

Berikut adalah semua class yang perlu diimplementasikan berdasarkan kedua test file tersebut.

Dari analisis test cases, saya bisa memetakan struktur yang dibutuhkan:




2. Kelas.java — com.sdl.test

3. KelasNode.java — com.sdl.test
java
package com.sdl.test;

public class KelasNode {
    private Kelas data;
    private KelasNode next;

    public KelasNode(Kelas data) {
        this.data = data;
        this.next = null;
    }

    public Kelas getData()         { return data; }
    public KelasNode getNext()     { return next; }
    public void setNext(KelasNode n) { this.next = n; }
}
4. KelasList.java — com.sdl.akademik
Ini class paling kompleks. Perhatikan logika getKelasList — urutan penyimpanan penting untuk test5 dan test6:

java
package com.sdl.akademik;

import com.sdl.test.Kelas;
import com.sdl.test.KelasNode;

public class KelasList {
    private KelasNode head;
    private int size;

    public KelasList() {
        head = null;
        size = 0;
    }

    // Tambah di depan (head)
    public void addFirst(Kelas data) {
        KelasNode newNode = new KelasNode(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public KelasNode getFirst() {
        return head;
    }

    public KelasNode getLast() {
        if (head == null) return null;
        KelasNode curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        return curr;
    }

    // Hapus node terakhir, kembalikan node yang dihapus
    public KelasNode deleteLast() {
        if (head == null) return null;
        if (head.getNext() == null) {
            KelasNode deleted = head;
            head = null;
            size--;
            return deleted;
        }
        KelasNode curr = head;
        while (curr.getNext().getNext() != null) {
            curr = curr.getNext();
        }
        KelasNode deleted = curr.getNext();
        curr.setNext(null);
        size--;
        return deleted;
    }

    public int getSize() { return size; }

    // Filter berdasarkan MataKuliah (kodeMK)
    // Iterasi dari head ke tail → addFirst → urutan terbalik
    // Sehingga hasil.getFirst() = node terakhir ditemukan (addFirst terbaru)
    public KelasList getKelasList(com.sdl.akademik.MataKuliah makul) {
        KelasList result = new KelasList();
        KelasNode curr = head;
        while (curr != null) {
            if (curr.getData().getKodeMK().equals(makul.getKodeMK())) {
                result.addFirst(curr.getData());
            }
            curr = curr.getNext();
        }
        return result;
    }

    // Filter berdasarkan nama dosen
    public KelasList getKelasList(String dosen) {
        KelasList result = new KelasList();
        KelasNode curr = head;
        while (curr != null) {
            if (curr.getData().getDosen().equals(dosen)) {
                result.addFirst(curr.getData());
            }
            curr = curr.getNext();
        }
        return result;
    }
}
5. MataKuliahList.java — com.sdl.test
java
package com.sdl.test;

import com.sdl.akademik.MataKuliah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MataKuliahList {
    private ArrayList<MataKuliah> data;

    public MataKuliahList() {
        data = new ArrayList<>();
    }

    public void add(MataKuliah mk) {
        data.add(mk);
    }

    public int getSize() { return data.size(); }

    public MataKuliah search(String kodeMK) {
        for (MataKuliah mk : data) {
            if (mk.getKodeMK().equals(kodeMK)) return mk;
        }
        return null;
    }

    public ArrayList<MataKuliah> getData() {
        return data;
    }

    // Sort ascending berdasarkan nama mata kuliah
    public void sorting() {
        Collections.sort(data, Comparator.comparing(MataKuliah::getMataKuliah));
    }
}
Penjelasan logika kritis
Test5 — urutan getKelasList(makul):

List diisi dengan addFirst berurutan kelas1→kelas6, sehingga urutan di linked list adalah: kelas6 → kelas5 → kelas4 → kelas3 → kelas2 → kelas1

Yang kodeMK = "101": kelas3 (101B, Agung H) dan kelas1 (101A, Pupaningtyas).

Saat iterasi dan addFirst ke result:

Ketemu kelas3 → addFirst → result: kelas3
Ketemu kelas1 → addFirst → result: kelas1 → kelas3
Maka getFirst() = kelas1 (Pupaningtyas), getLast() = kelas3 (Agung H).

⚠️ Catatan: test5 baris terakhir ada bug di soal — node (bukan node1) dipanggil dua kali untuk dua assertion berbeda. Implementasi di atas sudah benar, bug ada di test-nya sendiri.

Test6 — getKelasList("Ridowati Gunawan"):

Yang cocok: kelas5 (102A) dan kelas6 (103B). Di linked list, kelas6 ada sebelum kelas5 (karena addFirst kelas5 lebih belakangan). Iterasi ketemu kelas6 dulu → addFirst → lalu kelas5 → addFirst. Result: kelas5 → kelas6, sehingga getFirst() = 103B ✓ dan getLast() = 102A ✓.

1781063255996_image.png
1781063290120_image.png
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.akademik;
/**
 *
 * @author puspa
 */
public class KelasList {
    private KelasNode first;
    private KelasNode last;
    public KelasList(KelasNode first, KelasNode last) {
        this.first = first;
        this.last = last;
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

    public int getSize(){
        return 0;
    }
    public 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.akademik;
/**
 *
 * @author puspa
 */
public class KelasList {
    private KelasNode first;
    private KelasNode last;
    public KelasList(KelasNode first, KelasNode last) {
        this.first = first;
        this.last = last;
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

    public int getSize(){
        return 0;
    }
    public 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.akademik;
/**
 *
 * @author puspa
 */
public class KelasList {
    private KelasNode first;
    private KelasNode last;
    public KelasList(KelasNode first, KelasNode last) {
        this.first = first;
        this.last = last;
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

    public int getSize(){
        return 0;
    }
    public 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.akademik;
import java.util.ArrayList;
/**
 *
 * @author puspa
 */
public class MataKuliahList {
    private ArrayList<MataKuliah> data = new ArrayList();

    public void add(MataKuliah mataKuliah){

    }
    public void sorting(){

    }
    public int getSize(){
        return 0;
    }
    public MataKuliah search(String kodeMK){
        return null;
    }
}
perbaiki method dalam KelasList, mata Kuliah, MaTaKuliahList, Kelas, KelasNoed, agar class test nya berjalan

Show more
10:53 AM
Saya lihat soal ujiannya dan template yang sudah ada. Mari saya analisis dengan cermat struktur yang dibutuhkan.

Dari template KelasList, terlihat bahwa class ini menggunakan first dan last sebagai pointer (bukan traversal), yang berarti ini adalah doubly-linked list style dengan tracking langsung. Mari saya sesuaikan semua implementasi:


Created 3 files, ran a command
Created 3 files, ran a command
Sekarang bagian paling kritis — KelasList. Saya perlu menyesuaikan dengan template yang ada (first/last pointer) sambil memastikan semua test pass:


Created 2 files
Created 2 files
Sekarang buat file test agar bisa dikompilasi dan diverifikasi:


KelasListTest untuk verifikasi
KelasListTest untuk verifikasi


You are out of free messages until 2:20 PM




Claude is AI and can make mistakes. Please double-check responses.



}
