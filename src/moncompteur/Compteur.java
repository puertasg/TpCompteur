/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moncompteur;

import compteur.*;

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
        
        CompteurPair c3 = new CompteurPair();
        CompteurImpair c4 = new CompteurImpair();
        
        Counter c5 = c1;
        c5.setValue(10);
        
        if(c1.equals(c5))
        {
            System.out.println("les deux compteurs sont égaux");
        }
        else
        {
            System.out.println("les deux compteurs ne sont pas égaux");
        }
    }
    
}
