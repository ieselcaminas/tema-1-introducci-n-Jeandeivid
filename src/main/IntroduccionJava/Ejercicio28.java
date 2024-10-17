
package IntroduccionJava;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        boolean esPrimo = true;

        if (numero < 2) {
            esPrimo = false;
        }
        else if (numero == 2) {
            esPrimo = true;
        }
        else if (numero % 2 == 0) {
            esPrimo = false;
        }
        else {
            for (int i = 3; i <= numero / 2; i += 2) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }
}
