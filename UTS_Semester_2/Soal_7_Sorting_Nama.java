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
public class Soal_7_Sorting_Nama {
    public static void main(String[] args) {
        // Array nama-nama orang
        String[] nama = {"Lisa", "Rosse", "Jennie", "Jiso", "karina", "Szaa", "Billy"};

        // Salin array untuk masing-masing algoritma agar tidak saling mempengaruhi
        String[] insertionSortArray = nama.clone();
        String[] selectionSortArray = nama.clone();
        String[] bubbleSortArray = nama.clone();

        // Insertion Sort
        insertionSort(insertionSortArray);
        System.out.println("Hasil Insertion Sort:");
        tampilkanArray(insertionSortArray);

        // Selection Sort
        selectionSort(selectionSortArray);
        System.out.println("\nHasil Selection Sort:");
        tampilkanArray(selectionSortArray);

        // Bubble Sort
        bubbleSort(bubbleSortArray);
        System.out.println("\nHasil Bubble Sort:");
        tampilkanArray(bubbleSortArray);
    }

    // Metode untuk menampilkan array
    public static void tampilkanArray(String[] array) {
        for (String nama : array) {
            System.out.print(nama + " ");
        }
        System.out.println();
    }

    // Insertion Sort
    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareToIgnoreCase(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Selection Sort
    public static void selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareToIgnoreCase(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Tukar
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Bubble Sort
    public static void bubbleSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    // Tukar
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

