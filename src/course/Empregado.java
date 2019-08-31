package course;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void incrementarSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;

	}
}
