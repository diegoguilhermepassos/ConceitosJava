package jogo;

public class Fase {
	Jogador jogador;
	Missao missao;
	int numeroFase;
	boolean concluida;

	public Fase (Jogador jogador, Missao missao, int numeroFase, boolean concluida) {
		this.jogador = jogador;
		this.missao = missao;
		this.numeroFase = numeroFase;
		this.concluida = concluida;
	}
	
	public Fase () {
		
	}
	
	public String getDadosFase() {		
		String dadosFase = jogador.getDadosJogador()+", "+missao.getMissaoDados()+
				", Numero Fase: "+numeroFase+", Concluida:"+concluida;
		return dadosFase;
	}
}
	
