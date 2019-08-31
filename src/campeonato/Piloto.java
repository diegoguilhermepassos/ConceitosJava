package campeonato;

public class Piloto {
	String nome;
	int nivelHabilidade;
	int vitorias;

	public Piloto (String pNome, int pNivelHabilidade, int pVitorias) {
		setPiloto(pNome, pNivelHabilidade, pVitorias);
	}

	public Piloto () {
	
	}
	
	public String getPiloto() {
		String dados = "Nome do piloto:" + nome + ", N�vel de habilidade:" +
				nivelHabilidade + ", Vit�rias:" + vitorias;
		return dados;
	}
	
	public void setPiloto(String pNome, int pNivelHabilidade, int pVitorias)	{
		nome = pNome;
		nivelHabilidade = pNivelHabilidade;
		vitorias = pVitorias;
	}
}
