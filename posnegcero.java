
import java.util.Scanner;

/**
 *
 * @author leosanAPTO
 */
public class Posnegcero {

    /**
     * Este programa solicita un numero entero al usuario y muestra un mensaje
     * indicando si es positivo, negativo o igual a cero
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("DIGITE UN NUMERO ENTERO: ");
        numero = entrada.nextInt();
        
        if(numero > 0) System.out.println("EL NUMERO ES POSITIVO");
        if(numero < 0) System.out.println("EL NUMERO ES NEGATIVO");
        if(numero == 0) System.out.println("EL NUMERO ES IGUAL A CERO");
    }
    
}
