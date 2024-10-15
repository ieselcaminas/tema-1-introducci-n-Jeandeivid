package IntroduccionJava;


import java.util.Random;
import java.util.Scanner;

public class Ej38 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");


        Random aleatorio = new Random(System.currentTimeMillis());
        int secreto = aleatorio.nextInt(10000);

        do {
            numero = sc.nextInt();
            if (secreto > numero) {
                System.out.println("El numero secreto es mas alto introduce otro numero: ");
            }if (secreto < numero) {
                System.out.println("El numero secreto es mas bajo introduce otro numero: ");
            }if (secreto == numero) {
                System.out.println("Has ganado");
            }if (numero == -1) {
                System.out.println("Te rindes");
                break;
            }

        } while (secreto != numero);

    }
}

