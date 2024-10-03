package RefuerzoII;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int dia;
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un dia (1-31)");
        dia = sc.nextInt();
        System.out.println("Introduzca un mes (1-12)");
        mes = sc.nextInt();
        switch (mes) {
            case 1:
            mes = 0;
            break;
            case 2:
                mes = 31;
                break;
                case 3:
                    mes = 59;
                    break;
                    case 4:
                        mes = 90;
                        break;
                        case 5:
                            mes = 120;
                            break;
                            case 6:
                                mes = 151;
                                break;
                                case 7:
                                    mes = 181;
                                    break;
                                    case 8:
                                        mes = 212;
                                        break;
                                        case 9:
                                            mes = 243;
                                            break;
                                            case 10:
                                                mes = 273;
                                                break;
                                                case 11:
                                                    mes = 304;
                                                    break;
                                                    case 12:
                                                        mes = 334;
                                                        break;
        }
    System.out.println("Faltan " + (mes + dia - 365) + " Para diciembre" );
    }
}
