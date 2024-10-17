import java.util.Scanner;

public class Refuerzo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca un numero entero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El numero " + numero + " es multiplo de 2 y de 3");
        }
    }
}
