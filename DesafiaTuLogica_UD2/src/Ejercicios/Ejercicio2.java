package Ejercicios;

import java.util.Scanner;

//Pida un número por teclado hasta que éste sea positivo. 
//A continuación, muestra los primeros 20 números sucesivos a dicho número.

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		
		do {
			System.out.println("Introduzca un número positivo:");
			numero = sc.nextInt();
			} while (numero<0);
		
		System.out.println("Los 20 primeros números sucesivos a " + numero + " son:");
		
		for (int i = (numero+1); i <= (numero+20); i++) {
			 System.out.println(i);
			}

	
	}

}
