package BasicExercisesI;
import java.util.Scanner;
public class Ejercicio86 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        n = scanner.nextInt();
        System.out.println("Iniciando con n = " + n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.println("n = " + n);
        }
        System.out.println("Proceso terminado, n = 1");
    }
}
