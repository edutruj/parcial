package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Scanner;
import java.util.Random;

public class aleatorios {

    public static void main(String[] args) {
        System.out.println("Juego de suma:");

        while (true) {
            int numero1 = generarNumeroAleatorio();
            int numero2 = generarNumeroAleatorio();
            int sumaCorrecta = numero1 + numero2;

            System.out.println("¿Cuál es la suma de " + numero1 + " y " + numero2 + "?");

            int respuestaUsuario = obtenerRespuestaUsuario();

            if (respuestaUsuario == sumaCorrecta) {
                System.out.println("¡Correcto! La suma es " + sumaCorrecta);
            } else {
                System.out.println("Incorrecto. La respuesta correcta es " + sumaCorrecta);
            }

            System.out.print("¿Quieres jugar otra vez? (Sí/No): ");
            Scanner scanner = new Scanner(System.in);
            String continuar = scanner.next().toLowerCase();

            if (!continuar.equals("si")) {
                break;
            }
        }
    }

    private static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    private static int obtenerRespuestaUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la suma: ");
        return scanner.nextInt();
    }
}