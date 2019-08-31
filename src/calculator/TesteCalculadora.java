package calculator;

import java.util.Scanner;

public class TesteCalculadora {
	public static void main(String[] args) {
		testeNormal();
		entradaUsuario();
	}

	public static void testeNormal () {
		System.out.println("===================Teste Normal===================");
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado da soma:" + calculadora.somar(2, 3));
		System.out.println("Resultado da subtração:" + calculadora.subtrair(2, 3));
		System.out.println("Resultado da multiplicação:" + calculadora.multiplicar(2, 3));
		System.out.println("Resultado da divisão:" + calculadora.dividir(2, 3));
		
	}
	
	public static void entradaUsuario () {
		System.out.println("===================Teste Entrada usuario===================");
		Calculadora calculadora = new Calculadora();
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Escolha uma das operações: (+)Soma, (/)Divisão, (*)Multiplicação ou (-)Subtração");
		String entrada = scanner.nextLine();
		
		while(!entrada.equals("")) {
			
			System.out.println("Digite o primeiro número");
			double x = scanner.nextDouble();
			System.out.println("Digite o segundo número");
			double y = scanner.nextDouble();
			
			if(entrada.equalsIgnoreCase("+")) {
				System.out.println("Resultado da soma: " + calculadora.somar(x, y));
			}else if(entrada.equalsIgnoreCase("-")) {
				System.out.println("Resultado da subtração: " + calculadora.subtrair(x, y));
			}else if(entrada.equalsIgnoreCase("*")) {
				System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(x, y));
			}else if(entrada.equalsIgnoreCase("/")) {
				System.out.println("Resultado da divisão: " + calculadora.dividir(x, y));
			}
			entrada = scanner.nextLine();
			System.out.println("Escolha uma das operações: (+)Soma, (/)Divisão, (*)Multiplicação ou (-)Subtração");
			entrada = scanner.nextLine();
			System.out.println(entrada);
		}
		scanner.close();
	}

}

	