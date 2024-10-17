import java.util.Scanner;

public class Refuerzo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else if (num1 > num2) {
            System.out.println("El mayor número es: " + num1);
        } else {
            System.out.println("El mayor número es: " + num2);
        }

        scanner.close();
    }
}