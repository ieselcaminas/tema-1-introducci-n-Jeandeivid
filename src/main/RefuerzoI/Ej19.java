package RefuerzoI;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        double distancia = 1;
        double limite = 1; // kmH
        double segundos = 1;
        Scanner entrada = new Scanner(System.in);
        while (distancia != 0 && limite != 0 && segundos != 0) {
            System.out.print("Digite el valor de distancia: ");
            distancia = entrada.nextDouble();
            System.out.print("Digite el limite: ");
            limite = entrada.nextDouble();
            System.out.print("Digite el tiempo: ");
            segundos = entrada.nextDouble();

            segundos = distancia / segundos;
            limite = limite / 3.6;
            System.out.println("La velocidad es " + segundos );
            System.out.println("La velocidad limite es " + limite );


            if (segundos > limite ) {
                System.out.println("Multa");
            } else {
                System.out.println("No hay multa");

            }
        }
    }
}