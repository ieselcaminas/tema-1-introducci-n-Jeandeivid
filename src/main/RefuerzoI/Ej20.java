package RefuerzoI;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int n;
        for (int i = 0; i < casos; i++) {
            n = sc.nextInt();
            if (n<3) {
                System.out.println("IMPOSIBLE");
            }else if (n==3) {
            System.out.println("CERO");
            }else{
            System.out.println(n/4);
            }

        }
    }
}