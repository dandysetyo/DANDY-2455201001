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
public class Method_Fungsi {
    public static void main(String[] args) {
        Method_Fungsi rata_rata = new Method_Fungsi();
        double nilai = rata_rata.rata_rata();
          System.out.println("Rata Rata Nilai dari Fungsi = " + nilai);
    }
    
    //fungsi untuk menghitung nilai rata rata
    public double rata_rata(){
        int SBK      = 100;
        int TABOG    = 90;
        int INGGRIS  = 90;
        
        int[] semua_nilai = {SBK,TABOG,INGGRIS};
        double jumlah = 0;
        double rata_rata;
        for(int i = 0; i<semua_nilai.length; i++){
            jumlah += semua_nilai[i];
        }
        rata_rata = jumlah/semua_nilai.length;
        return rata_rata;  }
    }

