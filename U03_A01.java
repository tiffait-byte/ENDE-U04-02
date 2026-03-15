package A01;
import java.util.Scanner;
public class U03_A01 {
    public static void main(String[] args){
    // creamos un objeto scanner para que nos lea lo que introducimos 
    Scanner sc = new Scanner(System.in);
    // solicitamos al usuario un numero
    System.out.print("Introduce un numero: ");
    int numero = sc.nextInt();
    
    // comprobar que el numero es par o impar
    if (numero % 2 == 0) {
        System.out.print("El numero escrito: " + numero + ", es PAR");
    } else {
        System.out.print("El numero escrito: " + numero + ", es IMPAR.");
        
    }

    }
    
}
