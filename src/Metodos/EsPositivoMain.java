package Metodos;

//Diseña un algoritmo que lea un valor y muestre si es positivo o negativo (0 es positivo)
public class EsPositivoMain {
    public static boolean esPositivo(int a){
        //Si las condiciones son mutuamente excluyentes, se usa if .. else
        if (a >= 0) {
            return true;
        } else {
            return false;
        }

        //return a >= 0;         "metodo  mas optimizado"
    }
    public static void main(String argv[]) {
        int  numero = Utilidades.leerEntero("Introduce un número entero:");

        //Si las condiciones son mutuamente excluyentes, se usa if .. else
        if (numero >= 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
