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
        //appelle l'autre constructeur
        this(0,1);
    }
    
    public Counter(int v, int s)
    {
        this.value = v;
        this.step = s;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public void inc()
    {
        this.setValue(this.value + this.step);
    }
    
    public String toString()
    {
        return "valeur : " + this.value + " (incrément " + this.step + ")";
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
