package ciaf.prograIV.claseciclosycondicionales02;
import java.util.Scanner;
public class Maxi_vector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("tamaño del vector: ");
        int tamano = scanner.nextInt();


        int[] vector = new int[tamano];


        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese los valores " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }


        int maximo = encontrarElementoMaximo(vector);
        System.out.println("El elemento máximo es: " + maximo);
    }

    private static int encontrarElementoMaximo(int[] vector) {
        int maximo = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }

        return maximo;
    }

}
