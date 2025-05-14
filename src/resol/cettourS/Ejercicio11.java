package resol.cettourS;

import java.util.Scanner;

//Lo hice con mucha ayuda de chatgpt porque no me salió

public class Ejercicio11 {

    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie de Fibonacci que desea ver: ");
        int n = scanner.nextInt();  // Lee el número de términos que el usuario quiere ver


        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");  // Llama a la función fibonacci para cada término
        }
    }


    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;  // Caso base: el primer y segundo término son 1
        } else {
            // Recursión: fib(n) = fib(n-1) + fib(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Ejercicio11 ejercicio = new Ejercicio11();
        ejercicio.resolver();
    }
}

