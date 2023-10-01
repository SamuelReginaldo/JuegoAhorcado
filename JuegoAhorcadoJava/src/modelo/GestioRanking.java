
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import vista.MiGestorEntrada;
import Acces_fitxer.GestioFitxer;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import vista.MiGestorSortida;


public class GestioRanking {
    
    static File fitxerRankings = new File("fitxers" + "/" + "ranking.txt");
    private static String nomJugador;
    private static String dataString;
    private static int numParaulesAux;
    private static int puntsAux;
    private static Calendar c1 = Calendar.getInstance();
    
    public static void afegirRanking(int punts, int numParaules){
        
        nomJugador = MiGestorEntrada.demanarParaules("Introduir nom de juagdor: ");
        
        dataString = Integer.toString(c1.get(Calendar.DAY_OF_MONTH)) + "/" + Integer.toString(c1.get(Calendar.MONTH)) + "/" + Integer.toString(c1.get(Calendar.YEAR));
        
        
        try(FileWriter escriure = new FileWriter(fitxerRankings, true)){
        
            escriure.write(nomJugador + ";" + String.valueOf(punts) + ";" + dataString + ";" + numParaules + ";");
        
        } catch (IOException ex) {
            throw new RuntimeException("Error al llegir el fitxer");
        }
        
    }
    
    
    public static void comprobarRanking(){
        ArrayList<String> rankings = new ArrayList();
        rankings = GestioFitxer.getLlistaRankings();
        int numParaulaAux = 0;
        boolean primeraVolta = true, existeixNum = false, noParaules = true;
        
        for (int i = 1; i < 24; i++) {
            primeraVolta = true;
            existeixNum = false;
            for (int j = 0; j < rankings.size(); j+=5) {
                if(i == Integer.valueOf(rankings.get(j + 3))){
                    existeixNum = true;
                }
            }
            if(existeixNum){
                noParaules = false;
                for (int j = 0; j < rankings.size(); j+=5) {
                
                if(primeraVolta){
                    numParaulaAux = i;
                    MiGestorSortida.imprimirText("RANKING PARAULES DE " + numParaulaAux + " LLETRES\n*********************" );
                    primeraVolta = false;
                }
                nomJugador = rankings.get(j);
                puntsAux = Integer.valueOf(rankings.get(j +1));
                dataString = rankings.get(j + 2);
                numParaulesAux = Integer.valueOf(rankings.get(j + 3));
                
                if (numParaulesAux == numParaulaAux){
                    MiGestorSortida.imprimirText("NOM_JUGADOR: " + nomJugador + " | PUNTS: " + puntsAux + " | DATA: " + dataString);
                }
                }
                MiGestorSortida.imprimirText("*********************\n" );
            }
        }
        if(noParaules){
            MiGestorSortida.imprimirText("NO HI HAN RANKINGS GUARDATS");
        }
    }          
}
 