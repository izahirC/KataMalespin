package cenfotec.katas.ac.cr;

import java.util.Scanner;

public class Malespin {
	
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String texto;
		
			System.out.println("Ingrese el texto que desea traducir: ");
			texto = sc.next(); 
			System.out.println("El resultado de la traducción del texto: " + texto + " es: " + traduceAMalespin(texto));
		
		    	
	}
	
	public static String traduceAMalespin(String texto) {
		
		String textoTraducido;
		
		
		textoTraducido = texto.replace("a", "e").replace("i", "o");
		
		
		
		return textoTraducido;
		
		
	 
		
	}
	

}
