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
public class Omnivora extends Binatang {
//    ArrayList daftarMangsa = new ArrayList<>();
//    ArrayList daftarMakanan = new ArrayList<>();
    private ArrayList<Binatang> daftarMangsa = new ArrayList<Binatang>();
    private ArrayList<Tumbuhan> daftarMakanan = new ArrayList<Tumbuhan>();

    public Omnivora() {
    }

    public ArrayList getDaftarMangsa() {
        return daftarMangsa;
    }

    public void setDaftarMangsa(ArrayList daftarMangsa) {
        this.daftarMangsa = daftarMangsa;
    }

    public ArrayList getDaftarMakanan() {
        return daftarMakanan;
    }

    public void setDaftarMakanan(ArrayList daftarMakanan) {
        this.daftarMakanan = daftarMakanan;
    }
    
    
    public void add(Binatang binatang){
        this.daftarMangsa.add(binatang);
    }
    public void add(Tumbuhan tumbuhan){
        daftarMakanan.add(tumbuhan);
    }
    public int showSize(){
        return daftarMangsa.size();
    }
    public void displayOmnivora(){

        super.displayBinatang();
        System.out.println("Daftar Makanan ");
        for (int i = 0; i < daftarMakanan.size(); i++) {
            daftarMakanan.get(i).displayTumbuhan();
            
        }
        System.out.println("Daftar Mangsa");
        for (int i = 0; i < daftarMangsa.size(); i++) {
            daftarMangsa.get(i).displayBinatang();
            
        }
    
    }
}
