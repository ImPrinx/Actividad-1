package ejerciciosaalario;
import java.util.Scanner;
public class EjercicioSaalario {
    public static void main(String[] args) {
        double horastrabajadas, valorhora, retencion, salariobruto, salarioneto, retencionfinal;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese las horas trabajadas:");
        horastrabajadas = input.nextDouble();
        
        System.out.println("Ingrese el valor de la hora:");
        valorhora = input.nextDouble();
        
        retencion = 0.125;
        salariobruto = horastrabajadas * valorhora;
        retencionfinal = salariobruto * retencion;
        salarioneto = salariobruto - (salariobruto * retencion);
        System.out.println("El salario bruto es " + salariobruto);
        System.out.println("La retencion es " + retencionfinal);
        System.out.println("El salario neto es " + salarioneto);
        
        
    }
    
}