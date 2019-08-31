package contato;

public class Contato {
	DadosPessoais dadosPessoais;
	Endereco endereco;
	
	public Contato(DadosPessoais pDadosPessoais, Endereco pEndereco) {
		setDados(pDadosPessoais, pEndereco);
	}
	
	public Contato() {
		
	}
	
	public String getDados() {
		String dados = dadosPessoais.getDados() + " " + endereco.getEndereco();
		return dados;
	}
	public void setDados(DadosPessoais pDadosPessoais, Endereco pEndereco) {
		dadosPessoais = pDadosPessoais;
		endereco = pEndereco;
	}
}

