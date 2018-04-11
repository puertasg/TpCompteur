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
public class Counter {
    private int value;
    private int step;
    
    public Counter()
    {
        this.value = 0;
        this.step = 1;
    }

    public int getValue() {
        return value;
    }
    
    public void inc()
    {
        this.value+=this.step;
    }
    
    public String toString()
    {
        return "valeur : " + this.value;
    }
}
