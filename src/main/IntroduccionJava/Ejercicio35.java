package IntroduccionJava;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        int num;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        num = sc.nextInt();
        System.out.println("Ingrese otro numero ");
        num2 = sc.nextInt();
        do {
            num = num - num2;
        }while (num >= num2);
        System.out.println(" El resultado es: " + num);
        }
}