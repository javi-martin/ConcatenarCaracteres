package es.studium.ConcatenarCaracteres;

import java.util.Scanner;

public class ConcatenarCaracteres {

	public static void main(String[] args) 
	{
		char letra1, letra2;
		
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Dame una letra:");
		letra1 = teclado.next().charAt(0);
				
		System.out.println("Dame otra letra:");
		letra2 = teclado.next().charAt(0);
		
		System.out.println(letra1+""+letra2);
		
		teclado.close();

	}

}
