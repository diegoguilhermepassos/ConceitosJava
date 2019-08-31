package campeonato;

public class Carro {
	int potencia;
	int estabilidade;
	int velocidadeMax;
	Acessorios acessorios;

	public Carro (int pPotencia, int pEstabilidade, int pVelocidadeMax, Acessorios acessorios) {
		setCarro(pPotencia, pEstabilidade, pVelocidadeMax);
		this.acessorios = acessorios;
	}

	public Carro () {
	
	}
	
	public String getCarro() {
		String dados = "Potencia:" + potencia + ", Estabilidade:" +
				estabilidade + ", Velocidade Máxima:" + velocidadeMax + ", Acessórios:" + acessorios.getAcessorios();
		return dados;
	}
	
	public void setCarro(int pPotencia, int pEstabilidade, int pVelocidadeMax)	{
		potencia = pPotencia;
		estabilidade = pEstabilidade;
		velocidadeMax = pVelocidadeMax;
	}
}
