package resol.cettourS;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Saludador");
            System.out.println("2. Numero Par");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Contar vocales en una palabra");
            System.out.println("5. Palíndromo");
            System.out.println("6. Adivina el número");
            System.out.println("7. Menú interactivo (switch-case)");
            System.out.println("8. Conversor de temperatura");
            System.out.println("9. Cuenta palabras");
            System.out.println("10. Validar contraseña segura");
            System.out.println("11. Fibonacci");
            System.out.println("12. Arreglo unidimensional");
            System.out.println("13. Notas de estudiantes");
            System.out.println("14. Quitando ceros");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción (0-14): ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    new Ejercicio1().resolver();
                    break;

                case 2:
                    new Ejercicio2().resolver();
                    break;

                case 3:
                    new Ejercicio3().resolver();
                    break;

                case 4:
                    new Ejercicio4().resolver();
                    break;

                case 5:
                    new Ejercicio5().resolver();
                    break;

                case 6:
                    new Ejercicio6().resolver();
                    break;

                case 7:
                    new Ejercicio7().resolver();
                    break;

                case 8:
                    new Ejercicio8().resolver();
                    break;
                case 9:
                    new Ejercicio9().resolver();
                    break;
                case 10:
                    new Ejercicio10().resolver();
                    break;
                case 11:
                    new Ejercicio11().resolver();
                    break;
                case 12:
                    new Ejercicio12().resolver();
                    break;
                case 13:
                    new Ejercicio13().resolver();
                    break;
                case 14:
                    new Ejercicio14().resolver();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}