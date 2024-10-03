package RefuerzoIII;

import java.util.Scanner;

public class Ej152 {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3;
        int num4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        num = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextInt();
        System.out.println("Introduzca el tercer numero");
        num3 = sc.nextInt();
        System.out.println("Introduzca el cuarto numero");
        num4 = sc.nextInt();
        if (num == num2 && num2 == num3 && num3 == num4) {

            System.out.println("Son iguales");
        } else {

            System.out.println("NO son iguales");
        }
    }
}


