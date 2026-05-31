package com.sdl.test; //menyimpan file ke package com.sdl.test

import com.sdl.ujian.AntrianTugas; //import isi dari class AntrianTugas
import com.sdl.ujian.Tugas; //import isi dari class Tugas
import com.sdl.ujian.TugasNode; //import isi dari class TugasNode
import org.junit.jupiter.api.BeforeEach; //mengimport annotation @BeforeEach dari JUnit5
import org.junit.jupiter.api.Test; //mengimport annotation @Test dari JUnit5 untuk menandai metode sebagai unit test
import static org.junit.jupiter.api.Assertions.*; //mengimport kemampuan dari kelas metode sebagai unit test


public class AntrianTugasTest { //deklarasi class AntrianTugasTest
    /**
     * method constructor default
     */
    public AntrianTugasTest() {
    }
    
    @BeforeEach //anotasi dalam JUnit5, menandai sebuah metode dijalankan sebelum setiap metode pengujian
    public void setUp() {
    }
    
    @Test //metode untuk mengetes program pada file
    public void test1(){ //method test1
        AntrianTugas antrian = new AntrianTugas(); //buat antrian pada AntrianTugas
        antrian.buatAntrianBaru(); //membuat antrian baru pada AntrianTugas
        int noAntrian = antrian.getNoAntrian(); //menyimpan data nomor antrian pada noAntrian
        assertEquals(1,noAntrian); //mengecek apakah noAntrian berisi 1 antrian baru, dengan nomor 1
    }
    
    @Test //metode untuk mengetes program pada file
    public void test2(){ //method test2
        AntrianTugas antrian = new AntrianTugas(); //buat antrian pada AntrianTugas
        //membuat antrian baru pada AntrianTugas sebanyak 3 antrian
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrian(); //menyimpan data nomor antrian pada noAntrian
        assertEquals(3,noAntrian); //mengecek apakah noAntrian berisi 3 antrian baru, dengan nomor sampai 3
    }
    
    @Test //metode untuk mengetes program pada file
    public void test3(){ //method test3
        AntrianTugas antrian = new AntrianTugas(); //buat antrian pada AntrianTugas
        //membuat antrian baru pada AntrianTugas sebanyak 3 antrian
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrian(); //menyimpan data nomor antrian pada noAntrian
        assertEquals(3,noAntrian); //mengecek apakah noAntrian berisi 3 antrian baru, dengan nomor sampai 3
        
        antrian.updateStatusTugas(1,"T1",1); //mengupdate status pada antrian dengan isi argument dengan method updateStatusTugas()
        TugasNode node = antrian.getFirst(); //objek node berisi data pertama pada antrian
        Tugas tugas = node.getData(); //objek tugas berisi data node
        int status = tugas.getStatus(); //variabel status berisi status pada objek tugas, berisi argument antrian
        assertEquals(1,status); //mengecek apakah status bernilai 1, petugas sedang bekerja
    }
    
    @Test //metode untuk mengetes program pada file
    public void test4(){ //method test4
        AntrianTugas antrian = new AntrianTugas(); //buat antrian pada AntrianTugas
        //membuat antrian baru pada AntrianTugas sebanyak 3 antrian
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrian(); //menyimpan data nomor antrian pada noAntrian
        assertEquals(3,noAntrian); //mengecek apakah noAntrian berisi 3 antrian baru
       
        antrian.updateStatusTugas(1,"T1",2); //mengupdate status pada antrian dengan isi argument dengan method updateStatusTugas()
        TugasNode node = antrian.getFirst(); //objek node berisi data pertama pada antrian
        Tugas tugas = node.getData(); //objek tugas berisi data node
        int status = tugas.getStatus(); //variabel status berisi status pada objek tugas, berisi argument antrian
        assertEquals(2,status); //mengecek apakah status bernilai 2, pekerjaan selesai
    }
    
    @Test //metode untuk mengetes program pada file
    public void test5(){ //method test5
        AntrianTugas antrian = new AntrianTugas(); //buat antrian pada AntrianTugas
        //membuat antrian baru pada AntrianTugas sebanyak 3 antrian
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrian(); //menyimpan data nomor antrian pada noAntrian
        assertEquals(3,noAntrian); //mengecek apakah noAntrian berisi 3 antrian baru, dengan nomor sampai 3
        
        antrian.updateStatusTugas(1,"T1",2); //mengupdate status pada antrian dengan isi argument dengan method updateStatusTugas()
        TugasNode node = antrian.getFirst(); //objek node berisi data pertama pada antrian
        Tugas tugas = node.getData(); //objek tugas berisi data node
        int status = tugas.getStatus(); //variabel status berisi status pada objek tugas, berisi argument antrian
        assertEquals(2,status); //mengecek apakah status bernilai 2, pekerjaan selesai
        
        AntrianTugas antrian1 = antrian.cariAntrian(); //membuat antrian1 untuk mencari antrian dengan method cariAntrian()
        TugasNode node1 = antrian1.getFirst(); //objek node1 berisi data pertama pada antrian1
        Tugas tugas1 = node1.getData(); //objek tugas1 berisi data node1
        status = tugas1.getStatus(); //variabel status berisi status pada objek tugas1, berisi antrian
        noAntrian = tugas1.getNoAntrian(); //objek noAntrian berisi nomor antrian tugas1
        assertEquals(0,status); //mengecek apakah status bernilai 0, pelanggan mengantri
        assertEquals(2,noAntrian); //mengecek apakah noAntrian bernilai 2, nomor antrian 1 sampai 2
    }
    
    @Test //metode untuk mengetes program pada file
    public void test6(){ //method test6
        AntrianTugas antrian = new AntrianTugas();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        antrian.buatAntrianBaru();
        
        int noAntrian = antrian.getNoAntrian(); //menyimpan data nomor antrian pada noAntrian
        assertEquals(3,noAntrian); //mengecek apakah noAntrian berisi 3 antrian baru
        
        antrian.updateStatusTugas(1,"T1",2); //mengupdate status pada antrian dengan isi argument dengan method updateStatusTugas()
        TugasNode node = antrian.getFirst(); //objek node berisi data pertama pada antrian1
        Tugas tugas = node.getData(); //objek tugas berisi data node
        int status = node.getStatus(); //variabel status berisi status pada objek tugas, berisi argument antrian
        assertEquals(2,status); //mengecek apakah status bernilai 2, pekerjaan selesai
        
        AntrianTugas antrian1 = antrian.cariAntrian(); //membuat antrian1 untuk mencari antrian dengan method cariAntrian()
        TugasNode node1 = antrian1.getLast(); //objek node1 berisi data pertama pada antrian1
        Tugas tugas1 = node1.getData(); //objek tugas1 berisi data node1
        status = tugas1.getStatus(); //variabel status berisi status pada objek tugas1, berisi antrian
        noAntrian = tugas1.getNoAntrian(); //objek noAntrian berisi nomor antrian tugas1
        assertEquals(0,status); //mengecek apakah status bernilai 0AntrianTugasTest
        assertEquals(3,noAntrian); //mengecek apakah noAntrian bernilai 3, nomor antrian 1 sampai 3
    }
} //akhir dari class AntrianTugasTest
