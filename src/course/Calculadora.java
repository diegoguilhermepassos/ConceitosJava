package course;

public class Calculadora {
	public static double num1;
	public static double num2;
	public static double resultado;

	public static double somar(double num1, double num2) {
		resultado = num1 + num2;
		System.out.println("O resultado da soma é: " + resultado);
		return resultado;
	}

	public static double subtrair(double num1, double num2) {
		resultado = num1 - num2;
		System.out.println("O resultado da subtração é: " + resultado);
		return resultado;
	}

	public static double multiplicar(double num1, double num2) {
		resultado = num1 * num2;
		System.out.println("O resultado da multiplicação é: " + resultado);
		return resultado;
	}

	public static double dividir(double num1, double num2) {
		resultado = num1 / num2;
		System.out.println("O resultado da divisão é: " + resultado);
		return resultado;
	}

}
