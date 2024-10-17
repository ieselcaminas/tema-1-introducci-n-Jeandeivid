package Metodos;

public class EsTriangulo {

    public static boolean esTriangulo(int a, int b, int c)
    {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {

        int a = Utilidades.leerEntero("Introduce la longitud del primer palito");
        int b = Utilidades.leerEntero("Introduce la longitud del segundo palito");
        int c = Utilidades.leerEntero("Introduce la longitud del tercer palito");

        if (esTriangulo(a, b, c)) {
            System.out.println("Es posible formar un triángulo con las longitudes " + a + ", " + b + ", " + c);
        } else {
            System.out.println("No es posible formar un triángulo con las longitudes " + a + ", " + b + ", " + c);
        }
    }
}