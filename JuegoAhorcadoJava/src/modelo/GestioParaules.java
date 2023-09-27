package modelo;

import Acces_fitxer.GestioFitxer;
import java.util.ArrayList;
import vista.MiGestorEntrada;
import vista.MiGestorSortida;

public class GestioParaules {
    public static void afegirParaula() {
        String paraula = MiGestorEntrada.demanarParaules("Introduir nova paraula: ");
        if (validarParaula(paraula) && !cercarParaula(paraula)) {
            paraula = paraula.toUpperCase();
            GestioFitxer.escriureFitxerParaules(paraula);
        }

    }

    private static boolean validarParaula(String paraula) {
        if (paraula.toUpperCase().matches("[A-Z]")) {
            return true;
        }else{
            MiGestorSortida.imprimirText("Paraula en mal format");
            return false;
        }
    }

    private static boolean cercarParaula(String paraula) {
        ArrayList<String> paraules = GestioFitxer.getLlistaParaules();
        for (String p : paraules) {
            if (p.equals(paraula)) {
                MiGestorSortida.imprimirText("Paraula existent");
                return true;
            }
        }
        return false;
    }
}
