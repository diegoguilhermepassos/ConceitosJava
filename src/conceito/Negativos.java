package conceito;

import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("N�mero negativo");
		} else {
			System.out.println("N�mero Positivo");
		}
		sc.close();
	}

}
