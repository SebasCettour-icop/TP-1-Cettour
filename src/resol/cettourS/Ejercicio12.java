package resol.cettourS;

import java.util.Scanner;

public class Ejercicio12 {
    public void resolver() {
        int[] numeros = new int[5];
        int[] numerosOrdenados = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            numerosOrdenados[i] = numeros[i];
        }
        for (int i = 0; i < numerosOrdenados.length; i++) {
            for (int j = 0; j < numerosOrdenados.length - 1; j++) {
                if (numerosOrdenados[j] < numerosOrdenados[j + 1]) {

                    int temporal = numerosOrdenados[j];
                    numerosOrdenados[j] = numerosOrdenados[j + 1];
                    numerosOrdenados[j + 1] = temporal;

                }
            }
        }
        System.out.println("Los números ordenados de mayor a menor son:");
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.print(numerosOrdenados[i] + ",");
        }
    }
}

