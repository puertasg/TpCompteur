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
    
    public Counter(int v, int s)
    {
        this.value = v;
        this.step = s;
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
    
    public boolean equals(Counter c)
    {
        if(this.value == c.getValue())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
