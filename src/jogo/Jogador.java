package jogo;

public class Jogador {
	Arma arma;
	Dados dados;
	
	public Jogador() {
		
	}
	
	public Jogador(Arma pArma , Dados pDados) {
		arma = pArma;
		dados = pDados;
	}
	
	public String getDadosJogador() {
		return arma.getArmas() + " "+ dados.getDados();
	}
}
