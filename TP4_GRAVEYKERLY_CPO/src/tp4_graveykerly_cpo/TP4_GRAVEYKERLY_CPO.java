/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_graveykerly_cpo;

import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author dia12
 */
public class TP4_GRAVEYKERLY_CPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee premiereEpee= new Epee("excalibur", 7, 5);
        Epee deuxiemeEpee= new Epee ("durandal",5,6);
        Baton premierBaton= new Baton ("chêne",4,5);
        Baton deuxiemeBaton = new Baton ("charme", 5,6);
       
        ArrayList<Arme> Tab = new ArrayList<String> ();
        Tab.add(premiereEpee);
        Tab.add(deuxiemeEpee);
        Tab.add(premierBaton);
        Tab.add(deuxiemeBaton);
        
        System.out.print("["+Tab.get(0));
        for (int i= 1; i<Tab.size());i++){
        System.out.print(","+Tab.get(i));
        
    }
        
                
    System.out.print("]");    // TODO code application logic here
    }
    
}
