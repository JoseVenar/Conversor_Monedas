package conversor.menu;

public class MenuConversor {

    public void mostrar() {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        System.out.println("""
                ************************  Bienvenido! Que moneda desea Convertir?  *************************************\n
                1) Dolar Americano a Peso Chileno
                2) Peso Chileno a Dolar Americano
                3) Dolar Americano a Peso Argentino
                4) Peso Argentino a Dolar Americano
                5) Dolar Americano a Dolar Canadiense
                6) Dolar Canadiense a Dolar Americano
                9) Salir\n
                """);
        System.out.println("Ingrese su opción:");

    }
}