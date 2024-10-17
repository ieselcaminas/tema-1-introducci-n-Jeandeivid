package IntroduccionJava;
import java.util.Scanner;
      public class Ejercicio17{
          public static void main(String[] args) {
              int mes;
              Scanner sc = new Scanner(System.in);
              System.out.println("Ingrese mes");
              mes = sc.nextInt();
              switch (mes) {
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  case 8:
                  case 10:
                  case 12:
                      System.out.println("El mes tiene 31 dias");
                      break;
                  case 2:
                      System.out.println("El mes tiene 28 o 29 dias");
                      break;
                      case 4:
                          case 6:
                              case 9:
                                  System.out.println("El mes tiene 30 dias");
                                  break;


              }
          }
}