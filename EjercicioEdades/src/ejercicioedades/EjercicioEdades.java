package ejercicioedades;
import java.util.Scanner;
public class EjercicioEdades {
    public static void main(String[] args) {
        int edjuan, edana, edalber, edmama;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan:");
        edjuan = input.nextInt();
        edalber = 2 * (edjuan/3);
        edana = 4 * (edjuan/3);
        edmama = edjuan + edalber + edana;
        System.out.println("La edad de Alberto es: " + edalber );
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de la mamá es: " + edmama);
        System.out.println("La edad de Juan es: " + edjuan);  
    }
}
