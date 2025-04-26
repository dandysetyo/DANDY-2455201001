/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_4;

/**
 *
 * @author setyo
 */
public class ContohMethod {
    public static void main(String[] args) {
        ContohMethod contoh = new ContohMethod();

        // Cara pertama: Method prosedur
        contoh.LuasLingkaranProsedur();

        // Cara kedua: Method fungsi
        double hasil = contoh.LuasLingkaranFungsi();
        System.out.println("Hasil dari method fungsi: " + hasil);
    }

    // Method prosedur (tidak mengembalikan nilai)
    public void LuasLingkaranProsedur() {
        double jari2  = 10;
        double phi    = 3.14;
        double luas   = phi * jari2 * jari2;

        System.out.println("Luas Lingkaran Pakai Method Prosedur = " + luas);
    }

    // Method fungsi (mengembalikan nilai)
    public double LuasLingkaranFungsi() {
        double jari2  = 10;
        double phi    = 3.14;
        double luas   = phi * jari2 * jari2;

        System.out.println("Luas Lingkaran Pakai Method Fungsi = " + luas);
        return luas;
    }
}