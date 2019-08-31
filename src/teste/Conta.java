package teste;

public class Conta {
	String numero;
	double saldo;

	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		saldo = saldo - valor;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
		
	public void transferir(Conta contaDestino, double valor) {
		this.debitar(valor);
		contaDestino.creditar(valor);
	}

	public boolean ifNegativo () {
		if(this.saldo < 0) {
			System.out.println("Não pode número negativo");
			return false;
		}
		return true;
	}
	
}