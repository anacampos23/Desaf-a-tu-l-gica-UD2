package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	//Pide 3 números y un orden de ordenamiento (ascendente o descendente)
	//Según el orden indicado se mostrarán en pantalla dichos números

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Indique 3 números distintos:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("Los números indicados son: " + a + ", "+ b +" y "+ c + ". "
				+ "¿en qué orden desea ordenarlos? Escriba '1' para orden descendiente y '2' para orden ascendiente.");
		
		int x = sc.nextInt();
		
		switch (x) {
		case 1:
			if (a>b & b>c) { 
				 System.out.println(a+" "+b+" "+c);
				 } else if (a>c & c>b) {
				 System.out.println(a+" "+c+" "+b);
				 } else if (b>a & a>c) {
				 System.out.println(b+" "+a+" "+c);
				 } else if (b>c & c>a) {
				 System.out.println(b+" "+c+" "+a);
				 } else if (c>a & a>b) {
				 System.out.println(c+" "+a+" "+b);
				 } else if (c>b & b>a) {
				 System.out.println(c+" "+b+" "+a);
				 } else {
				 System.out.println("Existe algún número que es igual.");
				 }
		 break;
		 
		case 2:
			if (a>b & b>c) { 
				 System.out.println(c+" "+b+" "+a);
				 } else if (a>c & c>b) {
				 System.out.println(b+" "+c+" "+a);
				 } else if (b>a & a>c) {
				 System.out.println(c+" "+a+" "+b);
				 } else if (b>c & c>a) {
				 System.out.println(a+" "+c+" "+b);
				 } else if (c>a & a>b) {
				 System.out.println(b+" "+a+" "+c);
				 } else if (c>b & b>a) {
				 System.out.println(a+" "+b+" "+c);
				 } else {
				 System.out.println("Existe algún número es igual.");
				 }
		 break;
		default:
		 System.out.println("La instrucción no corresponde con lo pedido.");
		}
		
		sc.close();

	}//fin del main

}
