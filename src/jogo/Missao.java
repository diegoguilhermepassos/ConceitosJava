package jogo;

public class Missao {
	String nome;
	String nivelDificuldade;
	String nomeMapa;
	
	public Missao (String pNome, String pNivelDificuldade, String pNomeMapa) {
		setMissaoDados(pNome, pNivelDificuldade, pNomeMapa);
	}

	public Missao () {
	
	}
	
	public String getMissaoDados() {
		String dados = "Nome da Missão:" + nome + ", Nivel de Dificuldade:" +
				nivelDificuldade + ", Nome do Mapa:" + nomeMapa;
		return dados;
	}
	
	public void setMissaoDados(String pNome, String pNivelDificuldade, String pNomeMapa)	{
		nome = pNome;
		nivelDificuldade = pNivelDificuldade;
		nomeMapa = pNomeMapa;
	}
}
