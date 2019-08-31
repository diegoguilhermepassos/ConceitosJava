package campeonato;

public class Corrida {
	Carro carro;
	Piloto piloto;
	Pista pista;
	String nome;
	int voltas;
	
	public Corrida (Carro carro, Piloto piloto, Pista pista, String nome, int voltas) {
		this.carro = carro;
		this.piloto = piloto;
		this.pista = pista;
		this.nome = nome;
		this.voltas = voltas;
	}
	
	public Corrida () {
		
	}
	
	public String getDadosCorrida() {
		String dadosCorrida = carro.getCarro()+ ", " + piloto.getPiloto() + ", " + pista.getPista() + 
				", Nome da Corrida:" + nome + ", Voltas:" + voltas;
		return dadosCorrida;
	}
}




