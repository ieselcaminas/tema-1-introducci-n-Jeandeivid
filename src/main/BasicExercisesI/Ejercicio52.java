package BasicExercisesI;

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3;
        boolean comprobacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        num = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextInt();
        System.out.println("Introduzca el tercer numero");
        num3 = sc.nextInt();

        comprobacion = (num + num2) == num3;
        System.out.println("El resultado es: " + comprobacion);


    }
}
