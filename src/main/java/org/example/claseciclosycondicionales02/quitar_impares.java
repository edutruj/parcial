package ciaf.prograIV.claseciclosycondicionales02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class quitar_impares{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> lista = new ArrayList<>();


        System.out.println("Ingrese los elementos de la lista (ingrese -0 para finalizar):");
        int elemento;
        do {
            System.out.print("Elemento: ");
            elemento = scanner.nextInt();
            if (elemento != -0) {
                lista.add(elemento);
            }
        } while (elemento != -0);


        eliminarImpares(lista);
        System.out.println("Lista después de eliminar impares: " + lista);
    }

    private static void eliminarImpares(List<Integer> lista) {
        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()) {
            int elemento = iterator.next();
            if (elemento % 2 != 0) {
                iterator.remove();
            }
        }
    }
}
