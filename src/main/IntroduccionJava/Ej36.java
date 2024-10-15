package IntroduccionJava;

import java.util.Scanner;

public class Ej36 {
    public static void main(String[] args) {
        int numero;
        int resto;
        String binario = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduccion del numero: ");
        numero = sc.nextInt();
        while (numero !=1) {
            resto = numero % 2;
            numero = numero / 2;
            binario = resto + binario;
        }
        binario = 1 + binario;
        System.out.println(binario);
        }
    }