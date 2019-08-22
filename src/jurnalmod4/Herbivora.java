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
public class Herbivora extends Tumbuhan{
//    ArrayList daftarMakanan = new ArrayList<>();
    private ArrayList<Tumbuhan> daftarMakanan;
    
    public Herbivora() {
    }
    
    public void add(Tumbuhan tumbuhan){
        daftarMakanan.add(tumbuhan);
    }
    public void displayHerbivora(){
        super.displayTumbuhan();
    }
}
