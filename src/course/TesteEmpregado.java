package course;

import java.util.Locale;
import java.util.Scanner;

public class TesteEmpregado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Empregado empregado = new Empregado();
		System.out.println("Nome: ");
		empregado.nome = sc.nextLine();
		System.out.println("Salário Bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		empregado.imposto = sc.nextDouble();
		System.out.println("Empregado: " + empregado.nome + ", $ " + empregado.salarioLiquido());

		System.out.println("Quantos porcentos você quer incrementar no seu salário? ");
		empregado.incrementarSalario(sc.nextDouble());

		System.out.println("Dados atualizados: " + empregado.nome + ", $ " + empregado.salarioLiquido());

		sc.close();

	}

}
