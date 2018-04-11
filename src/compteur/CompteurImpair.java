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
public class CompteurImpair extends Counter {
    public CompteurImpair()
    {
        super(1,2);
    }
    
    public void inc()
    {
        this.setValue(this.getValue()+2);
        Counter.setGlobalcounter(Counter.getGlobalcounter()+2);
    }
}
