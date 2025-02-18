import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un párrafo de texto:"); // Solicitamos al usuario el párrafo
        String texto = scanner.nextLine();

        // Contamos las vocales y consonantes
        int[] conteo = contarVocalesConsonantes(texto);
        System.out.println("Cantidad de vocales: " + conteo[0]);
        System.out.println("Cantidad de consonantes: " + conteo[1]);

        System.out.println("Digite el carácter que desea buscar:");  // Solicitamos al usuario el carácter que desea buscar
        char caracter = scanner.next().charAt(0);
        buscarCaracter(texto, caracter);

        scanner.close();
    }

    // Creamos el método para contar la cantidad de vocales y consonantes 
    static int[] contarVocalesConsonantes(String texto) { 
        int vocales = 0, consonantes = 0;
        texto = texto.toLowerCase();

        for (char l : texto.toCharArray()) {
            if (Character.isLetter(l)) {
                if (esVocal(l)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        return new int[]{vocales, consonantes};
    }

    // Método para verificar si el carácter es una vocal
    static boolean esVocal(char letra) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (char v : vocales) {
            if (letra == v) {
                return true;
            }
        }
        return false;
    }

    // Creamos el método para buscar el carácter solicitado e imprimimos sus posiciones. 
    static void buscarCaracter(String texto, char caracter) {
        System.out.println("El carácter '" + caracter + "' está en las siguientes posiciones:");
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                System.out.println(i);
            }
        }
    }
}
