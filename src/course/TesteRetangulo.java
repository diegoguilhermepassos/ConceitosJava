package course;

import java.util.Locale;
import java.util.Scanner;

public class TesteRetangulo {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();
		System.out.println("Coloque a altura e largura do ret�ngulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();

		System.out.println("�REA: " + retangulo.area());
		System.out.println("PER�METRO: " + retangulo.perimetro());
		System.out.println("DIAGONAL: " + retangulo.diagonal());

		sc.close();
	}
}
