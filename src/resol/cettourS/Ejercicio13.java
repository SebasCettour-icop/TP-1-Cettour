package resol.cettourS;

public class Ejercicio13 {
    public void resolver() {
        String[] nombres = {"Ana", "Luis", "María"};

        double[][] notas = {
                {8.0, 9.0, 8.5},
                {6.5, 7.0, 7.5},
                {9.0, 8.5, 8.0}
        };

        for (int i = 0; i < nombres.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println("Nombre del estudiante: " + nombres[i] + " - Promedio: " + promedio);
        }
    }
    }
