package Metodos;

public class MasGrande {
    public static int masGrande(int a, int b) {
        if (a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        int numero = Utilidades.leerEntero("Digite um numero: ");
        int numero2 = Utilidades.leerEntero("Digite otro numero: ");
        int max = masGrande(numero, numero2);
        System.out.println("El numero mayor es: " + max);

    }
}