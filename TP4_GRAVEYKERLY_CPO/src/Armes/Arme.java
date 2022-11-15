/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author dia12
 */
public class Arme {
String prenom;
int niveauAttaque ;

public Arme (String n, int i) {
prenom = n;
niveauAttaque=i;



}

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public void setNiveauAttaque(int niveauAttaque) {
        if (niveauAttaque>0);
        if   (niveauAttaque<100);
        
        this.niveauAttaque = niveauAttaque;
        
    }
    
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ("prenom :" + prenom +  "niveauAttaque:" + niveauAttaque);

return chaine_a_retourner;
}
    
}
