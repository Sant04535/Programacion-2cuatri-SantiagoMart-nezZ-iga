/*
===========================================
ActividadBuenasPracticas
Archivo: Main.java
===========================================

CODIGO ORIGINAL (SIN CORREGIR):
--------------------------------
import java.util.Scanner;
public class Main{
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
System.out.print("n:");int n=sc.nextInt();
int s=0;
for(int i=1;i<=n;i++){s+=i;}
System.out.println("r:"+s);
}}
--------------------------------

PROBLEMAS DETECTADOS (MALAS PRÁCTICAS):
1. No hay indentación adecuada.
2. El nombre del parámetro "a" en main no es descriptivo.
3. Variables con nombres poco claros: n, s, i.
4. Mensajes al usuario no son entendibles ("n:", "r:").
5. Toda la lógica está dentro del metodo main.
6. No se separan responsabilidades (entrada, proceso y salida).
7. El Scanner no se cierra.
8. Código poco legible y difícil de mantener.
9. No hay métodos reutilizables.
10. Falta documentación del código.

================================================
CODIGO CORREGIDO APLICANDO BUENAS PRÁCTICAS
================================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = pedirEntero(scanner);
        int resultado = sumarHastaN(numero);

        System.out.println("La suma de los números del 1 al " + numero + " es: " + resultado);

        scanner.close();
    }

    /**
     * Solicita al usuario un numero entero.
     *
     * @param scanner Objeto Scanner para leer la entrada del usuario
     * @return Número entero ingresado por el usuario
     */
    public static int pedirEntero(Scanner scanner) {
        System.out.print("Ingrese un número entero: ");
        return scanner.nextInt();
    }

    /**
     * Calcula la suma de los números desde 1 hasta n.
     *
     * @param n Número límite hasta donde se realizará la suma
     * @return Resultado de la suma
     */
    public static int sumarHastaN(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        return suma;
    }
}
