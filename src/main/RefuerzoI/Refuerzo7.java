import java.util.Scanner;

public class Refuerzo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduzca un numero entero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0 || numero % 3 == 0) {
            System.out.println("El numero " + numero + " es multiplo de 2 o de 3");
        }else{
            System.out.println("El numero " + numero + " es NO multiplo de 2 NI de 3");
        }
    }
}
