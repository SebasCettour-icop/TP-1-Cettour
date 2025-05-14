package resol.cettourS;

import java.util.Scanner;

public class Ejercicio2 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        Integer numero = scanner.nextInt();
        if (numero % 2 != 0) {
            System.out.println(Colores.ROJO + Colores.BOLD + ("El número elegido es impar").toUpperCase() + Colores.RESET);
        } else {
            System.out.println(Colores.ROJO + Colores.BOLD + ("El número elegido es par").toUpperCase() + Colores.RESET);
        }

    }
}
