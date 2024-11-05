package conversor.principal;
import conversor.metodos.CalculoConversion;
import conversor.metodos.ConsultaMonedas;
import conversor.menu.MenuConversor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MenuConversor menu = new MenuConversor();
        int opcion = 0;


        while (opcion != 9) {
            menu.mostrar();
            opcion = scanner.nextInt();
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String resultado = df.format(resultado);


            switch (opcion) {

                case 1 :
                    System.out.println("ingrese la cantidad de Dolares :");
                    double dolares = scanner.nextDouble();
                    ConsultaMonedas consulta1 = new ConsultaMonedas();
                    Double valorMoneda = consulta1.tasaCambio("USD","CLP");
                    Double resultado = CalculoConversion.convertirDolares(dolares, valorMoneda);
                    System.out.println("La Cantidad de "+dolares+" Dolares Americanos, es equivalente a : \n" +resultado+ " pesos Chilenos");
                    break;
                case 2 :
                    System.out.println("ingrese la cantidad de Pesos Chilenos :");
                    double pesosChilenos = scanner.nextDouble();
                    consulta1 = new ConsultaMonedas();
                    valorMoneda = consulta1.tasaCambio("USD", "CLP");
                    resultado = CalculoConversion.convertirOtraMoneda(pesosChilenos, valorMoneda);
                    System.out.println("La Cantidad de "+pesosChilenos+" Pesos Chilenos, es equivalente a : \n " +resultado+ " Dolares Americanos" );
                    break;
                case 3 :
                    System.out.println("ingrese la cantidad de Dolares :");
                    dolares = scanner.nextDouble();
                    consulta1 = new ConsultaMonedas();
                    valorMoneda = consulta1.tasaCambio("USD", "ARS");
                    resultado = CalculoConversion.convertirDolares(dolares, valorMoneda);
                    System.out.println("La Cantidad de "+dolares+" Dolares Americanos es equivalente a : \n" +resultado+ " Pesos Argentinos");
                    break;
                case 4 :
                    System.out.println("ingrese la cantidad de Pesos Argentinos:");
                    double pesosArgentinos = scanner.nextDouble();
                    consulta1 = new ConsultaMonedas();
                    valorMoneda = consulta1.tasaCambio("USD", "ARS");
                    resultado = CalculoConversion.convertirOtraMoneda(pesosArgentinos, valorMoneda);
                    System.out.println("La Cantidad de "+pesosArgentinos+" Pesos Chilenos, es equivalente a : \n " +resultado+ " Dolares Americanos" );
                    break;
                case 5 :
                    System.out.println("ingrese la cantidad de Dolares :");
                    dolares = scanner.nextDouble();
                    consulta1 = new ConsultaMonedas();
                    valorMoneda = consulta1.tasaCambio("USD", "CAD");
                    resultado = CalculoConversion.convertirDolares(dolares, valorMoneda);
                    System.out.println("La Cantidad de "+dolares+" Dolares Americanos, es equivalente a : \n" +resultado+ " Dolar Canadiense");
                    break;
                case 6 :
                    System.out.println("ingrese la cantidad de Dolar Canadiense");
                    double dolarCanadiense;
                    dolarCanadiense = scanner.nextDouble();
                    consulta1 = new ConsultaMonedas();
                    valorMoneda = consulta1.tasaCambio("USD", "CAD");
                    resultado = CalculoConversion.convertirOtraMoneda(dolarCanadiense, valorMoneda);
                    System.out.println("La Cantidad de "+dolarCanadiense+" Pesos Chilenos, es equivalente a : \n " +resultado+ " Dolares Americanos" );
                    break;
                case 9 :
                    System.out.println("Gracias, Adios!");
                    break;
                default:
                    System.out.println("Elija una opción valida!");
                    break;
            }


        }
    }
}