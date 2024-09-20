import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int nota;
        int cuentaNotas = 0;
        int sumaNotas = 0;
        boolean hayUnDiez = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un nota: ");
            nota = sc.nextInt();
            if (nota != -1) {
                cuentaNotas += nota;
                sumaNotas++;
                if (nota == 10) {
                    hayUnDiez = true;
                }
            }
        } while (nota != -1);
        if (sumaNotas > 0) {
            double media = (double) cuentaNotas / sumaNotas;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se introdujeron las notas");
        }
        if (hayUnDiez) {
            System.out.println("Si, habia un diez entre las notas");
        } else {
            System.out.println("No habia un diez entre las notas");
        }
    }
}
