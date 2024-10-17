package IntroduccionJava;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        int horasTrabajadas;
        double precioHora;
        double pagoBruto = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de horas trabajadas");
        horasTrabajadas = new Scanner(System.in).nextInt();
        System.out.println("Ingrese el precio por hora en €");
        precioHora = new Scanner(System.in).nextDouble();

        if (horasTrabajadas <= 35) {
            pagoBruto = precioHora * horasTrabajadas;
        } else {
            int horasExtras = horasTrabajadas - 35;
            pagoBruto = (35 * precioHora) + (horasExtras * precioHora * 1.5);
        }
        double impuestos = 0;
        if (pagoBruto <= 500) {
            impuestos = 0;
        }else if (pagoBruto <= 900) {
            impuestos = (pagoBruto - 500) * 0.25;
        }else {
            impuestos = (400 * 0.25) + (pagoBruto - 500 - 400) * 0.45;
        }

        System.out.println("El salario bruto es :" + pagoBruto);
        System.out.println("Los impuestos son: " + impuestos);
        System.out.println("El salario neto es: " + (pagoBruto - impuestos));

        }

        }





