package resol.cettourS;

import java.util.ArrayList;

public class Ejercicio14 {
    public void resolver() {

        int[][] original = {
                {1, 2, 0, 3, 0, 7},
                {0, 0, 0, 0},
                {0, 6, 9, 8, 0, 9, 6},
                {0, 0, 0, 0, 7, 9, 0, 0},
                {0, 0, 0, 0, 0},
                {8, 7, 0, 8, 9, 0, 8}
        };

        System.out.println(Colores.BOLD + Colores.CYAN + "Arreglo original:" + Colores.RESET);
        mostrar(original);

        ArrayList<int[]> resultado = new ArrayList<>();

        for (int[] fila : original) {
            ArrayList<Integer> nuevaFila = new ArrayList<>();

            for (int num : fila) {
                if (num != 0) {
                    nuevaFila.add(num);
                }
            }

            if (!nuevaFila.isEmpty()) {
                int[] filaSinCeros = nuevaFila.stream().mapToInt(Integer::intValue).toArray();
                resultado.add(filaSinCeros);
            }
        }

        int[][] arregloFinal = resultado.toArray(new int[0][]);

        System.out.println(Colores.BOLD + Colores.CYAN + "\nArreglo resultante (sin ceros y filas vacías):" +Colores.RESET);
        mostrar(arregloFinal);
    }

    public void mostrar(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
