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
public class Method_Proseduree_Parameter {
    public static void main(String[] args) {
        Method_Proseduree_Parameter mahasiswa = new Method_Proseduree_Parameter();
        mahasiswa.simpan_nilai("Ambatukam", 90, 80, 100);
        mahasiswa.simpan_nilai(" HAbibah ", 89, 90, 100);
        mahasiswa.simpan_nilai("  Akbar  ", 96, 50, 100);
    }
    public void simpan_nilai(String nama, int INGGRIS, int TABOG, int SBK){
        int[] kumpulan_nilai = {INGGRIS, TABOG, SBK};
        String[] matkul = {"INGGRIS ", "TABOG", "SBK "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
}
