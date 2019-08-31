package course;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculadoraInteligente(sc);
	}

	public static void calculadora(Scanner sc) {
		System.out.println("Coloque os n�meros para realizar a opera��o de soma: ");
		Calculadora.num1 = sc.nextDouble();
		Calculadora.num2 = sc.nextDouble();
		Calculadora.somar(Calculadora.num1, Calculadora.num2);

		System.out.println("Coloque os n�meros para realizar a opera��o de subtra��o: ");
		Calculadora.num1 = sc.nextDouble();
		Calculadora.num2 = sc.nextDouble();
		Calculadora.subtrair(Calculadora.num1, Calculadora.num2);

		System.out.println("Coloque os n�meros para realizar a opera��o de multiplica��o: ");
		Calculadora.num1 = sc.nextDouble();
		Calculadora.num2 = sc.nextDouble();
		Calculadora.multiplicar(Calculadora.num1, Calculadora.num2);

		System.out.println("Coloque os n�meros para realizar a opera��o de divis�o: ");
		Calculadora.num1 = sc.nextDouble();
		Calculadora.num2 = sc.nextDouble();
		Calculadora.dividir(Calculadora.num1, Calculadora.num2);
	}

	public static void calculadoraInteligente(Scanner sc) {

		System.out.println("Escolha a opera��o: +(Soma), -(Subtra��o), *(Multiplica��o), /(Divis�o)");
		String operation = sc.nextLine();
		if (operation.equals("+") || operation.equalsIgnoreCase("Soma")) {
			System.out.println("Coloque os n�meros para fazer a opera��o.");
			Calculadora.num1 = sc.nextDouble();
			Calculadora.num2 = sc.nextDouble();
			Calculadora.somar(Calculadora.num1, Calculadora.num2);
		} else if (operation.equals("-") || operation.equalsIgnoreCase("Subtra��o")) {
			System.out.println("Coloque os n�meros para fazer a opera��o.");
			Calculadora.num1 = sc.nextDouble();
			Calculadora.num2 = sc.nextDouble();
			Calculadora.subtrair(Calculadora.num1, Calculadora.num2);
		} else if (operation.equals("*") || operation.equalsIgnoreCase("Multiplica��o")) {
			System.out.println("Coloque os n�meros para fazer a opera��o.");
			Calculadora.num1 = sc.nextDouble();
			Calculadora.num2 = sc.nextDouble();
			Calculadora.multiplicar(Calculadora.num1, Calculadora.num2);
		} else if (operation.equals("/") || operation.equalsIgnoreCase("Divis�o")) {
			System.out.println("Coloque os n�meros para fazer a opera��o.");
			Calculadora.num1 = sc.nextDouble();
			Calculadora.num2 = sc.nextDouble();
			Calculadora.dividir(Calculadora.num1, Calculadora.num2);
		}
	}
}