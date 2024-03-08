package ciaf.prograIV.claseciclosycondicionales02;
import java.util.Scanner;
public class producto_de_pares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el tamaño del vector: ");
        int tamano = scanner.nextInt();


        int[] vector = new int[tamano];


        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }


        int productoPares = productoEPares(vector);
        System.out.println("El producto de los elementos pares del vector es: " + productoPares);
    }

    private static int productoEPares(int[] vector) {
        int producto = 1;

        for (int elemento : vector) {
            if (elemento % 2 == 0) {
                producto *= elemento;
            }
        }

        return producto;
    }
}


