package course;

import java.util.Locale;
import java.util.Scanner;

public class Curso {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt-BR"));
		Scanner sc = new Scanner(System.in);
		Soma soma = new Soma();
		soma.setNumberOne(sc.nextDouble());
		soma.setNumberTwo(sc.nextDouble());
		soma.setNumberThree(sc.nextDouble());
		sc.close();

	}
}
