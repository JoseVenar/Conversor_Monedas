package conversor.metodos;

public class CalculoConversion {



    public static double convertirOtraMoneda(double cantidad, double valorTasaCambio) {
        return cantidad / valorTasaCambio;
      }

    public static double convertirDolares(double cantidad, double valorTasaCambio) {
        return cantidad * valorTasaCambio;
      }

    }




