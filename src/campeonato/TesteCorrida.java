package campeonato;

public class TesteCorrida {
	public static void main(String[] args) {
		testeNormal();
		testeNormal2();
	}

	public static void testeNormal () {
		System.out.println("===================Teste Normal===================");
		Acessorios acessorios = new Acessorios ("Honda", 3000, 200);
		Carro carro = new Carro (530, 50 , 100, acessorios);
		Piloto piloto = new Piloto ("Diego", 5 , 4);
		Pista pista = new Pista ("Pista 1" , "Médio" , 400);
		Corrida corrida = new Corrida(carro, piloto, pista, "States", 20);
		Campeonato campeonato = new Campeonato(corrida, 2014, 24, 100);
		System.out.println("Dados do campeonato:" +campeonato.getDadosCampeonato());
	}
	public static void testeNormal2() {
		System.out.println("==================Teste Entrada Dados======================");
		Acessorios acessorio = new Acessorios("Ford", 3023, 20);
		Carro carro = new Carro(530, 23, 100, acessorio);
		Piloto piloto = new Piloto("David",5,4);
		Pista pista = new Pista("Pista de corrida", "Fácil", 240);
		Corrida corrida = new Corrida(carro, piloto, pista, "States", 10);
		Campeonato campeonato = new Campeonato(corrida, 2015, 24, 100);
		System.out.println("Dados do campeonato: " + campeonato.getDadosCampeonato());
		
	}
}
