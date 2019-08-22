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
public class JurnalMod4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Binatang binatang = new Binatang("Kucing","Jantan","Biru",10,"Karnivora");
        Tumbuhan tumbuhan = new Tumbuhan("Kangkung","Sayur",1);
        Omnivora omnivora = new Omnivora();
        Karnivora karnivora = new Karnivora();
        Herbivora herbivora = new Herbivora();
 
        System.out.println("Daftar nama binatang omnivora");
        System.out.println("==============================");
        omnivora.setNamaBinatang("Beruang");
        omnivora.setJenisKelamin("Betina");
        omnivora.setWarna("Coklat");
        omnivora.setMaksLamaHidup(5);
        omnivora.setJenisBinatang("Omnivora");
        omnivora.add(binatang);
        omnivora.add(tumbuhan);
        omnivora.displayOmnivora();
        
        System.out.println();
        System.out.println("Daftar nama binatang herbivora");
        System.out.println("==============================");
        
    }
    
}
