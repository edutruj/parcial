package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Scanner;

public class Calculo_MCD {

    public static void main(String[] args) {
        int numero1 = obtenerNumeroP("Ingrese el primer número: ");
        int numero2 = obtenerNumeroP("Ingrese el segundo número: ");

        int mcd = calcularMCD(numero1, numero2);
        System.out.println("El MCD es: " + mcd);
    }

    private static int obtenerNumeroP(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print(mensaje);
            numero = scanner.nextInt();
        } while (numero <= 0);
        return numero;
    }

    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}

