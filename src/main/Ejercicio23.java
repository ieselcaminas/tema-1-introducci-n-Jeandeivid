import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
    int num;
    int positivos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        while (num != 0) {
            num = sc.nextInt();
            if (num > 0) {
                positivos++;
            }
        }
        System.out.println("Hay: " + positivos + " positivos");
    }
}
