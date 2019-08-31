package teste;

public class TesteConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.creditar(0);
		System.out.println("Saldo:"+ c.getSaldo());
		c.debitar(0);
		System.out.println("Saldo:"+ c.getSaldo());
		
		Conta c1 = new Conta();
		System.out.println("SaldoC1: "+ c.getSaldo()+" Saldo C2: "+c1.getSaldo());
		c.transferir(c, 5.50);		
		System.out.println("SaldoC1: "+ c.getSaldo()+" Saldo C2: "+c1.getSaldo());
		c.transferir(c1, 5.50);
		c.ifNegativo();
		System.out.println("SaldoC1: " + c.getSaldo() + " Saldo C2: " + c1.getSaldo());
		c1.ifNegativo();
	}
}
