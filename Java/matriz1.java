import java.util.Scanner;
import java.util.Random;

public class matriz1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitamos al usuario el tamaño de la matriz
        System.out.println("Ingrese el número de filas:");
        int filas = scanner.nextInt();
        System.out.println("Ingrese el número de columnas:");
        int columnas = scanner.nextInt();

        // Creamos la matriz
        int[][] matriz = new int[filas][columnas];

        llenarMatriz(matriz, random);

        // Imprimimos la matriz 
        System.out.println("Matriz: ");
        imprimirMatriz(matriz);

        // Solicitamos al usuario si desea sumar (filas o columnas)
        System.out.println("Desea sumar por fila (F) o por columna (C)?");
        char opcion = scanner.next().charAt(0);

        if (opcion == 'F') {
            int[] sumaFilas = sumarFilas(matriz);
            System.out.println("Suma por fila: ");
            sumaTotal(sumaFilas);
        } else {
            int[] sumaColumnas = sumarColumnas(matriz);
            System.out.println("Suma por columna: ");
            sumaTotal(sumaColumnas);
        }

        scanner.close();
    }

    //Creamos el método para llenar la matriz con valores aleatorios 
    static void llenarMatriz(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(101);
            }
        }
    }
    static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Creamos el método para la suma de las filas 
    static int[] sumarFilas(int[][] matriz) {
        int[] suma = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma[i] += matriz[i][j];
            }
        }
        return suma;
    }

    // Creamos el método para la suma de las columnas 
    static int[] sumarColumnas(int[][] matriz) {
        int[] suma = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                suma[j] += matriz[i][j];
            }
        }
        return suma;
    }

    static void sumaTotal(int[] vector) {
        for (int valor : vector) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
