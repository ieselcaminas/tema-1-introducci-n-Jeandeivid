import java.util.Scanner;

public class Refuerzo2 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero entero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero entero " + numero + " es par");

        }


    }
}
