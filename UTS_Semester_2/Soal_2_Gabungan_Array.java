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
public class Soal_2_Gabungan_Array{
   public static void main(String[] args) {
        // ARRAY PERTAMA DAN KEDUA
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // ARRAY BARU UTK MENANMPUNG HASIL GABUNGAN
        int[] gabungan = new int[array1.length + array2.length];

       // MENYALIN ELEMEN DARI ARRAY PERTAMA KE ARRAY GABUNGAN
       System.arraycopy(array1, 0, gabungan, 0, array1.length);

       // MENYALIN ELEMEN DARI ARRAY KEDUA KE ARRAY GABUNGAN 
       System.arraycopy(array2, 0, gabungan, array1.length, array2.length);

        // Menampilkan array hasil gabungan
        System.out.print("Array hasil gabungan: [");
        for (int i = 0; i < gabungan.length; i++) {
            System.out.print(gabungan[i]);
            if (i < gabungan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
    