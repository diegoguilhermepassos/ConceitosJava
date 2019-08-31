package conceito;

import java.util.Scanner;

public class Primos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		resolocao1(sc);
		resolocao2(sc);
		sc.close();
	}

	public static void resolocao1(Scanner sc) {
		System.out.println("Digite o valor");
		int numero = sc.nextInt();
		int divisor = 1;
		int qtdDivisores = 0;
		while (divisor <= numero) {
			//System.out.println("Teste: "+divisor);
			int restoDivisao = numero % divisor;
			if (restoDivisao == 0) {
				System.out.println(divisor);
				qtdDivisores++;
			}
			divisor++;
		}

		if (qtdDivisores > 2) {
			System.out.println("Não primo");
		} else {
			System.out.println("Primo");
		}
	}

	public static void resolocao2(Scanner sc) {
		System.out.println("Digite o valor");

		int numero = sc.nextInt();

		int divisor = 2;
		boolean isPrimo = true;

		while (divisor <= numero / 2) {
			//System.out.println("Teste: "+divisor);
			int restoDivisao = numero % divisor;
			if (restoDivisao == 0) {
				System.out.println(divisor);
				isPrimo = false;
				break;
			}
			divisor++;
		}

		if (isPrimo) {
			System.out.println("Primo");
		} else {
			System.out.println("Não primo");
		}
	}
}
