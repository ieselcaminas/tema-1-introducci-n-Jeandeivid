package IntroduccionJava;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        double precio;
        double descuento = 0.0;
        double precioFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto en euros: ");
        precio = scanner.nextDouble();

        if (precio < 6) {
            descuento = 0;
        } else if (precio >= 6 && precio < 60) {
            descuento = 0.05;
        } else if (precio >= 60) {
            descuento = 0.10;
        }

        precioFinal = precio - (precio * descuento);


        System.out.printf("El precio final después del descuento es: %.2f euros", precioFinal);

        scanner.close();
    }
}