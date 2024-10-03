package RefuerzoIII;

import java.util.Scanner;

public class Ej153 {
    public static void main(String[] args) {
        double num;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num = sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextDouble();
        if (num > 0 && num < 1 & num2 > 0 & num2 < 1) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
}
