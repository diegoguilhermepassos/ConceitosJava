package campeonato;

public class Pista {
	String nome;
	String nivelDificuldade;
	int tamanho;

	public Pista (String pNome, String pNivelDificuldade, int pTamanho) {
		setPista(pNome, pNivelDificuldade, pTamanho);
	}

	public Pista () {
	
	}
	
	public String getPista() {
		String dados = "Nome da pista:" + nome + ", Nível de dificuldade:" +
				nivelDificuldade + ", Tamanho da pista:" + tamanho;
		return dados;
	}
	
	public void setPista(String pNome, String pNivelDificuldade, int pTamanho)	{
		nome = pNome;
		nivelDificuldade = pNivelDificuldade;
		tamanho = pTamanho;
	}

}
