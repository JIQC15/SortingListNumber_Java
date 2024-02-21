//Joseph Quintero

//Intruccion: Elabora un programa en Java que reciba una lista de números como argumentos en el momento de ejecutar 
//tu aplicación e imprima en consola la lista de números ordenada de menor a mayor, no es necesario que 
//programes tu método de ordenación como el de burbuja, revisa la documentación de Java en la clase de Math.

package Backend;

import java.util.Arrays;

public class OrdenamientoLista {
    
   public static void main(String[] args) {
        int[] numeros = convertirAEnteros(args);

        Arrays.sort(numeros);//Funcion que acomoda los numeros de manera ascendente.
        imprimirNumerosOrdenados(numeros);
    }

    private static int[] convertirAEnteros(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numeros[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el argumento " + args[i] + " a un numero entero.");
                System.exit(1); // Terminar el programa debido al error
            }
        }
        return numeros;
    }

    private static void imprimirNumerosOrdenados(int[] numeros) {
        System.out.println("Lista de numeros ordenada de menor a mayor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
