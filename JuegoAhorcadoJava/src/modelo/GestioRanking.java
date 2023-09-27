
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import vista.MiGestorEntrada;


public class GestioRanking {
    
    private String rutaFitxerRanking;
    private String nomJugador;
    private int punts;
    private String dataString;
    private Date data;
    private int numParaules;
    
    public void afegirRanking( ){
        
         
        nomJugador = MiGestorEntrada.demanarParaules("Introduir nom de juagdor: ");
        
        punts = partida.getPunts();
        
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
