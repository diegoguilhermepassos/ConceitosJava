package course;

import java.util.Locale;
import java.util.Scanner;

public class TesteProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Coloque os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Preço: ");
		double price = sc.nextDouble();

		System.out.print("Quantidade no estoque: ");
		int quantity = sc.nextInt();

		Product p = new Product(name, price, quantity);

		System.out.println();
		System.out.println("Dados do produto: " + p);

		System.out.println();
		System.out.print("Coloque o número de produtos para adicionar no estoque: ");
		quantity = sc.nextInt();
		p.addProducts(quantity);

		System.out.println();
		System.out.println("Dados do produto atualizados: " + p);

		System.out.println();
		System.out.print("Coloque o número de produtos para remover do estoque: ");
		quantity = sc.nextInt();
		p.removeProducts(quantity);

		System.out.println();
		System.out.println("Dados do produto atualizados: " + p);

		sc.close();
	}

}
