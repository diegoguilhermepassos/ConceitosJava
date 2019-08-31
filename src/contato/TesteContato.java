package contato;

public class TesteContato {
	public static void main(String[] args) {
		testeCompleto();
		testeSimplificado();
		testeMaisSimples();
	}
	
	public static void testeMaisSimples ()  {
		System.out.println("=============Teste Mais Simples=============");
		DadosPessoais dadosPessoais1 = new DadosPessoais("Diego", "123", "diego@gmail.com", 12);
		Endereco endereco1 = new Endereco("12444","Zike Tuma", "Interlagos", "São Paulo", 12);
		Contato contato1 =  new Contato(dadosPessoais1, endereco1);
		System.out.println(contato1.getDados());
	}
	
	
	public static void testeSimplificado() {
		System.out.println("=============Teste Simplificado=============");
		Contato contatoEndereco1 = new Contato();
		Contato contatoEndereco2 = new Contato();
		Contato contatoEndereco3 = new Contato();
		
		Endereco endereco1 = new Endereco();
		Endereco endereco2= new Endereco();
		Endereco endereco3 = new Endereco();
		
		endereco1.setEndereco("50000", "Pacheco Melo", "Interlagos", "São Paulo", 50);
		endereco2.setEndereco("40000", "Zike Tuma", "Interlagos", "São Paulo", 67);
		endereco3.setEndereco("30000", "Savério Mercadante", "Interlagos", "São Paulo", 133);
		DadosPessoais dadosPessoais1 = new DadosPessoais();
		DadosPessoais dadosPessoais2 = new DadosPessoais();
		DadosPessoais dadosPessoais3 = new DadosPessoais();
		dadosPessoais1.setDados("Diego", "99999999", "diego@gmail.com", 14);
		dadosPessoais2.setDados("camila", "99929999", "camila@gmail.com", 7);
		dadosPessoais3.setDados("Clarisse", "91299999", "clarisse@gmail.com", 5);
		contatoEndereco1.setDados(dadosPessoais1, endereco1);
		contatoEndereco2.setDados(dadosPessoais2, endereco2);
		contatoEndereco3.setDados(dadosPessoais3, endereco3);
		
		System.out.println("Dados do contato 1. " + contatoEndereco1.getDados());
		System.out.println("Dados do contato 2. " + contatoEndereco2.getDados());
		System.out.println("Dados do contato 3. " + contatoEndereco3.getDados());
	}
	
	public static void testeCompleto() {
		System.out.println("=============Teste Completo=============");
		
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		Contato contato3 = new Contato();
		contato1.dadosPessoais = new DadosPessoais();
		contato2.dadosPessoais = new DadosPessoais();
		contato3.dadosPessoais = new DadosPessoais();
		
		contato1.dadosPessoais.nome = "Diego";
		contato1.dadosPessoais.telefone = "945493966";
		contato1.dadosPessoais.email = "diego@gmail.com";
		contato1.dadosPessoais.idade = 14;
		
		contato2.dadosPessoais.nome = "Camila";
		contato2.dadosPessoais.telefone = "912345678";
		contato2.dadosPessoais.email = "camila@gmail.com";
		contato2.dadosPessoais.idade = 7;
		
		contato3.dadosPessoais.nome = "Clarisse";
		contato3.dadosPessoais.telefone = "888888888";
		contato3.dadosPessoais.email = "clarisse@gmail.com";
		contato3.dadosPessoais.idade = 5;
		
		contato1.endereco = new Endereco();
		contato2.endereco = new Endereco();
		contato3.endereco = new Endereco();
		
		contato1.endereco.cep = "50000";
		contato1.endereco.rua = "Pacheco Melo";
		contato1.endereco.bairro = "Interlagos";
		contato1.endereco.cidade = "São Paulo";
		contato1.endereco.numeroCasa = 50;
		
		contato2.endereco.cep = "40000";
		contato2.endereco.rua = "Zike Tuma";
		contato2.endereco.bairro = "Interlagos";
		contato2.endereco.cidade = "São Paulo";
		contato2.endereco.numeroCasa = 67;
		
		contato3.endereco.cep = "30000";
		contato3.endereco.rua = "Savério Mercadante";
		contato3.endereco.bairro = "Interlagos";
		contato3.endereco.cidade = "São Paulo";
		contato3.endereco.numeroCasa = 133;
		
		System.out.println("Dados do contato 1." + contato1.getDados());
	}
}
