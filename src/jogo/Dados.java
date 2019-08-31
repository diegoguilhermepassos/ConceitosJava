package jogo;

public class Dados {
	String patente;
	int forca;
	int quantidadeVida;

	public Dados (String pPatente, int pForca, int pQuantidadeVida) {
		setDados(pPatente, pForca, pQuantidadeVida);
	}

	public Dados () {
	
	}
	
	public String getDados() {
		String dados = "Patente:" + patente + ", Força:" +
				forca + ", Quantidade de vida:" + quantidadeVida;
		return dados;
	}
	
	public void setDados(String pPatente, int pForca, int pQuantidadeVida)	{
		patente = pPatente;
		forca = pForca;
		quantidadeVida = pQuantidadeVida;
	}
}
