package Acces_fitxer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import vista.MiGestorEntrada;
import vista.MiGestorSortida;

public class GestioFitxer {

    //Fitxero Matricula
    static String rutaFitxerParaules = "paraules.txt";
    static String rutaDirectoriParaules = "fitxers";
    static String rutaFitxerRankings = "ranking.txt";

    static File fitxerParaules = new File(rutaDirectoriParaules + "/" + rutaFitxerParaules);
    static File fitxerRankings = new File(rutaDirectoriParaules + "/" + rutaFitxerRankings);
    static File directoriParaules = new File(rutaDirectoriParaules);

    public static void crearFitxerParaules() {
        if (!directoriParaules.exists()) {
            directoriParaules.mkdir();
        }

        try {
            if (!fitxerParaules.exists()) {
                fitxerParaules.createNewFile();
            }
        } catch (Exception ex) {
            MiGestorSortida.imprimirText("ERROR AL CREAR EL FITXER ");
        }

    }

    public static void escriureFitxerParaules(String paraula) {
        try {
            FileWriter fw = new FileWriter(fitxerParaules, true);
            fw.write(
                    paraula + ";"
            );
            fw.close();
        } catch (Exception ex) {
            MiGestorSortida.imprimirText("ERROR D'ESCRIPTURA ");
        }

    }

    public static void reescriureFitxerParaules(ArrayList<String> paraules) {
        try {
            FileWriter fw = new FileWriter(fitxerParaules, true);
            FileWriter fw2 = new FileWriter(fitxerParaules);
            fw2.write("");
            for (String p : paraules) {
                fw.write(
                        p + ";"
                );
            }

            fw.close();
        } catch (Exception ex) {
            MiGestorSortida.imprimirText("ERROR D'ESCRIPTURA ");
        }

    }

    public static ArrayList<String> getLlistaParaules() {
        ArrayList<String> paraules = new ArrayList();

        if (fitxerParaules.length() > 0) {
            try ( Scanner lector = new Scanner(fitxerParaules)) {

                lector.useDelimiter(";");

                while (lector.hasNext()) {
                    paraules.add(lector.next());
                }
            } catch (Exception ex) {
                MiGestorSortida.imprimirText("ERROR DE LECTURA");
            }
        }
        return paraules;
    }
    
    public static ArrayList<String> getLlistaRankings() {
        ArrayList<String> paraules = new ArrayList();

        if (fitxerRankings.length() > 0) {
            try ( Scanner lector = new Scanner(fitxerRankings)) {

                lector.useDelimiter(";");

                while (lector.hasNext()) {
                    paraules.add(lector.next());
                }
            } catch (Exception ex) {
                MiGestorSortida.imprimirText("ERROR DE LECTURA");
            }
        }
        return paraules;
    }

}
