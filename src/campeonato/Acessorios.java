package campeonato;

public class Acessorios {
	String nome;
	int valor;
	int pontos;

	public Acessorios (String pNome, int pValor, int pPontos) {
		setAcessorios(pNome, pValor, pPontos);
	}

	public Acessorios () {
		
	}

	public String getAcessorios () {
		String dados = "Nome do carro:" + nome + ", Valor do carro:" +
				valor + ", Pontos:" + pontos;
		return dados;
	}
	
	public void setAcessorios (String pNome, int pValor, int pPontos) {
		nome = pNome;
		valor = pValor;
		pontos = pPontos;
	}
	
}
