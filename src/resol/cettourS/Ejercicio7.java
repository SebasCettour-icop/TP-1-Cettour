package resol.cettourS;


import java.util.Scanner;

public class Ejercicio7 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        int opcionElegida;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcionElegida = scanner.nextInt();

            switch (opcionElegida) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Ingrese el primer número: ");
                    int numero1 = scanner1.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    int numero2 = scanner1.nextInt();
                    System.out.println("La suma de los números elegidos es " + (numero1 + numero2));
                    break;

                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Ingrese el primer número");
                    int numero3 = scanner2.nextInt();
                    System.out.println("Ingrese el segundo número");
                    int numero4 = scanner2.nextInt();
                    System.out.println("La resta de los números elegidos es " + (numero3 - numero4));

                    break;

                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Ingrese el primer número");
                    int numero5 = scanner3.nextInt();
                    System.out.println("Ingrese el segundo número");
                    int numero6 = scanner3.nextInt();
                    System.out.println("La multiplicación del primer número por el segundo es " + (numero5 * numero6));

                    break;

                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Ingrese el primer número");
                    int numero7 = scanner4.nextInt();
                    System.out.println("Ingrese el segundo número");
                    int numero8 = scanner4.nextInt();
                    System.out.println("La división del primer número por el segundo es " + (numero7 / numero8));
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionElegida != 0);
    }
}