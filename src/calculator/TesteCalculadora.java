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
		System.out.println("Resultado da subtra��o:" + calculadora.subtrair(2, 3));
		System.out.println("Resultado da multiplica��o:" + calculadora.multiplicar(2, 3));
		System.out.println("Resultado da divis�o:" + calculadora.dividir(2, 3));
		
	}
	
	public static void entradaUsuario () {
		System.out.println("===================Teste Entrada usuario===================");
		Calculadora calculadora = new Calculadora();
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Escolha uma das opera��es: (+)Soma, (/)Divis�o, (*)Multiplica��o ou (-)Subtra��o");
		String entrada = scanner.nextLine();
		
		while(!entrada.equals("")) {
			
			System.out.println("Digite o primeiro n�mero");
			double x = scanner.nextDouble();
			System.out.println("Digite o segundo n�mero");
			double y = scanner.nextDouble();
			
			if(entrada.equalsIgnoreCase("+")) {
				System.out.println("Resultado da soma: " + calculadora.somar(x, y));
			}else if(entrada.equalsIgnoreCase("-")) {
				System.out.println("Resultado da subtra��o: " + calculadora.subtrair(x, y));
			}else if(entrada.equalsIgnoreCase("*")) {
				System.out.println("Resultado da multiplica��o: " + calculadora.multiplicar(x, y));
			}else if(entrada.equalsIgnoreCase("/")) {
				System.out.println("Resultado da divis�o: " + calculadora.dividir(x, y));
			}
			entrada = scanner.nextLine();
			System.out.println("Escolha uma das opera��es: (+)Soma, (/)Divis�o, (*)Multiplica��o ou (-)Subtra��o");
			entrada = scanner.nextLine();
			System.out.println(entrada);
		}
		scanner.close();
	}

}

	