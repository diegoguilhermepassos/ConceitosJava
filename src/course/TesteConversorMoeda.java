package course;

import java.util.Locale;
import java.util.Scanner;

public class TesteConversorMoeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual � o pre�o do dolar? ");
		double precoDolar = sc.nextDouble();
		System.out.println("Quantos d�lares voc� quer comprar? ");
		double totalDinheiro = sc.nextDouble();
		System.out.println("Pre�o a pagar em reais: " + ConversorMoeda.conversaoDolarReal(precoDolar, totalDinheiro));

		sc.close();
		
	}

}
