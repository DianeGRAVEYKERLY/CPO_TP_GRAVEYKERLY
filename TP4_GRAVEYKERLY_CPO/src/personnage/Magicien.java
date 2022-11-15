/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnage;

/**
 *
 * @author dia12
 */
public class Magicien extends personnage{
    boolean confirme;
    public Magicien( String m,int v, boolean confirm){
            super(m,v);
            confirm=confirme;
            
    }

    public boolean isConfirme() {
        return confirme;
    }


   
    

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }



    

    
    
}
