
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

/**
 * AlgoritmaTest.java
 * Class pengujian @Test untuk review UTS.
 * Materi: Rekursif, Searching (Sequential, Binary, Interpolation), Sorting (Bubble, Selection, Insertion)
 *
 * Cara menjalankan:
 *   - Dengan Maven : mvn test
 *   - Dengan IDE   : klik kanan file -> Run as JUnit Test
 *
 * Dependensi (pom.xml / build.gradle):
 *   JUnit Jupiter 5.x  ->  org.junit.jupiter:junit-jupiter:5.10.0
 */
@DisplayName("📚 UTS Review — Algoritma & Struktur Data")
public class AlgoritmaTest {

    // =========================================================================
    // BAGIAN 1: REKURSIF
    // =========================================================================

    @Nested
    @DisplayName("🔁 Rekursif")
    class RekursifTest {

        @Test
        @DisplayName("faktorial(0) harus 1 (base case)")
        void testFaktorialBaseCase() {
            assertEquals(1L, AlgoritmaMethods.faktorial(0),
                "faktorial(0) seharusnya 1");
        }

        @Test
        @DisplayName("faktorial(1) harus 1")
        void testFaktorial1() {
            assertEquals(1L, AlgoritmaMethods.faktorial(1));
        }

        @Test
        @DisplayName("faktorial(5) harus 120")
        void testFaktorial5() {
            assertEquals(120L, AlgoritmaMethods.faktorial(5));
        }

        @Test
        @DisplayName("faktorial(10) harus 3628800")
        void testFaktorial10() {
            assertEquals(3628800L, AlgoritmaMethods.faktorial(10));
        }

        // ----- Fibonacci -----

        @Test
        @DisplayName("fibonacci(0) harus 0 (base case)")
        void testFibonacciBase0() {
            assertEquals(0L, AlgoritmaMethods.fibonacci(0));
        }

        @Test
        @DisplayName("fibonacci(1) harus 1 (base case)")
        void testFibonacciBase1() {
            assertEquals(1L, AlgoritmaMethods.fibonacci(1));
        }

        @Test
        @DisplayName("fibonacci(6) harus 8")
        void testFibonacci6() {
            assertEquals(8L, AlgoritmaMethods.fibonacci(6));
        }

        @Test
        @DisplayName("fibonacci(10) harus 55")
        void testFibonacci10() {
            assertEquals(55L, AlgoritmaMethods.fibonacci(10));
        }

        // ----- Pangkat -----

        @Test
        @DisplayName("pangkat(2, 0) harus 1 (base case)")
        void testPangkatExp0() {
            assertEquals(1L, AlgoritmaMethods.pangkat(2, 0));
        }

        @Test
        @DisplayName("pangkat(2, 10) harus 1024")
        void testPangkat2Exp10() {
            assertEquals(1024L, AlgoritmaMethods.pangkat(2, 10));
        }

        @Test
        @DisplayName("pangkat(3, 4) harus 81")
        void testPangkat3Exp4() {
            assertEquals(81L, AlgoritmaMethods.pangkat(3, 4));
        }

        // ----- Jumlah Array -----

        @Test
        @DisplayName("jumlahArray array kosong harus 0")
        void testJumlahArrayKosong() {
            assertEquals(0, AlgoritmaMethods.jumlahArray(new int[]{}, 0));
        }

        @Test
        @DisplayName("jumlahArray {1,2,3,4,5} harus 15")
        void testJumlahArray() {
            assertEquals(15, AlgoritmaMethods.jumlahArray(new int[]{1, 2, 3, 4, 5}, 0));
        }

        @Test
        @DisplayName("jumlahArray satu elemen harus nilai itu sendiri")
        void testJumlahArraySatuElemen() {
            assertEquals(42, AlgoritmaMethods.jumlahArray(new int[]{42}, 0));
        }
    }

    // =========================================================================
    // BAGIAN 2: SEARCHING
    // =========================================================================

    @Nested
    @DisplayName("🔍 Searching")
    class SearchingTest {

        // Data untuk searching
        final int[] arrayAcak    = {64, 25, 12, 22, 11, 90, 43};      // tidak terurut
        final int[] arrayTerurut = {10, 20, 30, 40, 50, 60, 70, 80};  // terurut ascending

        // ---- Sequential Search ----

        @Test
        @DisplayName("Sequential: menemukan elemen di awal array")
        void testSeqDiAwal() {
            assertEquals(0, AlgoritmaMethods.sequentialSearch(arrayAcak, 64));
        }

        @Test
        @DisplayName("Sequential: menemukan elemen di tengah array")
        void testSeqDiTengah() {
            assertEquals(3, AlgoritmaMethods.sequentialSearch(arrayAcak, 22));
        }

        @Test
        @DisplayName("Sequential: menemukan elemen di akhir array")
        void testSeqDiAkhir() {
            assertEquals(6, AlgoritmaMethods.sequentialSearch(arrayAcak, 43));
        }

        @Test
        @DisplayName("Sequential: elemen tidak ditemukan harus -1")
        void testSeqTidakDitemukan() {
            assertEquals(-1, AlgoritmaMethods.sequentialSearch(arrayAcak, 999));
        }

        @Test
        @DisplayName("Sequential: array satu elemen, cocok")
        void testSeqSatuElemenCocok() {
            assertEquals(0, AlgoritmaMethods.sequentialSearch(new int[]{7}, 7));
        }

        // ---- Binary Search ----

        @Test
        @DisplayName("Binary: menemukan elemen pertama (index 0)")
        void testBinaryDiAwal() {
            assertEquals(0, AlgoritmaMethods.binarySearch(arrayTerurut, 10));
        }

        @Test
        @DisplayName("Binary: menemukan elemen tengah")
        void testBinaryDiTengah() {
            assertEquals(3, AlgoritmaMethods.binarySearch(arrayTerurut, 40));
        }

        @Test
        @DisplayName("Binary: menemukan elemen terakhir")
        void testBinaryDiAkhir() {
            assertEquals(7, AlgoritmaMethods.binarySearch(arrayTerurut, 80));
        }

        @Test
        @DisplayName("Binary: elemen tidak ditemukan harus -1")
        void testBinaryTidakDitemukan() {
            assertEquals(-1, AlgoritmaMethods.binarySearch(arrayTerurut, 35));
        }

        @Test
        @DisplayName("Binary: nilai lebih kecil dari semua elemen harus -1")
        void testBinaryLebihKecil() {
            assertEquals(-1, AlgoritmaMethods.binarySearch(arrayTerurut, 1));
        }

        @Test
        @DisplayName("Binary: nilai lebih besar dari semua elemen harus -1")
        void testBinaryLebihBesar() {
            assertEquals(-1, AlgoritmaMethods.binarySearch(arrayTerurut, 100));
        }

        // ---- Interpolation Search ----

        @Test
        @DisplayName("Interpolation: menemukan elemen pertama")
        void testInterpDiAwal() {
            assertEquals(0, AlgoritmaMethods.interpolationSearch(arrayTerurut, 10));
        }

        @Test
        @DisplayName("Interpolation: menemukan elemen tengah")
        void testInterpDiTengah() {
            assertEquals(4, AlgoritmaMethods.interpolationSearch(arrayTerurut, 50));
        }

        @Test
        @DisplayName("Interpolation: menemukan elemen terakhir")
        void testInterpDiAkhir() {
            assertEquals(7, AlgoritmaMethods.interpolationSearch(arrayTerurut, 80));
        }

        @Test
        @DisplayName("Interpolation: elemen tidak ada harus -1")
        void testInterpTidakDitemukan() {
            assertEquals(-1, AlgoritmaMethods.interpolationSearch(arrayTerurut, 55));
        }

        @Test
        @DisplayName("Interpolation: array distribusi seragam 1–100")
        void testInterpDistribusiSeragam() {
            int[] arr = new int[100];
            for (int i = 0; i < 100; i++) arr[i] = i + 1; // 1..100
            assertEquals(49, AlgoritmaMethods.interpolationSearch(arr, 50));
        }
    }

    // =========================================================================
    // BAGIAN 3: SORTING
    // =========================================================================

    @Nested
    @DisplayName("📊 Sorting")
    class SortingTest {

        // Array referensi
        final int[] original = {64, 25, 12, 22, 11};
        final int[] expected = {11, 12, 22, 25, 64};

        final int[] sudahTerurut = {1, 2, 3, 4, 5};
        final int[] terbalik     = {5, 4, 3, 2, 1};
        final int[] satuElemen   = {42};

        // ---- Bubble Sort ----

        @Test
        @DisplayName("Bubble Sort: array acak menjadi terurut ascending")
        void testBubbleAcak() {
            int[] arr = AlgoritmaMethods.copyArray(original);
            AlgoritmaMethods.bubbleSort(arr);
            assertArrayEquals(expected, arr,
                "Hasil bubble sort: " + Arrays.toString(arr));
        }

        @Test
        @DisplayName("Bubble Sort: array yang sudah terurut tetap benar")
        void testBubbleSudahTerurut() {
            int[] arr = AlgoritmaMethods.copyArray(sudahTerurut);
            AlgoritmaMethods.bubbleSort(arr);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        }

        @Test
        @DisplayName("Bubble Sort: array terbalik menjadi terurut")
        void testBubbleTerbalik() {
            int[] arr = AlgoritmaMethods.copyArray(terbalik);
            AlgoritmaMethods.bubbleSort(arr);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        }

        @Test
        @DisplayName("Bubble Sort: array satu elemen tidak berubah")
        void testBubbleSatuElemen() {
            int[] arr = AlgoritmaMethods.copyArray(satuElemen);
            AlgoritmaMethods.bubbleSort(arr);
            assertArrayEquals(new int[]{42}, arr);
        }

        // ---- Selection Sort ----

        @Test
        @DisplayName("Selection Sort: array acak menjadi terurut ascending")
        void testSelectionAcak() {
            int[] arr = AlgoritmaMethods.copyArray(original);
            AlgoritmaMethods.selectionSort(arr);
            assertArrayEquals(expected, arr,
                "Hasil selection sort: " + Arrays.toString(arr));
        }

        @Test
        @DisplayName("Selection Sort: array yang sudah terurut tetap benar")
        void testSelectionSudahTerurut() {
            int[] arr = AlgoritmaMethods.copyArray(sudahTerurut);
            AlgoritmaMethods.selectionSort(arr);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        }

        @Test
        @DisplayName("Selection Sort: array terbalik menjadi terurut")
        void testSelectionTerbalik() {
            int[] arr = AlgoritmaMethods.copyArray(terbalik);
            AlgoritmaMethods.selectionSort(arr);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        }

        @Test
        @DisplayName("Selection Sort: array satu elemen tidak berubah")
        void testSelectionSatuElemen() {
            int[] arr = AlgoritmaMethods.copyArray(satuElemen);
            AlgoritmaMethods.selectionSort(arr);
            assertArrayEquals(new int[]{42}, arr);
        }

        // ---- Insertion Sort ----

        @Test
        @DisplayName("Insertion Sort: array acak menjadi terurut ascending")
        void testInsertionAcak() {
            int[] arr = AlgoritmaMethods.copyArray(original);
            AlgoritmaMethods.insertionSort(arr);
            assertArrayEquals(expected, arr,
                "Hasil insertion sort: " + Arrays.toString(arr));
        }

        @Test
        @DisplayName("Insertion Sort: array yang sudah terurut tetap benar")
        void testInsertionSudahTerurut() {
            int[] arr = AlgoritmaMethods.copyArray(sudahTerurut);
            AlgoritmaMethods.insertionSort(arr);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        }

        @Test
        @DisplayName("Insertion Sort: array terbalik menjadi terurut")
        void testInsertionTerbalik() {
            int[] arr = AlgoritmaMethods.copyArray(terbalik);
            AlgoritmaMethods.insertionSort(arr);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        }

        @Test
        @DisplayName("Insertion Sort: array satu elemen tidak berubah")
        void testInsertionSatuElemen() {
            int[] arr = AlgoritmaMethods.copyArray(satuElemen);
            AlgoritmaMethods.insertionSort(arr);
            assertArrayEquals(new int[]{42}, arr);
        }

        // ---- Perbandingan ketiga sort menghasilkan output sama ----

        @Test
        @DisplayName("Ketiga sort menghasilkan hasil yang SAMA untuk array yang sama")
        void testSemuaSortSamaHasil() {
            int[] bubble    = AlgoritmaMethods.copyArray(original);
            int[] selection = AlgoritmaMethods.copyArray(original);
            int[] insertion = AlgoritmaMethods.copyArray(original);

            AlgoritmaMethods.bubbleSort(bubble);
            AlgoritmaMethods.selectionSort(selection);
            AlgoritmaMethods.insertionSort(insertion);

            assertArrayEquals(bubble, selection, "Bubble vs Selection berbeda!");
            assertArrayEquals(selection, insertion, "Selection vs Insertion berbeda!");
        }
    }
}
