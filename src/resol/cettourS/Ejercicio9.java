package resol.cettourS;

import java.util.Scanner;

public class Ejercicio9 {
    public void resolver(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String input = scanner.nextLine();
        String[] palabras = input.split("[\\s,.;:!?]+"); // Separa por espacios y signos de puntuación
        int contador = 0;
        for(int i = 0; i< palabras.length; i++){
            if(!palabras[i].isEmpty()){
                contador++;
            }
        }
        System.out.println("Número total de palabras: " +contador);
    }
}