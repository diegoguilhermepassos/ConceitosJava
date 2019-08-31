package conceito;

public class Matrizes {

	public static void main(String[] args) {
		int[] arrayInt = new int[5];
		String[] arrayString = new String[10];
		System.out.println("Preenchendo Int");
		for (int x = 0; x < arrayInt.length; x++) {
			arrayInt[x] = x;
		}

		System.out.println("Preenchendo Str");
		for (int x = 0; x < arrayString.length; x++) {
			arrayString[x] = "" + x;
		}

		System.out.println("Lendo Int");
		for (int x = 0; x < arrayInt.length; x++) {
			System.out.print(arrayInt[x]);
		}

		System.out.println("\nLendo Str");
		for (int x = 0; x < arrayString.length; x++) {
			System.out.print(arrayString[x]);
		}

		System.out.println("Matriz");
		int[][] matrizInt = new int[10][10];

		System.out.println("Preenchendo Matrix Int");
		for (int x = 0; x < matrizInt.length; x++) {
			for (int y = 0; y < matrizInt.length; y++) {
				matrizInt[x][y] = x;
			}
		}

		System.out.println("Lendo Matrix Int");
		for (int x = 0; x < matrizInt.length; x++) {
			for (int y = 0; y < matrizInt.length; y++) {
				System.out.print(" " + matrizInt[x][y]);
			}
			System.out.println();
		}

		int linhas = 10;
		int colunas = 10;
		System.out.println("Matriz");
		String[][] matrizString = new String[linhas][colunas];

		System.out.println("Preenchendo Matrix String");
		for (int x = 0; x < linhas; x++) {
			for (int y = 0; y < colunas; y++) {
				matrizString[x][y] = "" + x + "" + y;
			}
		}

		System.out.println("Lendo Matrix String");
		for (int x = 0; x < linhas; x++) {
			for (int y = 0; y < colunas; y++) {
				if (x == y) {
					System.out.print(" (" + matrizString[x][y]+")");
				} else {
					System.out.print(" " + matrizString[x][y]);
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
}
