/**
 * AlgoritmaMethods.java
 * Class berisi method-method yang BELUM SELESAI untuk dikerjakan sebagai latihan UTS.
 * Materi: Rekursif, Searching (Sequential, Binary, Interpolation), Sorting (Bubble, Selection, Insertion)
 *
 * PETUNJUK: Lengkapi setiap method di bawah ini sesuai dengan algoritmanya.
 *           Jangan ubah nama method dan parameter agar @Test tetap berjalan.
 */
public class AlgoritmaMethods {

    // =========================================================================
    // BAGIAN 1: REKURSIF
    // =========================================================================

    /**
     * Menghitung faktorial dari n secara rekursif.
     * Contoh: faktorial(5) = 5 * 4 * 3 * 2 * 1 = 120
     *
     * @param n bilangan bulat non-negatif
     * @return hasil faktorial n
     */
    public static long faktorial(int n) {
        // TODO: Implementasikan secara rekursif
        // Base case: faktorial(0) = 1
        // Recursive case: n * faktorial(n - 1)
        if (n == 0) 
            return 1;
        else
            return n * faktorial(n - 1);
    }

    /**
     * Menghitung bilangan Fibonacci ke-n secara rekursif.
     * Deret: 0, 1, 1, 2, 3, 5, 8, 13, ...
     * Contoh: fibonacci(6) = 8
     *
     * @param n indeks (mulai dari 0)
     * @return bilangan fibonacci ke-n
     */
    public static long fibonacci(int n) {
        // TODO: Implementasikan secara rekursif
        // Base case: fibonacci(0) = 0, fibonacci(1) = 1
        // Recursive case: fibonacci(n-1) + fibonacci(n-2)
        if (n == 0) 
            return 0;
        if (n == 1) 
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Menghitung pangkat (base^exp) secara rekursif.
     * Contoh: pangkat(2, 10) = 1024
     *
     * @param base bilangan dasar
     * @param exp  eksponen (>= 0)
     * @return hasil base pangkat exp
     */
    public static long pangkat(int base, int exp) {
        // TODO: Implementasikan secara rekursif
        // Base case: pangkat(base, 0) = 1
        // Recursive case: base * pangkat(base, exp - 1)
        if (exp == 0) 
            return 1;
        else
            return base * pangkat(base, exp - 1);
    }

    /**
     * Menjumlahkan semua elemen array secara rekursif.
     * Contoh: jumlahArray({1,2,3,4,5}, 5) = 15
     *
     * @param arr   array bilangan
     * @param index indeks saat ini (mulai dari 0)
     * @return jumlah semua elemen
     */
    public static int jumlahArray(int[] arr, int index) {
        // TODO: Implementasikan secara rekursif
        // Base case: ketika index >= arr.length, return 0
        // Recursive case: arr[index] + jumlahArray(arr, index + 1)
        if (index >= arr.length) 
           return 0;
        else
            return arr[index] + jumlahArray(arr, index + 1);
    }

    // =========================================================================
    // BAGIAN 2: SEARCHING
    // =========================================================================

    /**
     * Sequential Search (Linear Search).
     * Mencari nilai target di dalam array satu per satu dari depan.
     * Array TIDAK harus terurut.
     *
     * @param arr    array yang dicari
     * @param target nilai yang dicari
     * @return indeks pertama ditemukannya target, atau -1 jika tidak ditemukan
     */
    public static int sequentialSearch(int[] arr, int target) {
        // TODO: Iterasi dari index 0 hingga arr.length - 1
        // Jika arr[i] == target, return i
        // Jika tidak ditemukan setelah loop, return -1
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // ganti baris ini
    }

    /**
     * Binary Search (array HARUS sudah terurut ascending).
     * Membagi array menjadi dua bagian di setiap langkah.
     *
     * @param arr    array terurut ascending
     * @param target nilai yang dicari
     * @return indeks target jika ditemukan, atau -1 jika tidak ditemukan
     */
    public static int binarySearch(int[] arr, int target) {
        // TODO: Gunakan variabel low = 0 dan high = arr.length - 1
        // Hitung mid = (low + high) / 2
        // Jika arr[mid] == target -> return mid
        // Jika arr[mid] < target  -> low = mid + 1
        // Jika arr[mid] > target  -> high = mid - 1
        // Ulangi selama low <= high
        // Jika tidak ditemukan, return -1
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high)/2;
        while(low <= high){
            if (arr[mid] == target) 
                return mid;
            if (arr[mid] < target) 
                return low = mid + 1;
            else
                return high = mid - 1;
        }
        
        return -1; // ganti baris ini
    }

    /**
     * Interpolation Search (array HARUS terurut ascending & terdistribusi merata).
     * Memperkirakan posisi elemen berdasarkan nilai, lebih cepat dari binary search
     * pada data yang terdistribusi seragam.
     *
     * Rumus posisi: pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low])
     *
     * @param arr    array terurut ascending
     * @param target nilai yang dicari
     * @return indeks target jika ditemukan, atau -1 jika tidak ditemukan
     */
    public static int interpolationSearch(int[] arr, int target) {
        // TODO: Inisialisasi low = 0, high = arr.length - 1
        // Selama low <= high AND target >= arr[low] AND target <= arr[high]:
        //   Hitung pos menggunakan rumus di atas
        //   Jika arr[pos] == target -> return pos
        //   Jika arr[pos] < target  -> low = pos + 1
        //   Jika arr[pos] > target  -> high = pos - 1
        // Jika tidak ditemukan, return -1
        int low = 0; int high = arr.length - 1;
        while(low <= high && target >= arr[low] && target <= arr[high]){
            int posisi = low + ((target - arr[low]) * (high - low)/(arr[high] - arr[low]));
            if (arr[posisi] == target) 
                 return posisi;
            if (arr[posisi] < target) 
                 return low = posisi + 1;
            else
                     return high = posisi - 1;       
        }
        return -1; // ganti baris ini
    }

    // =========================================================================
    // BAGIAN 3: SORTING
    // =========================================================================

    /**
     * Bubble Sort — ascending.
     * Membandingkan dua elemen berdampingan dan menukar jika urutan salah.
     * Ulangi hingga tidak ada pertukaran lagi.
     *
     * @param arr array yang akan diurutkan (dimodifikasi langsung / in-place)
     */
    public static void bubbleSort(int[] arr) {
        // TODO: Gunakan dua loop bersarang (nested loop)
        // Loop luar: i dari 0 hingga arr.length - 1
        // Loop dalam: j dari 0 hingga arr.length - i - 2
        // Jika arr[j] > arr[j+1], tukar keduanya (swap)
        // Optimasi opsional: gunakan flag 'swapped'; jika tidak ada swap, hentikan lebih awal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - 2; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * Selection Sort — ascending.
     * Setiap iterasi mencari elemen terkecil dari sisa array
     * lalu menempatkannya di posisi yang benar.
     *
     * @param arr array yang akan diurutkan (in-place)
     */
    public static void selectionSort(int[] arr) {
        // TODO: Loop luar i dari 0 hingga arr.length - 2
        // Asumsikan minIndex = i
        // Loop dalam j dari i+1 hingga arr.length - 1
        //   Jika arr[j] < arr[minIndex] -> update minIndex = j
        // Tukar arr[i] dengan arr[minIndex]
        for (int i = 0; i < arr.length - 2; i++) {
           int minIndex = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) 
                    minIndex = j;  
            }
             int temp = arr[i];
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;
        }
       
    }

    /**
     * Insertion Sort — ascending.
     * Mengambil satu elemen dan menyisipkannya ke posisi yang tepat
     * di bagian array yang sudah terurut.
     *
     * @param arr array yang akan diurutkan (in-place)
     */
    public static void insertionSort(int[] arr) {
        // TODO: Loop i dari 1 hingga arr.length - 1
        // Simpan key = arr[i]
        // j = i - 1
        // Selama j >= 0 AND arr[j] > key:
        //   arr[j + 1] = arr[j]
        //   j--
        // arr[j + 1] = key
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    // =========================================================================
    // HELPER
    // =========================================================================

    /**
     * Menyalin array agar array asli tidak berubah saat pengujian sorting.
     */
    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
}
