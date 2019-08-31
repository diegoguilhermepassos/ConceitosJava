package droid.tank;

import java.util.Scanner;

public class TesteArena {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Escolha a estrategia S - Simular A- Atualizar");
		String entrada = scanner.nextLine();

		if (entrada.equalsIgnoreCase("S")) {
			simularPosicoes();
		} else if (entrada.equalsIgnoreCase("A")) {
			atualizarPosicoes();
		}

		scanner.close();
	}

	private static void simularPosicoes() {
		System.out.println("Simulando posições");

		Arena arena = new Arena(10, 10);
		Tank tank1 = new Tank(5, 5);
		System.out.println("Tank1:" + tank1.getPosition());
		System.out.println(arena.arenaToString(tank1));

		String entrada = scanner.nextLine();

		while (!entrada.equals("")) {
			if (entrada.equalsIgnoreCase("W")) {
				if (arena.isDentro(tank1.simulateDescer())) {
					tank1.descer();
				}
			} else if (entrada.equalsIgnoreCase("S")) {
				if (arena.isDentro(tank1.simulateSubir())) {
					tank1.subir();
				}
			} else if (entrada.equalsIgnoreCase("D")) {
				if (arena.isDentro(tank1.simulateDireita())) {
					tank1.direita();
				}
			} else if (entrada.equalsIgnoreCase("A")) {
				if (arena.isDentro(tank1.simulateEsquerda())) {
					tank1.esquerda();
				}
			}

			System.out.println("Tank1:" + tank1.getPosition());
			System.out.println(arena.arenaToString(tank1));
			entrada = scanner.nextLine();
		}
	}

	private static void atualizarPosicoes() {

		System.out.println("Atualizaar posições");

		Arena arena = new Arena(11, 11);
		Tank tank1 = new Tank(5, 5);
		System.out.println("Tank1:" + tank1.getPosition());
		System.out.println(arena.arenaToString(tank1));

		String entrada = scanner.nextLine();

		while (!entrada.equals("")) {
			if (entrada.equalsIgnoreCase("W")) {
				tank1.descer();
			} else if (entrada.equalsIgnoreCase("S")) {
				tank1.subir();
			} else if (entrada.equalsIgnoreCase("D")) {
				tank1.direita();
			} else if (entrada.equalsIgnoreCase("A")) {
				tank1.esquerda();
			}

			if (arena.isDentro(tank1)) {
				tank1.atualizarPosicoes();
			} else {
				tank1.voltarPosicoes();
			}

			System.out.println("Tank1:" + tank1.getPosition());
			System.out.println(arena.arenaToString(tank1));
			entrada = scanner.nextLine();
		}
	}

	// criar uma escolha se quer usar simulacao ou desfazer movimento
}
