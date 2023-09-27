package modelo;

import java.util.Random;
import vista.MiGestorSortida;

public class GestioPartida {
    
    //10 errors i game over
    private int punts;
    private String paraula;
    
    private void partida(){
        
        paraula = paraulaAleatoria();
        //Punts Inicials 100
        //Error -10
        //Lletra encertada -1
        punts = 100;
        
        MiGestorSortida.imprimirText("");
        
    }
    
    private String paraulaAleatoria(){
       Random rn = new Random();
       
       return "hola";
    }
    
    
}
