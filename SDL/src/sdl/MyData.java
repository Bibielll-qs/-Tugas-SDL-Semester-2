/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdl;

/**
 *
 * @author LENOVO
 */
public class MyData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int total = 0;
       for(int i = 0; i < array.length; i++){
           total += array[i];
       }
       System.out.println("Penjumlahan variabel tersebut adalah " +total);
    }
}
