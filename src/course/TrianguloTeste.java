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
		System.out.println("Coloque as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Coloque as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		System.out.printf("Área do triângulo X: %.4f%n", x.area());
		System.out.printf("Área do triângulo Y: %.4f%n", y.area());

		if (x.area() > y.area()) {
			System.out.println("Área maior é do triângulo X");
		} else if (x.area() < y.area()) {
			System.out.println("Área maior é do triângulo Y");
		} else {
			System.out.println("As áreas dos triângulo são iguais");
		}

		sc.close();
	}

}
