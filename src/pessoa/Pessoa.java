package pessoa;

public class Pessoa {
	String nome;
	int idade;

	public Pessoa (String pNome, int pIdade) {
		setPessoa(pNome, pIdade);
	}
	
	public Pessoa () {
		
	}
	
	public String getPessoa () {
		String dados = "Nome da pessoa:" + nome + ", Idade da pessoa:" + idade;
		return dados;
	}
	
	public void setPessoa (String pNome, int pIdade) {
		idade = pIdade;
		nome = pNome;
	}
	
	public void fazerAniversario () {
		idade++;
	}
	
}
