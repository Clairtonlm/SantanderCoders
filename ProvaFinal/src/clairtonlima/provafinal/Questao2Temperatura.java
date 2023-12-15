package clairtonlima.provafinal;

import java.util.Locale;
import java.util.Scanner;

public class Questao2Temperatura {

	public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe a temperatura:");
        double temperatura = scanner.nextDouble();

        System.out.println("Unidade de origem? [C, K, F]");
        scanner.nextLine();
        String unidadeOrigem = scanner.nextLine();

        System.out.println("Unidade de destino? [C, K, F]");
        String unidadeDestino = scanner.nextLine();

        double mudaTempertura = 0.0;

        if (unidadeOrigem.equalsIgnoreCase("C")) {
            if (unidadeDestino.equalsIgnoreCase("K")) mudaTempertura = temperatura + 273.15;
            
            else if (unidadeDestino.equalsIgnoreCase("F")) mudaTempertura = (temperatura * 9 / 5) + 32;
            
        } else if (unidadeOrigem.equalsIgnoreCase("K")) {
            if (unidadeDestino.equalsIgnoreCase("C")) mudaTempertura = temperatura - 273.15;
            
            else if (unidadeDestino.equalsIgnoreCase("F")) mudaTempertura = ((temperatura - 273.15) * 9 / 5) + 32;
        } else if (unidadeOrigem.equalsIgnoreCase("F")) {
            if (unidadeDestino.equalsIgnoreCase("C")) mudaTempertura = (temperatura - 32) * 5 / 9;
            
            else if (unidadeDestino.equalsIgnoreCase("K")) mudaTempertura = ((temperatura - 32) * 5 / 9) + 273.15;
        }

        System.out.printf("%.2f %s = %.2f %s\n", temperatura, unidadeOrigem, mudaTempertura, unidadeDestino);
        
        scanner.close();
    }
	
}

