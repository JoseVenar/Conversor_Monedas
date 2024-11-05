Conversor de Monedas
  Este es un programa en Java que permite convertir entre diferentes monedas utilizando datos de tasas de cambio actuales obtenidas de una API externa.

Estructura del Proyecto
  El proyecto está dividido en varias clases para seguir los principios de la Programación Orientada a Objetos (POO):

Conversor: Es la clase principal, donde se ejecuta el programa y se presenta el menú de opciones para el usuario.

MenuConversor: Esta clase contiene el método para mostrar el menú y capturar la opción ingresada por el usuario.

ConsultaMonedas: Esta clase se encarga de hacer la consulta a la API externa y obtener la tasa de cambio entre las monedas deseadas.

CalculoConversion: Contiene los métodos necesarios para realizar los cálculos de conversión, facilitando la reutilización de estos métodos en diferentes partes del programa.

Moneda: Es un record que representa una moneda con su nombre y valor.

Requisitos Previos
  Java 11 o superior: Asegúrate de tener Java instalado en tu sistema.
  API de tasas de cambio: El programa consulta a una API externa para obtener tasas de cambio actualizadas. Asegúrate de tener acceso a esta API y de obtener una clave de API si es necesario.

Instalación
  Clona este repositorio en tu máquina local.
  Abre el proyecto en tu IDE de Java preferido.
  Agrega la clave de API en la clase ConsultaMonedas para que pueda acceder a la tasa de cambio de la API.

Ejecución
  Para ejecutar el programa, simplemente ejecuta la clase Conversor desde tu IDE o terminal.

Uso del Programa
  Al iniciar el programa, se mostrará un menú con opciones para convertir entre diferentes monedas.
  Selecciona la opción correspondiente a la conversión deseada (por ejemplo, de Dólar Americano a Peso Chileno).
  Ingresa la cantidad a convertir cuando se te indique.
  El programa mostrará el valor convertido en la moneda de destino con un formato que incluye solo dos decimales y separación de miles para facilitar la lectura.
  Ejemplo de Conversión
  Si seleccionas la opción para convertir de Dólar Americano a Peso Chileno e ingresas 100 dólares, el programa te mostrará algo como:
    La cantidad de 100.00 Dólares es equivalente a: 89,654.00 Pesos Chilenos

Clases y Métodos
Conversor
  Contiene el método main, el punto de inicio del programa, donde se llama al menú y se seleccionan las conversiones.

MenuConversor
  Método mostrarMenu(): Despliega el menú de opciones y obtiene la selección del usuario.

ConsultaMonedas
  Método tasaCambio(String monedaOrigen, String monedaDestino): Consulta la tasa de cambio actual entre dos monedas utilizando la API.

CalculoConversion
  Método convertir(double cantidad, double tasaCambio): Calcula la cantidad de dinero convertida basándose en la tasa de cambio proporcionada.

Moneda
  record Moneda(String nombre, double valor): Representa una moneda con su nombre y valor, útil para almacenar tasas de cambio.

Licencia
  Este proyecto es de uso libre y abierto para fines educativos y de práctica en Java.

