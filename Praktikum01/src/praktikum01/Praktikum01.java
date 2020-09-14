/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum01;

/**
 *
 * @author USER
 */
public class Praktikum01 {

    /**
     * @Nabilaa Noor'Aini K31519061
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi */
        Keramik ka = new Keramik();
        ka.ukuran = 30 * 30;
        ka.perbox = 10;
        ka.harga = 54000;
        ka.keramik(); 
        ka.box();
        ka.harga();
        
        Keramik kb = new Keramik();
        kb.ukuran = 40 * 40;
        kb.perbox = 5;
        kb.harga = 65000;
        kb.keramik();
        kb.box();
        kb.harga();
        
        Keramik kc = new Keramik();
        kc.ukuran = 40 * 30;
        kc.perbox = 8;
        kc.harga = 60000;
        kc.keramik();
        kc.box();
        kc.harga();           
    } 
}
