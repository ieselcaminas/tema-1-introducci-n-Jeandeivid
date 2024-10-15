package IntroduccionJava;
import java.util.Scanner;
public class Ej21 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("El año " + year  + " es bisiesto.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " no es bisiesto.");
        }
    }
}