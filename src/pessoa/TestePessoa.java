package pessoa;

public class TestePessoa {
	public static void main(String[] args) {
		testeNormal();
	}

	public static void testeNormal() {
		System.out.println("===================Teste Normal===================");
		Pessoa pessoa1 = new Pessoa("Carla", 20);
		pessoa1.fazerAniversario();
		
		Pessoa pessoa2 = new Pessoa("Jos�", 58);
		pessoa2.fazerAniversario();

		System.out.println("Informa��es da:" + pessoa1.getPessoa());
		System.out.println("Informa��es do:" + pessoa2.getPessoa());
	}
}	


