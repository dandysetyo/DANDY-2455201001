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
public class Soal_1_ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.print("Array terbalik: [");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
            }
        }
        System.out.println("]");
    }
}

