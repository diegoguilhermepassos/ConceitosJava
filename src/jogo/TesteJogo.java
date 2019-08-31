package jogo;

public class TesteJogo {
	public static void main(String[] args) {
		testeNormal();
	}

	public static void testeNormal() {
		System.out.println("===================Teste Normal===================");
		Arma arma = new Arma(1000, "ARMA1", 10);
		Dados dados = new Dados("P1", 300 ,100);
		Jogador jogador = new Jogador(arma, dados);
		Missao missao = new Missao("M1", "LEVE", "Mapa1");
		Fase fase = new Fase(jogador, missao, 1,false);
		System.out.println("Dados da Fase: "+fase.getDadosFase());
	}
}	
	

