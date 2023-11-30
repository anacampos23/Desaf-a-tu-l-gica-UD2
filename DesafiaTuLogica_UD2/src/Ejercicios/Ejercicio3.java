package Ejercicios;

public class Ejercicio3 {
	
	//muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100. 

	public static void main(String[] args) {		
		
		System.out.println("Números múltiplos de 2 o 3 entre 1 y 100:");
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println(i);
			}
		}

	}//fin del main

}
