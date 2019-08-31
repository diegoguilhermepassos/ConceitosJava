package contato;

import java.util.Scanner;

public class TesteEndereco {
	public static void main(String[] args) {
//		testeSimplificado();
		testeCompleto();
	}

	public static void testeSimplificado() {
		System.out.println("=============Teste Simplificado=============");
		Endereco endereco1 = new Endereco();
		Endereco endereco2 = new Endereco();
		Endereco endereco3 = new Endereco();
		endereco1.setEndereco("50000", "Pacheco Melo", "Interlagos", "S�o Paulo", 50);
		endereco2.setEndereco("40000", "Zike Tuma", "Interlagos", "S�o Paulo", 67);
		endereco3.setEndereco("30000", "Sav�rio Mercadante", "Interlagos", "S�o Paulo", 133);
		System.out.println(endereco1.getEndereco());
		System.out.println("Dados do endere�o 2." + endereco2.getEndereco());
		System.out.println("Dados do endere�o 3." + endereco3.getEndereco());
	}

	public static void testeCompleto() {
		System.out.println("=============Teste Completo=============");
		Scanner sc = new Scanner(System.in);
		Endereco endereco1 = new Endereco();
		Endereco endereco2 = new Endereco();

		System.out.println("Digite os dados do seu endere�o :");
		
		System.out.print("Cep: ");
		endereco1.cep = sc.nextLine();
		System.out.print("Rua: ");
		endereco1.rua = sc.nextLine();
		System.out.print("Bairro: ");
		endereco1.bairro = sc.nextLine();
		System.out.print("Cidade: ");
		endereco1.cidade = sc.nextLine();
		System.out.print("N�mero da casa: ");
		endereco1.numeroCasa = sc.nextInt();

		System.out.println("Digite os dados do seu endere�o 2 :");

		System.out.print("Cep: ");
		endereco2.cep = sc.nextLine();
		System.out.print("Rua: ");
		endereco2.rua = sc.nextLine();
		System.out.print("Bairro: ");
		endereco2.bairro = sc.nextLine();
		System.out.print("Cidade: ");
		endereco2.cidade = sc.nextLine();
		System.out.print("N�mero da casa: ");
		endereco2.numeroCasa = sc.nextInt();

		System.out.println("Dados do endere�o 1." + endereco1.getEndereco());
		System.out.println("Dados do endere�o 2." + endereco2.getEndereco());

		sc.close();
	}
}
