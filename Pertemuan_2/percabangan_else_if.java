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
public class percabangan_else_if {
    public static void main(String[] args) {
        int nilai = 58;
        System.out.println("<<=== Percabangan ===>>");

        // IF ELSE
        if (nilai >= 100) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else if (nilai >= 60) {
            System.out.println("Nilai D");
        } else if (nilai >= 50) {
            System.out.println("Nilai E");
        } else {
            System.out.println("Nilai E atau di bawahnya");
        }
    }
    
}
