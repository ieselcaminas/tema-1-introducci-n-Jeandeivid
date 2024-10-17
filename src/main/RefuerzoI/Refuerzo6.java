import java.util.Scanner;

public class Refuerzo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Introduzca el numero entero");
        numero = sc.nextInt();
        System.out.println("Introduzca otro numero entero");
        numero2 = sc.nextInt();

        if (numero2 == 0) {

            System.out.println("Error: No se puede dividir entre cero.");
        } else {

            System.out.println("La division es: " + numero / numero2);

        }
    }
}
