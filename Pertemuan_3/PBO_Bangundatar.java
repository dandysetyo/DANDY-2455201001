/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3;

/**
 *
 * @author setyo
 */
public class PBO_Bangundatar {
    public static void main(String[] args) {
        PBO_MasterbangunDatar Lingkaran = new PBO_MasterbangunDatar();
        Lingkaran.luas = Lingkaran.phi * Lingkaran.r * Lingkaran.r;
        System.out.println("Luas Lingkaran dari jari-jari : " + Lingkaran.r + " Adalah " + Lingkaran.luas);

        PBO_MasterbangunDatar Segitiga = new PBO_MasterbangunDatar();
        Segitiga.luasSGT = 0.5 * Segitiga.alas * Segitiga.tinggi;
        System.out.println("Luas Segitiga Dengan Tinggi : " + Segitiga.tinggi + " dan Alas : " + Segitiga.alas + " Adalah " + Segitiga.luasSGT);
    }
}
