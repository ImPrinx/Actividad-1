package ejerciciooperaciones;
import java.util.Scanner;
public class EjercicioOperaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suma, x, y;
        suma = 0;
        System.out.println("Ingrese el valor de x:");
        x = input.nextDouble();
        System.out.println("Ingrese el valor de y:");
        y = input.nextDouble();
        suma += x;
        x += Math.pow(y, 2);
        suma += x/y;
        System.out.println("El valor de la suma es " + suma);          
    }   
}
