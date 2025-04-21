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
public class Array2dimensi {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 2 dimensi
        int[][] nilai = {
            {80, 85, 90},
            {75, 70, 88},
            {90, 95, 92}
        };

        // Menampilkan isi array
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println(); // ganti baris
        }
    }
}
