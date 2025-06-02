/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Semester_2;

import java.util.Scanner;

/**
 *
 * @author setyo
 */
public class Soal_5_Mengecek_Matriks_Identitas {
    public static void main(String[] args) {
        // Contoh matriks 3x3
        int[][] matriks = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        // Asumsikan matriks adalah identitas
        boolean isIdentitas = true;

        // Periksa setiap elemen
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriks[i][j] != 1) {
                    isIdentitas = false;
                    break;
                } else if (i != j && matriks[i][j] != 0) {
                    isIdentitas = false;
                    break;
                }
            }
            if (!isIdentitas) {
                break;
            }
        }

        // Cetak hasil
        if (isIdentitas) {
            System.out.println("Matriks adalah matriks identitas.");
        } else {
            System.out.println("Matriks bukan matriks identitas.");
        }
    }
}
