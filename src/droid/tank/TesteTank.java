package droid.tank;

import java.util.Scanner;

public class TesteTank {
	public static void main(String[] args) {
//		testeNormal();
		entradaUsuario();
	}

	public static void testeNormal() {
		System.out.println("===================Teste Normal===================");
		Tank tank1 = new Tank(40, 10);
		Tank tank2 = new Tank(30, 50);
		System.out.println("Tank1:" + tank1.getPosition());
		System.out.println("Tank2:" + tank2.getPosition());

		tank1.subir();
		tank2.descer();

		System.out.println("Tank1:" + tank1.getPosition());
		System.out.println("Tank2:" + tank2.getPosition());

		tank1.direita();
		tank2.esquerda();

		System.out.println("Tank1:" + tank1.getPosition());
		System.out.println("Tank2:" + tank2.getPosition());
	}

	public static void entradaUsuario() {
		Tank tank1 = new Tank(0, 0);
		Tank tank2 = new Tank(0, 0);

		Scanner scanner = new Scanner(System.in);

		String entrada = scanner.nextLine();
		while (!entrada.equals("")) {
			if (entrada.equalsIgnoreCase("W")) {
				tank1.subir();
			} else if (entrada.equalsIgnoreCase("S")) {
				tank1.descer();

			} else if (entrada.equalsIgnoreCase("D")) {
				tank1.direita();

			} else if (entrada.equalsIgnoreCase("A")) {
				tank1.esquerda();

			} else if (entrada.equalsIgnoreCase("I")) {
				tank2.subir();

			} else if (entrada.equalsIgnoreCase("K")) {
				tank2.descer();

			} else if (entrada.equalsIgnoreCase("L")) {
				tank2.direita();

			} else if (entrada.equalsIgnoreCase("J")) {
				tank2.esquerda();
			}
			System.out.println("Tank1:" + tank1.getPosition());
			System.out.println("Tank2:" + tank2.getPosition());
			entrada = scanner.nextLine();

		}
		scanner.close();
	}
}
