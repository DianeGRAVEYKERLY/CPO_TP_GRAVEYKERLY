/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_gravey.kerly;
 
import java.util.Scanner;

/**
 *
 * @author dia12
 */
public class TP2_ConvertisseurObjet_GRAVEYKERLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur thermometre = new Convertisseur();
        System.out.println (thermometre.CelsiusVersFarenheit(15));
        System.out.println (thermometre.CelsiusVersKelvin(32));
        System.out.println (thermometre.KelvinVersCelsius(23));
        thermometre.toString();
        
        
        Convertisseur thermos = new Convertisseur ();
        thermos.CelsiusVersKelvin(34);
        thermos.KelvinVersCelsius(24);
        thermos.FarenheitVersCelsius(54);
        thermos.toString();
        
        
        Scanner sc;
        sc = new Scanner (System.in);
        
        System.out.println("Choisissez votre conversion: Si vous souhaitez convertir des celsius, tapez TC. Si vous souhaitez convertir des Kelvin, tapez TK. Si vous souhaitez convertir des Farenheit, tapez TF" );
        //TODO code application logic here
        ent a = sc.nextInt();
        if a ==TC {
            System.out.println("En quoi souhaitez vous convertir les celsius, tapez TK pour kelvin et TF pour Farenheit");
            
        }
    }
    
}
