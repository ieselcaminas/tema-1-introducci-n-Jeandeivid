import java.util.Scanner;

public class Refuerzo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero2;
        System.out.println("Introduzca un numero entero: ");
        numero = sc.nextInt();

        if (numero % 10 == 0) {
            System.out.println("El numero " + numero + " es multiplo de 10");

            System.out.print("Introduce otro número entero: ");
            numero2 = sc.nextInt();

            if (numero2 % 10 == 0) {
                System.out.println("El segundo número " + numero2 + " también es múltiplo de 10.");
            } else {
                System.out.println("El segundo número " + numero2 + " no es múltiplo de 10.");
            }
        } else {
            System.out.println("El número " + numero + " no es múltiplo de 10.");
        }

        }
    }

