package ciaf.prograIV.claseciclosycondicionales02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class estudiantes {

    public static void main(String[] args) {
        Map<String, List<Double>> calificacionesMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante 1:");
        String estudiante1 = scanner.nextLine();
        List<Double> calificacionesEstudiante1 = obtenerCalificaciones(3);

        System.out.println("Ingrese el nombre del estudiante 2:");
        String estudiante2 = scanner.nextLine();
        List<Double> calificacionesEstudiante2 = obtenerCalificaciones(3);

        System.out.println("Ingrese el nombre del estudiante 3:");
        String estudiante3 = scanner.nextLine();
        List<Double> calificacionesEstudiante3 = obtenerCalificaciones(3);

        calificacionesMap.put(estudiante1, calificacionesEstudiante1);
        calificacionesMap.put(estudiante2, calificacionesEstudiante2);
        calificacionesMap.put(estudiante3, calificacionesEstudiante3);

        calcularPromedioCalificaciones(calificacionesMap);
    }

    private static List<Double> obtenerCalificaciones(int cantidadNotas) {
        Scanner scanner = new Scanner(System.in);
        List<Double> calificaciones = new ArrayList<>();

        for (int i = 0; i < cantidadNotas; i++) {
            double calificacion;
            do {
                System.out.println("Ingrese la calificación " + (i + 1) + " (nota máxima de 5):");
                calificacion = scanner.nextDouble();

                if (calificacion < 0 || calificacion > 5) {
                    System.out.println("La calificación ingresada no es válida. Por favor, inténtelo de nuevo.");
                }
            } while (calificacion < 0 || calificacion > 5);

            calificaciones.add(calificacion);
        }

        return calificaciones;
    }

    private static void calcularPromedioCalificaciones(Map<String, List<Double>> calificacionesMap) {
        for (Map.Entry<String, List<Double>> entry : calificacionesMap.entrySet()) {
            String estudiante = entry.getKey();
            List<Double> calificaciones = entry.getValue();

            double sumaCalificaciones = 0.0;
            for (Double calificacion : calificaciones) {
                sumaCalificaciones += calificacion;
            }

            double promedio = sumaCalificaciones / calificaciones.size();
            System.out.println("Estudiante: " + estudiante);
            System.out.println("Calificaciones: " + calificaciones);
            System.out.println("Promedio de calificaciones: " + promedio);
            System.out.println();
        }
    }
}