package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Random;
import java.util.Scanner;

public class juego {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            int numeroAleatorio = random.nextInt(3) + 1;
            int intentoUsuario;

            System.out.println("Bienvenido piedra, papel y tijera!");
            System.out.println("1 = papel, 2 = piedra, 3 = tijera");
            System.out.print("Elige tu opción entre 1, 2, 3: ");
            intentoUsuario = scanner.nextInt();

            System.out.println("Hemos elegido: " + numeroAleatorio);

            if ((intentoUsuario == 1 && numeroAleatorio == 3) ||
                    (intentoUsuario == 2 && numeroAleatorio == 3) ||
                    (intentoUsuario == 1 && numeroAleatorio == 2) ||
                    (intentoUsuario == 3 && numeroAleatorio == 2) ||
                    (intentoUsuario == 2 && numeroAleatorio == 1) ||
                    (intentoUsuario == 3 && numeroAleatorio == 1)) {
                System.out.println("¡Ganaste!");
            } else if (intentoUsuario == numeroAleatorio) {
                System.out.println("Empate.");
                System.out.println("Ambos elegimos lo mismo.");
            } else {
                System.out.println("Perdiste.");
            }


            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            char jugarDeNuevo = scanner.next().charAt(0);

            if (jugarDeNuevo != 's' && jugarDeNuevo != 'S') {
                break;
            }

        } while (true);
    }
}