package Metodos;

import java.util.Scanner;
public class Descuentos {
    public static double calcularDescuento(double precio, double precioRebajado) {
        double descuento;

        descuento = (precio - precioRebajado) /precio * 100;
        return descuento;

    }

    public static void main (String argv[]) {

        Scanner inputValue = new Scanner(System.in);

        double precio = Utilidades.leerEntero("Introduce el precio");

        double precioRebajado = Utilidades.leerEntero("Introduce el precio rebajado");

         double descuento = calcularDescuento(precio, precioRebajado);

        System.out.println("El descuento es de: " + descuento );

        inputValue.close();
        //Aquí usamos los datos obtenidos

    }
}


