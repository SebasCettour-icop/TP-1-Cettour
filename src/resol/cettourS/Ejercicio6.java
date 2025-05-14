package resol.cettourS;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public void resolver() {
        Random random = new Random();
        int numAleatorio = random.nextInt(100); // número entre 0 y 99
        Scanner scanner = new Scanner(System.in);
        int numeroElegido;

        do {
            System.out.print(Colores.BOLD + Colores.VERDE + "Ingresa un número: " + Colores.RESET);
            numeroElegido = scanner.nextInt();

            if (numeroElegido > 99) {
                System.out.println(Colores.BOLD + Colores.ROJO + "¡El número elegido no puede ser mayor a 99!" + Colores.RESET);
            } else if (numeroElegido < numAleatorio) {
                System.out.println(Colores.BOLD + Colores.CYAN + "¡Más alto!" + Colores.RESET);
            } else if (numeroElegido > numAleatorio) {
                System.out.println(Colores.BOLD + Colores.AMARILLO + "¡Más bajo!" + Colores.RESET);
            } else {
                System.out.println(Colores.BOLD + Colores.NEGRO + Colores.FONDO_VERDE + "¡Acertaste!" + Colores.RESET);
            }
        } while (numeroElegido != numAleatorio);


    }
}
