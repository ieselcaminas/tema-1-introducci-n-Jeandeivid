import java.util.Scanner;

public class Refuerzo16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int mayor;
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor de los tres números es: " + mayor);

        scanner.close();
    }
}
