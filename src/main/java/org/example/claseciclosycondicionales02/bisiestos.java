package ciaf.prograIV.claseciclosycondicionales02;
import java.util.Scanner;
public class bisiestos {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor, ingresa un año:");
            int ano = sc.nextInt();

            if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println(ano + " es un año bisiesto.");
            } else {
                System.out.println(ano + " no es un año bisiesto.");
            }
        }
    }


