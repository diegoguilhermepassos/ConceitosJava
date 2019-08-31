package conceito;

import java.util.Scanner;

public class Divisibilidade {

	public static void main(String[] args) {

		System.out.println("Digite 2 números para saber se o 1° é divisível pelo 2°: ");

		Scanner sc = new Scanner(System.in);

		System.out.println("1° Número: ");
		int numero = sc.nextInt();

		System.out.println("2° Número: ");
		int numero2 = sc.nextInt();

		if (numero % numero2 == 0) {
			System.out.println("O número " + numero + " é divisível pelo número " + numero2);
		} else {
			System.out.println("O número " + numero + " não é divisível pelo número " + numero2);
		}
		sc.close();

	}

}
