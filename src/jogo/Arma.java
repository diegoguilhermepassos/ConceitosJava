package jogo;

public class Arma {
	
	int quantidadeTiro;
	String nome;
	int poderTiro;


	public Arma (int pQuantidadeTiro, String pNome, int pPoderTiro) {
		setArmas(pQuantidadeTiro, pNome, pPoderTiro);
	}

	public Arma () {
	
	}
	
	public String getArmas() {
		String dados = "Quantidade de tiro:" + quantidadeTiro + ", Nome da Arma:" +
				nome + ", Poder de Tiro:" + poderTiro;
		return dados;
	}
	
	public void setArmas(int pQuantidadeTiro, String pNome, int pPoderTiro)	{
		quantidadeTiro = pQuantidadeTiro;
		nome = pNome;
		poderTiro = pPoderTiro;
	}
}

