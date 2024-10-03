import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        long factorial = 1;
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        for (int i = 1;
             i <= numero;
             i++) {
            factorial = factorial * i;
            {
                System.out.print(" El factorial de " + numero + " es " + factorial);
            }
        }
    }
}