
package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Scanner;

public class vector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector máximo 10: ");
        int tamano = scanner.nextInt();

        if (tamano > 10 || tamano <= 0) {
            System.out.println("El tamaño del vector debe ser entre 1 y 10.");
            return;
        }


        int[] vect = new int[tamano];


        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vect[i] = scanner.nextInt();
        }


        int suma = sumaElementosVector(vect);
        System.out.println("La suma de los elementos del vector es: " + suma);
    }

    private static int sumaElementosVector(int[] vector) {
        int suma = 0;
        for (int elemento : vector) {
            suma += elemento;
        }
        return suma;
    }
}

