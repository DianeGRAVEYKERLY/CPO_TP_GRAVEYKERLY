/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_gravey.kerly;

/**
 *
 * @author dia12
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
 nbConversions = 0 ;
}
public double CelsiusVersKelvin (double TC){
    
    return TC+ 273.15;
}; 

public double KelvinVersCelsius (double TK){
    return TK - 273.15;
};
public double FarenheitVersCelsius (double TF){
    return (TF-32) *5/9;
};
public double CelsiusVersFarenheit (double TC){
    return (TC*9/5) +32;
}
        ;
public double FarenheitVersKelvin (double TF){
    return FarenheitVersCelsius(TF) + 273.15;
};
public double KelvinVersFarenheit (double TK){
    return CelsiusVersFarenheit(KelvinVersCelsius(TK));
};
public String toSring(){
    
};
    
}
