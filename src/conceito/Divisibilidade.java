package conceito;

import java.util.Scanner;

public class Divisibilidade {

	public static void main(String[] args) {

		System.out.println("Digite 2 n�meros para saber se o 1� � divis�vel pelo 2�: ");

		Scanner sc = new Scanner(System.in);

		System.out.println("1� N�mero: ");
		int numero = sc.nextInt();

		System.out.println("2� N�mero: ");
		int numero2 = sc.nextInt();

		if (numero % numero2 == 0) {
			System.out.println("O n�mero " + numero + " � divis�vel pelo n�mero " + numero2);
		} else {
			System.out.println("O n�mero " + numero + " n�o � divis�vel pelo n�mero " + numero2);
		}
		sc.close();

	}

}
