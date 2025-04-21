/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_2;

/**
 *
 * @author setyo
 */
public class Araay1dimensi {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 1 dimensi
        int[] nilai = {85, 90, 78, 92, 88};

        // Menampilkan isi array
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }   // TODO code application logic here
        
    }
}
