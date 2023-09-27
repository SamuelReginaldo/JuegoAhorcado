package vista;

import java.util.ArrayList;
import java.util.Scanner;

public class MiGestorEntrada {
    
    public static String demanarParaules(String info) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print(info);
        
        return lector.nextLine();
    }
    
}
