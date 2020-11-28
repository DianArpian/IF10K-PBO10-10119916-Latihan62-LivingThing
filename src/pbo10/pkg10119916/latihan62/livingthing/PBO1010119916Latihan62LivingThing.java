/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119916.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 */
public class PBO1010119916Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Human human = new Human();
        human.setNama("Dian Arpian");
       
        human.walk(human.getNama());
        human.Breath(human.getNama());
        human.eat(human.getNama());
    }
    
}