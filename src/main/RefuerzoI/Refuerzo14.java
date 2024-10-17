import java.util.Scanner;

public class Refuerzo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        if (num1 > 0 && num2 > 0) {
            System.out.println("Los dos números son positivos.");
        } else if (num1 > 0 || num2 > 0) {
            System.out.println("Uno de los números es positivo.");
        } else {
            System.out.println("Ninguno de los números es positivo.");
        }
        scanner.close();
    }
}