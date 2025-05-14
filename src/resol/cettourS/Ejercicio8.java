package resol.cettourS;

import java.util.Scanner;

public class Ejercicio8 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-- Menú --");
            System.out.println("1. Convertir de Celcius a Farenheit");
            System.out.println("2. Convertir de Farenheit a Celcius");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Ingrese los grados Celcius que desea convertir a Farenheit");
                    int gradosC = scanner1.nextInt();
                    System.out.println(Colores.BOLD + Colores.CYAN + gradosC + " grados Celcius " + "equivalen a " + ((gradosC * 9 / 5) + 32) + " grados Farenheit." + Colores.RESET);
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println(Colores.BOLD + Colores.CYAN + "Ingrese los grados Farenheit que desea convertir a Celcius");
                    int gradosF = scanner2.nextInt();
                    System.out.println(gradosF + " equivalen a " + ((gradosF - 32) * 5 / 9) + " grados Celcius" + Colores.RESET);


            }

        } while (opcion != 0);

    }
}