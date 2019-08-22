/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod4;

import java.util.ArrayList;

/**
 *
 * @author Praktikan
 */
public class Karnivora extends Binatang{
//    ArrayList daftarMangsa = new ArrayList<>();
    private ArrayList<Binatang> daftarMangsa;
//    Binatang b = new Binatang();
    
    public Karnivora() {
    }

    
    public ArrayList getDaftarMangsa() {
        return daftarMangsa;
    }

    public void setDaftarMangsa(ArrayList daftarMangsa) {
        this.daftarMangsa = daftarMangsa;
    }
    
    public void add (Binatang binatang){
        daftarMangsa.add(binatang);
    }
    public void displayKarnivora(){
//        System.out.println("Nama Binatang : \n"+super.getNamaBinatang()
//                + "Jenis Kelamin : \n"+super.getJenisKelamin()
//                + "Warna : \n"+super.getWarna()
//                + "Lama Maksimal Hidup : \n"+super.getMaksLamaHidup()
//                + "Jenis Binatang : "+super.getJenisBinatang());
        super.displayBinatang();
    }
}
