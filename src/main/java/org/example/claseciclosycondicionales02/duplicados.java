package ciaf.prograIV.claseciclosycondicionales02;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class duplicados {
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


    List<Integer> listaSinDuplicados = eliminarDuplicados(lista);
    System.out.println("Lista sin duplicados: " + listaSinDuplicados);
}

private static List<Integer> eliminarDuplicados(List<Integer> lista) {

    Set<Integer> conjunto = new HashSet<>(lista);


    List<Integer> listaSinDuplicados = new ArrayList<>(conjunto);

    return listaSinDuplicados;
}
}