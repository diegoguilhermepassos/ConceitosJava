package contato;

public class Endereco {
	String cep;
	String rua;
	String bairro;
	String cidade;
	int numeroCasa;
	
	public Endereco(String nCep, String nRua, String nBairro, String nCidade, int nNumeroCasa) {
		setEndereco(nCep, nRua, nBairro, nCidade, nNumeroCasa);
	}
	
	public Endereco() {
		
	}
	
	public String getEndereco() {
		String enderecos = "Cep:" + cep + ", Rua:" + rua + ", Bairro:" + bairro 
				+ ", Cidade:" + cidade +", Número da Casa:" + numeroCasa;
		return enderecos;	
	}
	public void setEndereco(String nCep, String nRua, String nBairro, String nCidade, int nNumeroCasa) {
		cep = nCep;
		rua = nRua;
		bairro = nBairro;
		cidade = nCidade;
		numeroCasa = nNumeroCasa;
				
		
	}
}