/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_gravey.kerly;

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
        // TODO code application logic here
    }
    
}
