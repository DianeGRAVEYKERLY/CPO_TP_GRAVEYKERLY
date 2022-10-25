/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_gravey.kerly;

/**
 *
 * @author dia12
 */
class TP2_Bieres_GRAVEYKERLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    BouteilleBiere r;
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7 ,"Dubuisson") ;
    uneBiere.lireEtiquette();
    
    
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6
,"Abbaye de Leffe") ;
    autreBiere.lireEtiquette();
    BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("86",
8 ,"Babar") ;
    uneTroisiemeBiere.lireEtiquette();
    uneTroisiemeBiere.decapsuler();
    System.out.println(uneTroisiemeBiere);
    BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("Heineken",
12 ,"Petit Comptoir") ;
    uneQuatriemeBiere.lireEtiquette();
    uneQuatriemeBiere.decapsuler();
    System.out.println(uneQuatriemeBiere);
    BouteilleBiere uneCinquiemeBiere = new BouteilleBiere("Desperados",
14 ,"Dubuisson") ;
    uneCinquiemeBiere.lireEtiquette();
    uneCinquiemeBiere.decapsuler();
    System.out.println(uneCinquiemeBiere);
    
    }
}
