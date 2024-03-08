package ciaf.prograIV.claseciclosycondicionales02;

import java.util.Scanner;

public class calculo {
    public static void main(String[] args) {
        System.out.println("Cantidad inicial invertida:");
        Scanner sc= new Scanner(System.in);
        int cantidad = sc.nextInt();
        System.out.println("número de años:");
        Scanner siuc= new Scanner(System.in);
        int anos = siuc.nextInt();

        System.out.println("su valor inicial es  "+  cantidad + " en  " +  anos + " años" +" da una ganancia de " + ( (cantidad * anos * 0.6) / 100)+"pesos") ;

    }
}

