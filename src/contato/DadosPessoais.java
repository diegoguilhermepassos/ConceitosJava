package contato;

public class DadosPessoais {
	String nome;
	String telefone;
	String email;
	int idade;
	
	public DadosPessoais (String pNome, String pTelefone, String pEmail, int pIdade) {
		setDados(pNome, pTelefone, pEmail, pIdade);
	}
	
	public DadosPessoais () {
		
	}
	
	public String getDados() {
		String dados = "Nome:" + nome + ", Telefone:" +
				telefone + ", E-mail:" + email + ", Idade:" + idade + " anos";
		return dados;
	}
	public void setDados(String pNome, String pTelefone, String pEmail, int pIdade)	{
		nome = pNome;
		telefone = pTelefone;
		email = pEmail;
		idade = pIdade;
		
	}
	
}
