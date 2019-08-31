package course;

import java.util.Locale;
import java.util.Scanner;

public class TesteBank {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();

		System.out.print("Enter a number account: ");
		bank.setNumberAccount(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter accout holder: ");
		bank.setNameAccount(sc.nextLine	());
		System.out.print("Is there an initial deposit (y/n)? ");
		bank.setYesNo(sc.nextLine());
		if (bank.getYesNo().equals("y")) {
			System.out.print("Enter initial deposit value: ");
			bank.setDinheiro(sc.nextDouble());
			System.out.println(bank.getDadosBankBalance());
		} else if (bank.getYesNo().equals("n")) {
			System.out.println(bank.getDadosBank());
		}
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		bank.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.print(bank.getDadosBankBalance());
		
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		bank.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.print(bank.getDadosBankBalance());
		
		sc.close();
	}
}
