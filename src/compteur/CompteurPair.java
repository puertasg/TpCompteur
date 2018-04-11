/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compteur;

/**
 *
 * @author diginamic05
 */
public class CompteurPair extends Counter {
    public CompteurPair()
    {
        super(0,2);
    }
    
    public void inc()
    {
        this.setValue(this.getValue()+2);
    }
}
