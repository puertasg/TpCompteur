/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moncompteur;

import compteur.Counter;

/**
 *
 * @author diginamic05
 */
public class Compteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.inc();
        c1.inc();
        
        Counter c2 = new Counter(0,2);
        c2.inc();
        
        System.out.println(c1);
        System.out.println(c2);
        
        if(c1.equals(c2))
        {
            System.out.println("les deux compteurs sont égaux");
        }
        else
        {
            System.out.println("les deux compteurs ne sont pas égaux");
        }
    }
    
}
