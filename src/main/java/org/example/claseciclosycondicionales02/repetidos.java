package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Scanner;

public class repetidos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = obtenerNumeroP(scanner, "Ingrese un número: ");


        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        } else {
            int digito = obtenerDigito(scanner, "Ingrese un dígito: ");
            int cantidadApariciones = contarAparicionesDigitos(numero, digito);
            System.out.println("El dígito " + digito + " aparece " + cantidadApariciones + " veces en el número " + numero);
        }
    }

    private static int obtenerNumeroP(Scanner scanner, String mensaje) {
        int numero;
        do {
            System.out.print(mensaje);
            numero = scanner.nextInt();
        } while (numero <= 0);
        return numero;
    }

    private static int obtenerDigito(Scanner scanner, String mensaje) {
        int digito;
        do {
            System.out.print(mensaje);
            digito = scanner.nextInt();
        } while (digito < 0 || digito > 9);
        return digito;
    }

    private static int contarAparicionesDigitos(int numero, int digito) {
        int contador = 0;
        char digitoChar = (char) (digito + '0');
        String numeroStr = Integer.toString(numero);

        for (int i = 0; i < numeroStr.length(); i++) {
            if (numeroStr.charAt(i) == digitoChar) {
                contador++;
            }
        }

        return contador;
    }
}