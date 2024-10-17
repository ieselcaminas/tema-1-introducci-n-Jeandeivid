import java.util.Scanner;

public class Refuerzo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Introduzca un numero entero");
        numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("El producto de 0 por cualquier " + "número es 0");
        }else{
            System.out.println("Introduzca otro numero entero");
            numero2 = sc.nextInt();
            System.out.println("La multiplicacion es: " + numero * numero2);

        }
    }
}
