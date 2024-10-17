package IntroduccionJava;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        horas = scanner.nextInt();
        System.out.print("Ingrese la minuto: ");
        minutos = scanner.nextInt();
        System.out.print("Ingrese la segundo: ");
        segundos = scanner.nextInt();

        segundos = segundos + 1;
        if (segundos > 59) {
            segundos = 0;
            minutos = minutos + 1;
            if (minutos > 59) {
                minutos = 0;
                horas = horas + 1;
            }
        }
        System.out.printf("Ahora son %d:%d:%d %n    ", horas, minutos, segundos);
    }
}