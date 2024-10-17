package IntroduccionJava;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
         int numero;
         int numero2;
         String operacion;
         Scanner inputValue = new Scanner(System.in);
         System.out.println("Ingrese el primer numero");
         numero = inputValue.nextInt();
         System.out.println("Ingrese el segundo numero");
         numero2 = inputValue.nextInt();
         System.out.println("Ingrese la operacion");
         operacion = inputValue.next();
         switch (operacion) {
             case "+":
                 System.out.println(numero + numero2);
                 break;
             case "-":
                 System.out.println(numero - numero2);
                 break;
             case "*":
                 System.out.println(numero * numero2);
                 break;
             case "/":
                 System.out.println(numero / numero2);
                 break;

         }
         }
    }