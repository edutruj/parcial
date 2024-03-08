package ciaf.prograIV.claseciclosycondicionales02;
import java.util.Scanner;
public class Ordenamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero : ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese otro número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese un ultimo número: ");
        int num3 = scanner.nextInt();


        int mayor = num1;
        int intermedio = num2;
        int menor = num3;

        if (num2 > mayor) {
            mayor = num2;
            intermedio = num1;
        } else if (num2 < menor) {
            menor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
            intermedio = Math.max(num1, num2);
            menor = Math.min(num1, num2);
        } else if (num3 < menor) {
            menor = num3;
        }

        System.out.println("El orden de sus números es:");
        System.out.println("El número Menor es: " + menor);
        System.out.println("El número Intermedio es: " + intermedio);
        System.out.println("El número Mayor es: " + mayor);
    }
}
