package Metodos;

    public class ValorNotaMain {
        public static String valorEntero(int nota){

            if ((nota < 0) || (nota > 10)) {
                return "Nota inválida";
            }else if (nota < 3) {
                return "Muy deficiente";
            }else if (nota < 5 ) {
                return "Insuficiente";
            }else if (nota < 6 ) {
                return "Suficiente";
            }else if (nota < 7 ) {
                return "bien";
            }else if (nota < 9 ) {
                return "Notable";
            }else {
                return "Sobresaliente";
            }
        }
        public static void main(String argv[]) {
            int nota = Utilidades.leerEntero("Introduce el valor de la nota entera:");
            System.out.println(valorEntero(nota));
        }
    }

