import java.util.Arrays;
import java.util.Scanner;

public class mayorMenor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Creamos Obj Scanner
        
       
        System.out.println("Ingrese longitud del array:"); // Solicitamos al usuario que digite la longitud del array
        int n = scanner.nextInt();
        int[] arr = new int[n]; // Creamos una instancia vacia
        
        llenar(arr);
        
        // Solicitamos al usuario si desea ver el numero mayor o el menor del array 
        System.out.println("Imprimir Máximo (M) o mínimo (m):");
        char opc = scanner.next().charAt(0);
        
        int[] resultado = new int[2];
        
        
        if (opc == 'M') {  // Verificamos la opción ingresada por el usuario
            resultado = mayor(arr);
            System.out.println("El dato mayor es: " + resultado[0]);
            System.out.println("Ubicado en la posición: " + resultado[1]);
        } else {
            resultado = menor(arr);
            System.out.println("El dato menor es: " + resultado[0]);
            System.out.println("Ubicado en la posición: " + resultado[1]);
        }
        
        // Imprimimos el array generado
        System.out.println("Array:");
        System.out.println(Arrays.toString(arr));
        
        scanner.close();
    }

    // Llenado Aleatorio 
    static void llenar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 500);
        }
    }

    // Método para el número mayor, y su posición. 
    static int[] mayor(int[] a) {
        int[] res = new int[2];
        res[0] = a[0]; // Se inicializa el mayor con el primer elemento
        res[1] = 0; // Se nicializa la posición del mayor en 0
        
        
        for (int k = 1; k < a.length; k++) {  // Recorre el array en busca del mayor valor
            if (res[0] < a[k]) {
                res[0] = a[k]; // Actualiza el mayor valor
                res[1] = k; // Actualiza la posición del mayor valor
            }
        }
        return res;
    }

    // Método para el número menor y su posición.
    static int[] menor(int[] a) {
        int[] res = new int[2];
        res[0] = a[0]; // Se inicializa el menor con el primer elemento
        res[1] = 0; // Se inicializa la posición del menor en 0
        
      
        for (int k = 1; k < a.length; k++) {   // Recorre el array en busca del menor valor
            if (res[0] > a[k]) {
                res[0] = a[k]; // Actualiza el menor valor
                res[1] = k; // Actualiza la posición del menor valor
            }
        }
        return res;
    }
}
