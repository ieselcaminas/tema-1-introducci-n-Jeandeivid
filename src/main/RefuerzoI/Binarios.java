import java.util.Scanner;

public class Binarios {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número decimal
        System.out.print("Ingrese un número decimal: ");
        int numeroDecimal = scanner.nextInt();

        // Convertir a binario, octal y hexadecimal
        String binario = Integer.toBinaryString(numeroDecimal);
        String octal = Integer.toOctalString(numeroDecimal);
        String hexadecimal = Integer.toHexString(numeroDecimal).toUpperCase(); // Convertimos a mayúsculas para mostrar el hexadecimal

        // Mostrar los resultados
        System.out.println("Número en binario: " + binario);
        System.out.println("Número en octal: " + octal);
        System.out.println("Número en hexadecimal: " + hexadecimal);

        // Cerrar el escáner
        scanner.close();
    }
}
