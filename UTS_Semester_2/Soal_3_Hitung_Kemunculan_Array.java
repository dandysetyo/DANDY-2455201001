/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Semester_2;

import java.util.HashMap;

/**
 *
 * @author setyo
 */
public class Soal_3_Hitung_Kemunculan_Array {
    public static void main(String[] args) {
        // ARRAY INPUT BARU
        int[] array = {1,2,1,3,4,2,1};

        // HASMAP UTK MENYIMPAN JUMLAH KEMUNCULAN SETIAP ELEMEN
        HashMap<Integer, Integer> jumlahKemunculan = new HashMap<>();

        // MENGHITUNG JUMLAH KEMUNCULAN
        for (int elemen : array) {
            if (jumlahKemunculan.containsKey(elemen)) {
                jumlahKemunculan.put(elemen, jumlahKemunculan.get(elemen) + 1);
            } else {
                jumlahKemunculan.put(elemen, 1);
            }
        }

        // MENAMPILKAN HASIL
        System.out.println("Jumlah kemunculan setiap elemen:");
        jumlahKemunculan.keySet().forEach((key) -> {
            System.out.println(key + " = " + jumlahKemunculan.get(key));
        });
    }
}

