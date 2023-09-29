package modelo;

import Acces_fitxer.GestioFitxer;
import java.util.ArrayList;
import vista.MiGestorSortida;

public class GestioPartida {
    
    //10 errors i game over
    private static int punts;
    private String paraula;
    
    private void partida(){
        
        paraula = paraulaAleatoria();
        int lletresParaula = paraula.length();
        //Punts Inicials 100
        //Error -10
        //Lletra encertada -1
        punts = 100;
        int errors = 0;
        
        System.out.println(MiGestorSortida.estatsAhorcat(errors));
        System.out.println("******************");
        for (int i = 0; i < lletresParaula; i++) {
            System.out.print("_.");
        }
        System.out.println("Probar lletra: ");
    }

    public static int getPunts() {
        return punts;
    }

    
    
    
    private String paraulaAleatoria(){
       ArrayList<String> paraules = GestioFitxer.getLlistaParaules();
       int num = (int) Math.random() * (paraules.size()-1);
       
       return paraules.get(num);
    }
    
    
}
