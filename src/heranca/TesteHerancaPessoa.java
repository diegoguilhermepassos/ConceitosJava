package heranca;

public class TesteHerancaPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
//		p.setIdade(12);
//		p.setNome("Diego");
		System.out.println("Idade "+p.getIdade()+" Nome "+p.getNome());
		
		p.setNome("Jose");
		p.setIdade(10);
		System.out.println("Idade "+p.getIdade()+" Nome "+p.getNome());
		
		Pessoa p1 = new Pessoa();
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		PessoaFisica pf1 = new PessoaFisica();
		pf.setCpf("123456789");
		pj.setCnpj("123123123123");
		p1.setIdade(10);
		pf1.setCpf("232.312.123-54");
		pf1.setIdade(23);
		pf1.setNome("Diego");
		System.out.println("Nome: " + pf1.getNome() + ", Idade: " + pf1.getIdade() + ", Cpf: " + pf1.getCpf());	
	}
	
}
