/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119916.latihan62.livingthing;

/**
 *
 * @author DIAN
 */
public class Human extends LivingThing{
     private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    @Override
    public void walk(String nama) {
        System.out.println(nama + " Berjalan ");
    
    }
}
