package resol.cettourS;

import java.util.Scanner;

public class Ejercicio10 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una contraseña (al menos 8 caracteres, al menos 2 mayúsculas, 3 minúsculas y 2 números)");
        String password = scanner.nextLine();


        int mayusculas = 0;
        for (int i = 0; i < password.length(); i++) {
            char caracter = password.charAt(i); // Obtiene el carácter en la posición i de la contraseña
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            }
        }

        int minusculas = 0;
        for (int i = 0; i < password.length(); i++) {
            char caracter = password.charAt(i);
            if (Character.isLowerCase(caracter)) {
                minusculas++;
            }
        }

        int numeros = 0;
        for (int i = 0; i < password.length(); i++) {
            char caracter = password.charAt(i);
            if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        if (password.length() >= 8 && mayusculas >= 2 && minusculas >= 3 && numeros >= 2) {
            System.out.println("¡Contraseña segura!");
        } else {
            System.out.println("¡Contraseña débil! Recuerde que la contraseñe debe tener al menos 8 caracteres, " +
                    "al menos 2 mayúsculas, 3 minúsculas y 2 números ");
        }


    }
}
