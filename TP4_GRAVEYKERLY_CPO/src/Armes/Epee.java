/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author dia12
 */
public class Epee extends Arme {
    int finesse;
    
    public Epee( String n,int i, int e){
            super(n,i);
    finesse = e;
    
}

    public void setFinesse(int finesse) {
        if (finesse<100);
        this.finesse = finesse;
    }
    
}
