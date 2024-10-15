package IntroduccionJava;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        int numero;
        boolean primo = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        sc.close();
        if (numero == 2) {
            primo = true;
        }else{
            for(int i = 2; i < numero; i++){
                if(numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
            System.out.println("Es primo");
            }else{
                System.out.println("No es primo");

            }
        }
    }
}
