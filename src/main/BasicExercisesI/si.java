package BasicExercisesI;
import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        int horasTrabajadas;
        int precioHora;
        double pagoBruto = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas trabajadas");
        horasTrabajadas = entrada.nextInt();
        System.out.println("Ingrese el precio hora");
        precioHora = entrada.nextInt();

        if (horasTrabajadas <= 35) {
            pagoBruto = precioHora * horasTrabajadas;
        }else {
            int horasExtras = horasTrabajadas - 35;
            pagoBruto = (35 * precioHora) + (horasExtras * precioHora * 1.5);
        }
        double impuestos = 0;
        if (pagoBruto <= 500) {
            impuestos = 0;
        }else if (pagoBruto < 900) {
            impuestos = pagoBruto * 500 * 0.25;
        }else {
            impuestos = (400 * 0.25) + (pagoBruto - 500 - 400) * 0.45;
        }
        System.out.println("El salario bruto es: " + pagoBruto);
        System.out.println("El impuestos es: " + impuestos);
        System.out.println("El salario neto es: " + (pagoBruto - impuestos));


    }
}
