import java.util.Scanner;

public class Refuerzo15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tiempoEnSegundos;

        System.out.println("Ingrese el tiempo en segundos");
        tiempoEnSegundos = scanner.nextInt();

        int horas = tiempoEnSegundos / 3600;
        int minutos = (tiempoEnSegundos % 3600) / 60;
        int segundos = tiempoEnSegundos % 60;

        System.out.println("El tiempo es: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");

        scanner.close();
    }
}