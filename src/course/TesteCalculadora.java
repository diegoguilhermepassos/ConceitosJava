package course;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculadoraInteligente(sc);
	}

	public static void calculadora(Scanner sc) {
		System.out.println("Coloque os números para realizar a operação de soma: ");
		Calculadora.num1 = sc.nextDouble();
		Calculadora.num2 = sc.nextDouble();
		Calculadora.somar(Calculadora.num1, Calculadora.num2);

		System.out.println("Coloque os números para realizar a operação de subtração: ");
		Calculadora.num1 = sc.nextDouble();
		Calculadora.num2 = sc.nextDouble();
		Calculadora.subtrair(Calculadora.num1, Calculadora.num2);

		System.out.println("Coloque os números para realizar a operação de multiplicação: ");
		Calculadora.num1 = sc.nextDouble();
		Calculadora.num2 = sc.nextDouble();
		Calculadora.multiplicar(Calculadora.num1, Calculadora.num2);

		System.out.println("Coloque os números para realizar a operação de divisão: ");
		Calculadora.num1 = sc.nextDouble();
		Calculadora.num2 = sc.nextDouble();
		Calculadora.dividir(Calculadora.num1, Calculadora.num2);
	}

	public static void calculadoraInteligente(Scanner sc) {

		System.out.println("Escolha a operação: +(Soma), -(Subtração), *(Multiplicação), /(Divisão)");
		String operation = sc.nextLine();
		if (operation.equals("+") || operation.equalsIgnoreCase("Soma")) {
			System.out.println("Coloque os números para fazer a operação.");
			Calculadora.num1 = sc.nextDouble();
			Calculadora.num2 = sc.nextDouble();
			Calculadora.somar(Calculadora.num1, Calculadora.num2);
		} else if (operation.equals("-") || operation.equalsIgnoreCase("Subtração")) {
			System.out.println("Coloque os números para fazer a operação.");
			Calculadora.num1 = sc.nextDouble();
			Calculadora.num2 = sc.nextDouble();
			Calculadora.subtrair(Calculadora.num1, Calculadora.num2);
		} else if (operation.equals("*") || operation.equalsIgnoreCase("Multiplicação")) {
			System.out.println("Coloque os números para fazer a operação.");
			Calculadora.num1 = sc.nextDouble();
			Calculadora.num2 = sc.nextDouble();
			Calculadora.multiplicar(Calculadora.num1, Calculadora.num2);
		} else if (operation.equals("/") || operation.equalsIgnoreCase("Divisão")) {
			System.out.println("Coloque os números para fazer a operação.");
			Calculadora.num1 = sc.nextDouble();
			Calculadora.num2 = sc.nextDouble();
			Calculadora.dividir(Calculadora.num1, Calculadora.num2);
		}
	}
}