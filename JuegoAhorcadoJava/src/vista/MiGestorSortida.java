package vista;

import java.util.ArrayList;

public class MiGestorSortida {
    
    public static void imprimirText(String text) {
        System.out.println("-----------------");
        System.out.println(text);
        System.out.println("-----------------");
    }
    
    public static String estatsAhorcat(int num){
        ArrayList<String> arrayStringsAhorcat = new ArrayList<String>();

        arrayStringsAhorcat.add(0,"           \n" +
        "           \n" +
        "           \n" +
        "            \n" +
        "            \n" +
        "           ");
        arrayStringsAhorcat.add(1,"           \n" +
        "           \n" +
        "           \n" +
        "            \n" +
        "            \n" +
        "          |");
        arrayStringsAhorcat.add(2,"           \n" +
        "           \n" +
        "           \n" +
        "            \n" +
        "           |\n" +
        "          |");
        arrayStringsAhorcat.add(3,"           \n" +
        "           \n" +
        "           \n" +
        "           |\n" +
        "           |\n" +
        "          |");
        arrayStringsAhorcat.add(4,"           \n" +
        "           \n" +
        "          |\n" +
        "           |\n" +
        "           |\n" +
        "          |");
        arrayStringsAhorcat.add(5,"           \n" +
        "          |\n" +
        "          |\n" +
        "           |\n" +
        "           |\n" +
        "          |");
        arrayStringsAhorcat.add(6,"        --+\n" +
        "          |\n" +
        "          |\n" +
        "           |\n" +
        "           |\n" +
        "          |");
        arrayStringsAhorcat.add(7,"      +---+\n" +
        "      |   |\n" +
        "          |\n" +
        "           |\n" +
        "           |\n" +
        "          |");
        arrayStringsAhorcat.add(8,"      +---+\n" +
        "      |   |\n" +
        "      O   |\n" +
        "           |\n" +
        "           |\n" +
        "          |");
        arrayStringsAhorcat.add(9,"      +---+\n" +
        "      |   |\n" +
        "      O   |\n" +
        "     /|\\  |\n" +
        "           |\n" +
        "          |");
        arrayStringsAhorcat.add(10,"      +---+\n" +
        "      |   |\n" +
        "      O   |\n" +
        "     /|\\  |\n" +
        "     / \\  |\n" +
        "          |");
        
        return arrayStringsAhorcat.get(num);
    }
}
