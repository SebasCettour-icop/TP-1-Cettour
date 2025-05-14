package resol.cettourS;

import java.util.Scanner;

public class Ejercicio3 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Colores.BOLD + Colores.VERDE + numero + "*" + i + " " + "=" + " " + (numero * i) + Colores.RESET);

        }

    }
}
