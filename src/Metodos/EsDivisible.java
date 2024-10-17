package Metodos;

import java.util.Scanner;

public class EsDivisible {
    public static boolean esDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = Utilidades.leerEntero("Introduce un numero");
        int b = Utilidades.leerEntero("Introduce otro numero");
        if (esDivisible(a, b)) {
            System.out.println("El número es divisible");
        } else {
            System.out.println("El número no es divisible");
        }
    }
}