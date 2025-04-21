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
public class PBO_Mobil {
    public static void main(String[] args) {
        PBO_MasterMobil AudiRS = new PBO_MasterMobil();
        AudiRS.karakteristik = "Irit, Mobil Mewah";
        AudiRS.merk = "AUDI RS";
        AudiRS.tahunPembuatan = "2022";
        
        System.out.println("1. AudiRS ");
        System.out.println("Karateristik : " + AudiRS.karakteristik);
        System.out.println("Merek        : " + AudiRS.merk);
        System.out.println("Keluaran     : " + AudiRS.tahunPembuatan);
        
        AudiRS.berjalan("lambat");
        AudiRS.berjalan("normal");
        AudiRS.berjalan("cepat");
        AudiRS.berhenti();
        
        PBO_MasterMobil Zenix = new PBO_MasterMobil();
        Zenix.karakteristik = "Sporty, Irit Bensin, Desain Elegan";
        Zenix.merk = "Zenix";
        Zenix.tahunPembuatan = "2022";
        
        System.out.println("\n2. Zenix");
        System.out.println("Karateristik : " + Zenix.karakteristik);
        System.out.println("Merek        : " + Zenix.merk);
        System.out.println("Keluaran     : " + Zenix.tahunPembuatan);
        
        Zenix.berjalan("lambat");
        Zenix.berjalan("normal");
        Zenix.berjalan("cepat");
        Zenix.berhenti();
        
        System.out.println("\n1. Audi RS");
        System.out.println("Karateristik : " + AudiRS.karakteristik);
        System.out.println("Merek        : " + AudiRS.merk);
        System.out.println("Keluaran     : " + AudiRS.tahunPembuatan);
    }
}
