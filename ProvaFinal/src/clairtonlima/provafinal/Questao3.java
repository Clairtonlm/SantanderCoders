package clairtonlima.provafinal;

import java.util.Locale;
import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] a) {
		 Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		 
		 System.out.println("Digite um número inteiro para o tamanho do triângulo:");
	        int numero = scanner.nextInt();

	        for (int i = 1; i <= numero; i += 2) {
	            for (int j = 1; j <= numero - i / 2; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        for (int i = numero; i >= 1; i -= 2) {
	            for (int j = 1; j <= numero - i / 2; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 scanner.close();
	}
}
