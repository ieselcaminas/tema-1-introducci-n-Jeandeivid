package IntroduccionJava;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        int num;
        int num2;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        num = sc.nextInt();
        System.out.println("Ingrese otro numero ");
        num2 = sc.nextInt();
        for (int i = 1; i <= num2; i++) {
            total = total + num;
            System.out.println("El total es: " + total);
        }
        System.out.println(total);

    }
}


