
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import vista.MiGestorEntrada;


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
        
            escriure.write(nomJugador + ";" + punts + ";" + dataString + ";" + numParaules);
        
        } catch (IOException ex) {
            throw new RuntimeException("Error al llegir el fitxer");
        }
        
    }
    
    
    public void comprobarRanking(){
        
    }
    
    
            
}
