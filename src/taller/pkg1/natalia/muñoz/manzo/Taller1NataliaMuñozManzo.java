package taller.pkg1.natalia.muñoz.manzo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taller1NataliaMuñozManzo {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("1.Nombres\n"
                + "2.Libros");
        System.out.println("Digite opción deseada:");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                nombres();
                menu();
                break;
            case 2:
                libros();
                menu();
                break;
            default:
                System.out.println("Digite opción válida!!");
                menu();
                break;
        }

    }

    public static void nombres() {
        String[][] personas = new String[3][3];
        Scanner entrada = new Scanner(System.in);
        for (int x = 0; x < personas.length; x++) {
            for (int y = 0; y < personas[x].length; y++) {
                System.out.println("Introduzca el nombre:");
                personas[x][y] = entrada.nextLine();
            }
        }
        for (int x = 0; x < personas.length; x++) {
            for (int y = 0; y < personas[x].length; y++) {
                System.out.println("[" + x + "," + y + "] = " + personas[x][y]);
            }
        }
        for (int x = 0; x < personas.length; x++) {
            for (int y = 0; y < personas[x].length; y++) {
                if (personas[x][y] == "C" && personas[x][y] == "G") {
                    String cadena = "[x][y]";
                    System.out.println(cadena.charAt(0));

                }
            }
        }

    }

    public static void libros() {
        Scanner entrada = new Scanner(System.in);
        List<String> listaLibr = new ArrayList<String>();
        System.out.println("Digite el nombre del libro deseado");
        String libro = entrada.nextLine();
//        while(lista >= "20"){
        System.out.println(listaLibr.add(libro));
        if (libro.equals(listaLibr)) {
            System.out.println("1.Alquilar. 2.Comprar");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                System.out.println("Ha alquilado un libro");
            } else {
                System.out.println("Ha comprado el libro");
            }
        }
    }

}
