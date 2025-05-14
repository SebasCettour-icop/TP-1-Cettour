package resol.cettourS;

import java.sql.ResultSet;
import java.util.Scanner;

import resol.cettourS.Colores;

public class Ejercicio1 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println(Colores.AMARILLO + Colores.BOLD + ("¡Hola " + nombre + "!").toUpperCase() + Colores.RESET);
    }
}
