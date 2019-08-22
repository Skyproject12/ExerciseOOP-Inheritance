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
public class Binatang {
    private String namaBinatang;
    private String jenisKelamin;
    private String warna;
    private int maksLamaHidup;
    private String jenisBinatang;
    
    public Binatang(){
        
    }
    public Binatang(String namaBinatang, String jenisKelamin, String warna, int maksLamaHidup, String jenisBinatang) {
        this.namaBinatang = namaBinatang;
        this.jenisKelamin = jenisKelamin;
        this.warna = warna;
        this.maksLamaHidup = maksLamaHidup;
        this.jenisBinatang = jenisBinatang;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getMaksLamaHidup() {
        return maksLamaHidup;
    }

    public void setMaksLamaHidup(int maksLamaHidup) {
        this.maksLamaHidup = maksLamaHidup;
    }

    public String getJenisBinatang() {
        return jenisBinatang;
    }

    public void setJenisBinatang(String jenisBinatang) {
        this.jenisBinatang = jenisBinatang;
    }
    public void displayBinatang(){
        System.out.println("Nama Binatang : "+this.namaBinatang+"\n"
                + "Jenis Kelamin : "+this.jenisKelamin+"\n"
                + "Warna : "+this.warna+"\n"
                + "Lama Maksimal Hidup : "+this.maksLamaHidup+" tahun \n"
                + "Jenis Binatang : "+this.jenisBinatang);
    }
}
