package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             System.out.print("Ingrese un número : ");
        int numero = obtenernumero(scanner);


        int sumaDigitos = sumarDigitos(numero);
        System.out.println("su suma es : " + sumaDigitos);
    }
    private static int obtenernumero(Scanner scanner) {
        int numero = 0;
        boolean entradaValida = false;

        do {
            try {
                numero = scanner.nextInt();

                if (numero < 0) {
                    throw new IllegalArgumentException("nada de negativos.");
                }

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: no es  un número positivo válido.");
                scanner.nextLine();
            }
        } while (!entradaValida);

        return numero;
    }

    private static int sumarDigitos(int numero) {
        int suma = 0;


        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }
}
