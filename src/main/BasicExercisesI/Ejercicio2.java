package BasicExercisesI;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int n;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        n = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();

        System.out.println("La suma es" + (n + n2));
    }
}
