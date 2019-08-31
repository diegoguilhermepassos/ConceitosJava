package campeonato;

public class Campeonato {
	Corrida corrida;
	int ano;
	int numEdicao;
	int numCorridas;

	public Campeonato (Corrida corrida, int ano, int numEdicao, int numCorridas) {
		this.corrida = corrida;
		this.ano = ano;
		this.numEdicao = numEdicao;
		this.numCorridas = numCorridas;
	}
	
	public Campeonato () {
		
	}
			
	public String getDadosCampeonato () {
		String dados = corrida.getDadosCorrida() + ", Ano:" + ano + ", Número da Edição:" + numEdicao 
				+ ", Número de corridas:" + numCorridas;
		return dados;
	}
	
}
