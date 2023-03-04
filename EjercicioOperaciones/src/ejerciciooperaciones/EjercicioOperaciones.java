
package ejerciciooperaciones;
import java.util.Scanner;
public class EjercicioOperaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suma, x, y;
        suma = 0;
        x = input.nextDouble();
        y = input.nextDouble();
        suma += x;
        x += Math.pow(y, 2);
        suma += x/y;
        System.out.println("El valor de la suma es " + suma);
        
                
    }
    
}
