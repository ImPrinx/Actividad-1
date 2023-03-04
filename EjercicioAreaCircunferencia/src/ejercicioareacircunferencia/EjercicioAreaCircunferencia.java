package ejercicioareacircunferencia;
import java.util.Scanner;
public class EjercicioAreaCircunferencia {
    public static void main(String[] args) {
        double radio, area, circunferencia;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el radio:");
        radio = input.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.println("El area del circulo es: " + area);
        System.out.println("La circunferencia del circulo es: " + circunferencia);
    }    
}
