import java.util.Scanner;

public class Refuerzo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Introduzca un numero entero: ");
        numero = sc.nextInt();
        System.out.println("Introduzca otro numero entero: ");
        numero2 = sc.nextInt();
         if (numero % numero2 == 0) {
             System.out.println("El numero " + numero + " es multiplo de: " + numero2);

         }
    }
}
