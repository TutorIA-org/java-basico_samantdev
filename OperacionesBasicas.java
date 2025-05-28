import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario el segundo número
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Calcular operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        
        // Verificar que el segundo número no sea cero antes de dividir
        if (numero2 != 0) {
            double division = (double) numero1 / numero2;
            System.out.println("La división de " + numero1 + " entre " + numero2 + " es: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        // Mostrar los resultados
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " menos " + numero2 + " es: " + resta);
        System.out.println("La multiplicación de " + numero1 + " por " + numero2 + " es: " + multiplicacion);
    }
}