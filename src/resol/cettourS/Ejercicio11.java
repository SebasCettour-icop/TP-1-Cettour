package resol.cettourS;

import java.util.Scanner;

//Lo hice con mucha ayuda de chatgpt porque no me salió

public class Ejercicio11 {

    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Colores.BOLD + Colores.AMARILLO + "Ingrese el número de términos de la serie de Fibonacci que desea ver: " + Colores.RESET);
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.print(Colores.BOLD + Colores.AMARILLO + fibonacci(i) + " " +Colores.RESET);
        }
    }

    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}

