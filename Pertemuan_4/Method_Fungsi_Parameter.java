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
public class Method_Fungsi_Parameter {
    public static void main(String[] args) {
        Method_Fungsi_Parameter mahasiswa = new Method_Fungsi_Parameter();
        mahasiswa.simpan_nilai("Ambutkam", 90, 78, 100);
        mahasiswa.simpan_nilai("Habibah", 80, 40, 100); 
        
        Method_Fungsi_Parameter Kalkulator = new Method_Fungsi_Parameter();
        double rata2_Huseen = Kalkulator.hitung_rata2("Ambatukam", 90, 78, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_Huseen + "\n");
        
        double rata2_Bayu = Kalkulator.hitung_rata2("Habibah", 80, 40, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_Bayu + "\n");
        
    }
    
    public void simpan_nilai(String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        String[] matkul = {"IPA ", "MTK ", "Struktuk Data "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
    
    public double hitung_rata2 (String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<kumpulan_nilai.length; i++){
            jumblah += kumpulan_nilai[i];
        }
        rata2 = jumblah/kumpulan_nilai.length;
        System.out.println("Nama : " + nama);;
        return rata2;
}
    }

