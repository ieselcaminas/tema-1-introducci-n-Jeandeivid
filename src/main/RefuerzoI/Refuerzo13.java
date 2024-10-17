import java.util.Scanner;

public class Refuerzo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Introduzca un numero entero: ");
        numero = sc.nextInt();
        System.out.println("Introduzca otro numero entero: ");
        numero2 = sc.nextInt();

        if (numero % 2 == 0 && numero2 % 2 != 0) {
            System.out.println("Sólo uno es par");
        }else if (numero % 2 != 0 && numero2 % 2 == 0) {
            System.out.println("Sólo uno es par");
        }
    }
}
