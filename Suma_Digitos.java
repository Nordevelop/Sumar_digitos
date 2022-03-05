import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner entra = new Scanner (System.in);
                /* Sumar digitos de una variable 
                 * author Nordevelop
                */
		int n1;
		int decmil;
		int umil;
		int cen;
		int dec;
		int u;
		int aux;
		System.out.println("ingrese un numero de 5 cifras: ");
		n1 = entra.nextInt();
	    decmil = n1 / 10000;
		aux = n1 % 10000;
		umil= aux /1000; //@author norberto
		aux= n1 % 1000;
		cen= aux/ 100;
		aux= aux %100;
		dec= aux /10;
		aux=aux %10;
		u= aux/1;
		System.out.println("Decena de mil: " + decmil);
		System.out.println("Unidad de mil: "+ umil);
		System.out.println("Centena: " + cen);
		System.out.println("Decena: " + dec);
		System.out.println("Unidad: " + u);
        }
     }   
     
    
