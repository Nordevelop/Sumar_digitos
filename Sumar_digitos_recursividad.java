import java.util.*;

public class Main {
  
  public static void main(String [] args){
     /*Author Nordevelop
     * Sumar los digitos de un numero con recursividad
     */
    Scanner entra=new Scanner(System.in);
    System.out.println("Ingrese un numero para sumar sus digitos:  ");
       numero.nextint();
    System.out.println("la suma de los digitos es: "+ Sumadigitos(numero));
  }
  public static int Sumadigitos(int numero){
     if(numero <10)
        return numero;
     else
        return (numero % 10) + Sumadigitos(numero/10);
   }
}
