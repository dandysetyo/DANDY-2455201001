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
public class Soal_4_Hapus_Duplikat_Array {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,4,5};
        int n = array.length;

        // Array sementara untuk menampung elemen unik
        int[] hasil = new int[n];
        int jumlahUnik = 0;

        for (int i = 0; i < n; i++) {
            boolean duplikat = false;

            // Cek apakah array[i] sudah ada di hasil[]
            for (int j = 0; j < jumlahUnik; j++) {
                if (array[i] == hasil[j]) {
                    duplikat = true;
                    break;
                }
            }

            // Jika belum duplikat, masukkan ke hasil[]
            if (!duplikat) {
                hasil[jumlahUnik] = array[i];
                jumlahUnik++;
            }
        }

        // CETAK HASIL TANPA DUPLIKAT
        System.out.print("Array tanpa duplikat: [");
        for (int i = 0; i < jumlahUnik; i++) {
            System.out.print(hasil[i]);
            if (i < jumlahUnik - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


