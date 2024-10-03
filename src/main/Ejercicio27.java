import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
         n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}