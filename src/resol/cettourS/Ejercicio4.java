package resol.cettourS;

import java.util.Scanner;

public class Ejercicio4 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        String vocales = "aeiouAEIOU";
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.indexOf(palabra.charAt(i)) != -1) { //charAt devuelve el carácter en la posición 'i' de la cadena
                contador++;
            }
        }
        System.out.println(Colores.BOLD + Colores.AMARILLO + ("La palabra " + palabra + " " + "tiene " + contador + " " + "vocales ").toUpperCase() + Colores.RESET);
    }
}

//Se puede hacer recorriendo un array pero esta opción me pareció mejor
