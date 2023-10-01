
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import vista.MiGestorEntrada;
import Acces_fitxer.GestioFitxer;
import java.util.ArrayList;
import vista.MiGestorSortida;


public class GestioRanking {
    
    private static String rutaFitxerRanking;
    private static String nomJugador;
    private static int punts;
    private static String dataString;
    private static Date data;
    private static int numParaules;
    
    public static void afegirRanking( ){
        
         
        nomJugador = MiGestorEntrada.demanarParaules("Introduir nom de juagdor: ");
        
        punts = GestioPartida.getPunts();
        
        dataString = data.getDay() + "/" + data.getMonth() + "/" + data.getYear();
        
        
        try(FileWriter escriure = new FileWriter(rutaFitxerRanking, true)){
        
            escriure.write(nomJugador + ";" + String.valueOf(punts) + ";" + dataString + ";" + numParaules);
        
        } catch (IOException ex) {
            throw new RuntimeException("Error al llegir el fitxer");
        }
        
    }
    
    
    public void comprobarRanking(){
        ArrayList<String> rankings = new ArrayList();
        rankings = GestioFitxer.getLlistaParaules();
        int numParaulaAux = 0;
        boolean primerVolta = true;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < rankings.size(); j+=5) {
                
                if(primerVolta){
                    numParaulaAux = i;
                    MiGestorSortida.imprimirText("RANKING PARAULES DE " + numParaulaAux + " LLETRES\n*********************" );
                    primerVolta = false;
                }
                nomJugador = rankings.get(j);
                punts = Integer.valueOf(rankings.get(j +1));
                dataString = rankings.get(j + 2);
                numParaules = Integer.valueOf(rankings.get(j + 3));
                
                if (numParaules == numParaulaAux){
                    MiGestorSortida.imprimirText("NOM_JUGADOR: " + nomJugador + " | PUNTS: " + punts + " | DATA: " + dataString);
                }
            }
            MiGestorSortida.imprimirText("*********************\n" );
        }
        
    }          
}
 