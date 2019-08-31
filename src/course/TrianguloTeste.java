package course;

import java.util.Locale;
import java.util.Scanner;

public class TrianguloTeste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		System.out.println("Coloque as medidas do tri�ngulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Coloque as medidas do tri�ngulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		System.out.printf("�rea do tri�ngulo X: %.4f%n", x.area());
		System.out.printf("�rea do tri�ngulo Y: %.4f%n", y.area());

		if (x.area() > y.area()) {
			System.out.println("�rea maior � do tri�ngulo X");
		} else if (x.area() < y.area()) {
			System.out.println("�rea maior � do tri�ngulo Y");
		} else {
			System.out.println("As �reas dos tri�ngulo s�o iguais");
		}

		sc.close();
	}

}
