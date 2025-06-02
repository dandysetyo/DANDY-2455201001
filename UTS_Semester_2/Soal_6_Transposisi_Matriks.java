/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Semester_2;

/**
 *
 * @author setyo
 */
public class Soal_6_Transposisi_Matriks {
    public static void main(String[] args) {
        // MATRIKS AWAL 3X3
        int[][] matriks = {
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };

        // MENAMPILKAN MATRIKS AWAL
        System.out.println("Matriks Awal:");
        tampilkanMatriks(matriks);

        // MELAKUKAN TRANSPOSISI
        int[][] transpos = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpos[j][i] = matriks[i][j];
            }
        }

        // MENAMPILKAN HASIL TRANSPOSISI
        System.out.println("\nMatriks Setelah Transposisi:");
        tampilkanMatriks(transpos);
    }

    // METOD UNTUK MENAMPILKAN MATRIKS
    public static void tampilkanMatriks(int[][] matriks) {
        for (int[] matrik : matriks) {
            for (int j = 0; j < matrik.length; j++) {
                System.out.print(matrik[j] + " ");
            }
            System.out.println();
        }
    }
}