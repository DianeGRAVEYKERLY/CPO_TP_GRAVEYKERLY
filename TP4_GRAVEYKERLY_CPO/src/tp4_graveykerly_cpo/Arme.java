/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_graveykerly_cpo;

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
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ("prenom :" + prenom +  "niveauAttaque:" + niveauAttaque);

return chaine_a_retourner;
}
    
}
