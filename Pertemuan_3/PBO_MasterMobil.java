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
public class PBO_MasterMobil {
    String karakteristik = "";
    String merk = "";
    String tahunPembuatan = "";

    public void berjalan(String cepat) {
        switch (cepat) {
            case "normal":
                System.out.println("Mobil sedang berjalan 25KM/JAM");
                break;
            case "lambat":
                System.out.println("Mobil sedang berjalan 15KM/JAM");
                break;
            case "cepat":
                System.out.println("Mobil sedang berjalan 150KM/JAM");
                break;
            default:
                System.out.println("Kecepatan tidak diketahui");
                break;
        }
    }

    public void berhenti() {
        System.out.println("Mobil berhenti");
    }
}
