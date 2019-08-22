/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod4;

/**
 *
 * @author Praktikan
 */
public class Tumbuhan {
    private String namaTumbuhan;
    private String jenisTumbuhan;
    private int maksLamaHidup;

    public Tumbuhan() {
    }

    public Tumbuhan(String namaTumbuhan, String jenisTumbuhan, int maksLamaHidup) {
        this.namaTumbuhan = namaTumbuhan;
        this.jenisTumbuhan = jenisTumbuhan;
        this.maksLamaHidup = maksLamaHidup;
    }

    public String getNamaTumbuhan() {
        return namaTumbuhan;
    }

    public void setNamaTumbuhan(String namaTumbuhan) {
        this.namaTumbuhan = namaTumbuhan;
    }

    public String getJenisTumbuhan() {
        return jenisTumbuhan;
    }

    public void setJenisTumbuhan(String jenisTumbuhan) {
        this.jenisTumbuhan = jenisTumbuhan;
    }

    public int getMaksLamaHidup() {
        return maksLamaHidup;
    }

    public void setMaksLamaHidup(int maksLamaHidup) {
        this.maksLamaHidup = maksLamaHidup;
    }
    
    
    public void displayTumbuhan(){
        System.out.println("Nama Tumbuhan : "+this.namaTumbuhan+"\n"
                + "Jenis Tumbuhan : "+this.jenisTumbuhan+"\n"
                + "Lama Maksimal Hidup : "+this.maksLamaHidup+" minggu/tahun");
    }
}
