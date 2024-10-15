package IntroduccionJava;

import java.util.Scanner;

public class Ej37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena de números binarios: ");
        String binario = sc.nextLine();

        int decimal = 0;
        int longitud = binario.length();
        for (int i = 0; i < longitud; i++) {
            if (binario.charAt(i) == '1') {
                decimal = (int) (decimal + Math.pow(2, longitud - 1 - i));
            }
        }
        System.out.println("El valor decimal es; " + decimal);
    }
}
