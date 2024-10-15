package BasicExercisesI;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        int num;
        int digito;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        num = sc.nextInt();
        do {
            digito = num % 10;
            suma += digito;
            num = num / 10;
        }while (num > 10);
        System.out.println(suma + num);
        }
    }

