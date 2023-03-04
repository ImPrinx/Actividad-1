
package ejerciciocuadrado;
import java.util.Scanner;
public class EjercicioCuadrado {
    public static void main(String[] args) {
        double numero, cuadrado, cubo;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        numero = input.nextDouble();
        
        cuadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);
        System.out.println("El cuadrado es " + cuadrado);
        System.out.println("El cubo es " + cubo);
    }
    
}
