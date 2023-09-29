package modelo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import vista.MiGestorEntrada;
import Acces_fitxer.GestioFitxer;
import java.util.ArrayList;
import vista.MiGestorSortida;

public class GestioPartida {
    
    //10 errors i game over
    private static int punts;
    private String paraula;
    
    private void partida(){
        
        Scanner sc = new Scanner(System.in);
        paraula = paraulaAleatoria();
        ArrayList<Character> lletresParaula = new ArrayList<Character>();
        ArrayList<Character> paraulaMostrar = new ArrayList<Character>();
        String opcioMenu = "", lletraProbar = "", paraulaAdivinar = "", lletraParaulaString="";
        //Punts Inicials 100
        //Error -10
        //Lletra encertada -1
        punts = 100;
        int errors = 0;
        boolean continuar = true, acert;
        
        for(int i = 0; i<paraula.length(); i++){
           lletresParaula.add(paraula.charAt(i));
           paraulaMostrar.add('_');
        }
        
        while(continuar){
            System.out.println(MiGestorSortida.estatsAhorcat(errors));
            System.out.println("******************");
            for (int i = 0; i < paraula.length(); i++) {
                System.out.print(paraulaMostrar.get(i) + '.');
            }
            opcioMenu = MiGestorEntrada.demanarParaules("Probar lletra(1) o Adivinar Paraula(2)\n>");
            
            if(opcioMenu.equalsIgnoreCase("1")){
                
                lletraProbar = MiGestorEntrada.demanarParaules("Proba una lletra -> ");
                
                
                for(int i = 0; i<paraula.length(); i++){
                    acert = false;
                    if(lletraProbar.equalsIgnoreCase(String.valueOf(paraula.charAt(i)))){
                        paraulaMostrar.add(i, lletraProbar.charAt(0));
                        acert = true;
                    }
                    if (acert) {
                        punts--;
                    }else{
                        punts -= 10;
                        errors++;
                    }
                }
            
            } else if (opcioMenu.equalsIgnoreCase("2")){
                
                System.out.println("Adivinar Paraula: ");
                
                paraulaAdivinar = MiGestorEntrada.demanarParaules("Adivina la paraula -> ");
                
                if(paraulaAdivinar.equalsIgnoreCase(paraula)){
                    
                    continuar = false;
                } else {
                    punts -= 10;
                    errors++;
                }
            }
        }
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
