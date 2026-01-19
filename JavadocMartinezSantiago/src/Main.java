import java.util.Scanner;

/**
 // * Programa que muestra un menú para realizar diferentes cálculos matemáticos
 * como IMC, areas y conversión de temperatura.
 *
 * @author MartinezSantiago
 * @version 1.0
 */
public class Main {

    /**
     * Metodo principal que muestra el menú y controla la ejecución del programa.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular área de un rectangulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular área de un circulo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese su peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingrese su altura (m): ");
                    double altura = scanner.nextDouble();
                    System.out.println("IMC = " + calcularIMC(peso, altura));
                    break;

                case 2:
                    System.out.print("Ingrese la base del rectangulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double alturaRect = scanner.nextDouble();
                    System.out.println("Área del rectangulo = " + areaRectangulo(base, alturaRect));
                    break;

                case 3:
                    System.out.print("Ingrese grados Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println("Grados Fahrenheit = " + celsiusAFahrenheit(celsius));
                    break;

                case 4:
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Área del circulo = " + areaCirculo(radio));
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println();

        } while (choice != 5);

        scanner.close();
    }

    /**
     * Calcula el Indice de Masa Corporal (IMC) de una persona.
     *
     * @param peso peso en kilogramos
     * @param altura altura en metros
     * @return valor del IMC
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    /**
     * Calcula el área de un rectangulo.
     *
     * @param base base del rectangulo
     * @param altura altura del rectangulo
     * @return área del rectangulo
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Convierte grados Celsius a grados Fahrenheit.
     *
     * @param celsius temperatura en grados Celsius
     * @return temperatura convertida a Fahrenheit
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    /**
     * Calcula el área de un circulo.
     *
     * @param radio radio del circulo
     * @return área del circulo
     */
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
}
