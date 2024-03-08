package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Scanner;

public class conversor_moneda {
    public static void main(String[] args) {
        System.out.println("Ingresa el valor a convertir:");
        Scanner sc= new Scanner(System.in);
        int valor_usd= sc.nextInt();
        Scanner scanner = new Scanner(System.in);
        double total_usa= (valor_usd / 3919.52);
        double total_eur= (valor_usd / 4272.55);
        double total_yens= (valor_usd / 26.38);
        int opcion;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Dolares");
            System.out.println("2. euros");
            System.out.println("3. yens");
            System.out.println("4.TERMINAR");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("su valor en pesos  es "+  valor_usd + " en Dolares son " +  total_usa + " dolares");

                    break;
                case 2:
                    System.out.println("su valor en pesos  es "+  valor_usd + " en Euros son "+  total_eur +" Euros");

                    break;
                case 3:
                    System.out.println("su valor en pesos  es "+  valor_usd + " en Yens son "+  total_yens +"Yens");

                    break;
                case 4:
                    System.out.println("TERMINO");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }
}