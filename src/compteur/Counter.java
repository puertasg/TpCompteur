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
    private static int globalcounter = -1;
    
    public Counter()
    {
        //appelle l'autre constructeur
        this(0,1);
    }
    
    public Counter(int v, int s)
    {
        this.value = v;
        this.step = s;
        if(globalcounter != -1)
        {
            globalcounter = 0;
        }
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
        globalcounter += this.step;
    }
    
    public String toString()
    {
        return "valeur : " + this.value + " (incrément " + this.step + ")";
    }
    
    public boolean equals(Counter c)
    {
        return this.value == c.getValue();
    }

    public static int getGlobalcounter() {
        return globalcounter;
    }

    public static void setGlobalcounter(int aGlobalcounter) {
        globalcounter = aGlobalcounter;
    }
}