package resol.cettourS;

import java.util.Scanner;

public class Ejercicio5 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String input = scanner.nextLine();
        char[] palabra = input.toLowerCase().toCharArray(); //convierto todo a minusculas
        boolean esPalindromo = true;

        for (int i = 0, j = palabra.length - 1; i < j; i++, j--) { // recorro el array con i desde posicion -1 y con j desde el final de la palabra
            if (palabra[i] != palabra[j]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println(Colores.VERDE + "La palabra \"" + input + "\" es un palíndromo." + Colores.RESET);

        } else {
            System.out.println(Colores.ROJO + "La palabra \"" + input + "\" no es un palíndromo." + Colores.RESET);

        }

    }
}
