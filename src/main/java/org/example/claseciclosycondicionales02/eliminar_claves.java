package ciaf.prograIV.claseciclosycondicionales02;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class eliminar_claves {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> hashMap = new HashMap<>();


        System.out.println("Ingrese claves y valores al HashMap (ingrese 'fin' para finalizar):");
        while (true) {
            System.out.print("nombre: ");
            String clave = scanner.next();

            if (clave.equals("fin")) {
                break;
            }

            System.out.print("Valor: ");
            int valor = scanner.nextInt();

            hashMap.put(clave, valor);
        }


        System.out.print("Ingrese un número para eliminar  valores menores: ");
        int limite = scanner.nextInt();


        eliminarClavesMenores(hashMap, limite);


        System.out.println("HashMap después de eliminar claves: " + hashMap);
    }

    private static void eliminarClavesMenores(Map<String, Integer> hashMap, int limite) {
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < limite) {
                iterator.remove();
            }
        }
    }

}
